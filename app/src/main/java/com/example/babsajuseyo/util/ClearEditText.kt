package com.example.babsajuseyo.util

import android.content.Context
import android.graphics.drawable.Drawable
import android.text.Editable
import android.text.TextWatcher
import android.util.AttributeSet
import android.view.MotionEvent
import android.view.View
import androidx.appcompat.widget.AppCompatEditText
import androidx.core.content.ContextCompat
import androidx.core.graphics.drawable.DrawableCompat
import com.example.babsajuseyo.R
import io.reactivex.subjects.PublishSubject


// AppCompatEditText에는 기본 생성자가 없기 때문에 아래와 같이 써주면 안된다. 아래와 같은 문법은 기본 생성자를 call해주는 문법.
// 상속시에 super class의 생성자를 호출해줘야 함.
// https://stackoverflow.com/questions/44244700/kotlin-this-type-has-a-constructor-and-thus-must-be-initialized-here-but-no
// https://medium.com/@sket8993/kotlin-생성자-초간단-이해하기-b8a61df6fe6
//class ClearEditText : AppCompatEditText() {

class ClearEditText : AppCompatEditText, TextWatcher, View.OnTouchListener, View.OnFocusChangeListener {

    private lateinit var clearDrawble: Drawable
    private  var focusChangeListener: OnFocusChangeListener? = null
    private  var touchListener: OnTouchListener? = null

    constructor(context: Context) : super(context){
        init()
    }

    constructor(context: Context, attrs: AttributeSet) : super(context,attrs){
        init()
    }

    constructor(context: Context, attrs: AttributeSet, defStyleAttr: Int) : super(context,attrs,defStyleAttr){
        init()
    }

    private fun init(){
        val tempDrawable = ContextCompat.getDrawable(context,
            R.drawable.abc_ic_clear_material
        ) // x 이미지 불러오기
        tempDrawable?.let {
            clearDrawble = DrawableCompat.wrap(it) // 버전 호환
            DrawableCompat.setTintList(clearDrawble,hintTextColors) // hint 색깔에 맞춰서 이미지 색 설정
            clearDrawble.setBounds(0,0,clearDrawble.intrinsicWidth,clearDrawble.intrinsicWidth)// 크기
            setClearIconVisible(false)

            // setOnTouchListener, setOnFocusChangeListener는 내가 overriding해준게 있으므로 여기선 super method call.
            addTextChangedListener(this)
            super.setOnTouchListener(this)
            super.setOnFocusChangeListener(this)
        }
        //TODO: 질문2. inflate하는 순간 터지는데 이유가 뭘까?
//        val inflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
//        view = inflater.inflate(R.layout.activity_phone_number,null)
    }

    // x표시 보여줄지 말지
    private fun setClearIconVisible(visible: Boolean){
        clearDrawble.setVisible(visible,false) // visible은 보여줄지 말지, restart는 animation 효과.
        if(visible){ // editText 오른쪽에 x표시 배치
            setCompoundDrawables(null,null,clearDrawble,null)
        } else{
            setCompoundDrawables(null,null,null,null)
        }
    }


    // text 길이에 따라 x 보이기
    // TextWatcher // textChangeListener
    override fun onTextChanged(text: CharSequence?, start: Int, lengthBefore: Int, lengthAfter: Int) {
        super.onTextChanged(text, start, lengthBefore, lengthAfter)
        if(isFocused) {
            // focus가 있고 null이 아닌 경우
            text?.length?.let {
                // 길이가 0보다 길면 x 보여주고 버튼 아이콘 활성화
                if(it > 0){
                    setClearIconVisible(true)
                } else{ // 그 외의 경우 x 지우고 버튼 비활성화
                    setClearIconVisible(false)
                }
            }
        }
    }

    override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
    }

    override fun afterTextChanged(p0: Editable?) {
    }

    // x버튼 눌릴시 텍스트 초기화
    // 기본적인 touchListener
    override fun onTouch(view: View?, motionEvent: MotionEvent?): Boolean {
        val x: Float? = motionEvent?.x // 눌린 위치의 x 값
        x?.let {x ->
            if(clearDrawble.isVisible && x > width - paddingRight - clearDrawble.intrinsicWidth){ // x표시가 보이는 상태 && x가 클릭된 상태 // 식은 잘 모르곘음..
                if(motionEvent.action == MotionEvent.ACTION_UP){ // 눌렀다 떼는 동작
                    error = null // text error가 있을 경우 null
                    text = null // text null
                }
                return true
            }
        }
        // ClearEditText에서 x표시 말고 터치되는 경우.
        // 터치 리스너가 setOnTouchListener로추가된 경우. 터치 리스너의 onTouch로 touch값 넘겨준다.
        touchListener?.let{
            return it.onTouch(view, motionEvent)
        }
        return false
    }

    // focus 변화시
    override fun onFocusChange(view: View?, hasFocus: Boolean) {
        if(hasFocus){ // focus가 있는 경우 + 길이 0 기준으로 true,false
            text?.let { setClearIconVisible(it.length > 0) }
        } else{
            setClearIconVisible(false)
        }
        // 추가로 정의한 listener가 있다면 실행
        focusChangeListener?.onFocusChange(view,hasFocus)

    }

    // clearEditText에 touchListener 추가
    // x touch시에는 위에서 정의한거 동작, 다른거 touch시에는 if문에 안 걸리므로 return touchListener.onTouch(view,motionEvent)가 동작.
    override fun setOnTouchListener(l: OnTouchListener?) {
        touchListener = l
    }

    // clearEditText에 focusChangeLister 추가
    // onFocusChange()에서 x에 관한 동작을 해주고, 여기에 지정한 listener가 추가 동작
    override fun setOnFocusChangeListener(l: OnFocusChangeListener?) {
        focusChangeListener = l
    }
}