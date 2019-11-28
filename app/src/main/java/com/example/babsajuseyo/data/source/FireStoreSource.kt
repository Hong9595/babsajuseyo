package com.example.babsajuseyo.data.source

import android.annotation.SuppressLint
import com.example.babsajuseyo.entity.RestaurantData
import com.example.babsajuseyo.util.Constants
import com.google.firebase.firestore.FirebaseFirestore
import io.reactivex.SingleEmitter
import timber.log.Timber
import java.lang.ref.WeakReference

class FireStoreSource{

    //TODO: 질문3.FireStoreSource를 object로 했을때 발생했던 문제임..
    // FirebaseFirestore는 context를 가지고 있는데 static class(object)의 프로퍼티가 이를 참조하고 있으니(context를 가지므로) memory leak가 난다는 말인거 같음. 여기서는 어떻게 해결하지? // WeakReference?
    // + handler,runnable등을 non-static Inner class로 정의해두면 outer class(activity,fragment..등)을 ref하기 때문에 leak. 이럴 경우에 static정의 후 WeakReference를 사용한다고 함. gc되기 전까지 ref하다가 gc하면 null 반환. 여기선 그냥 에러
    // 여기서는 어떻게 적용을 해야 하지..
    // + SupressLint("StaticFieldLeak")가 있긴 한데 이거 해주면 미리 검사?? // Lint코드를 실행하여 테스트 빌드 없이 앱이 가지는 잠재적 문제를 발견할 수 있다고 하는데..
    // + FireStore가 가지는 context는 뭘까
    // + google architecture보면 FireStoreRepo는 object(Singleton)으로 만드는걸로 되어있는데 이건 그냥 하기나름?
    private val db = FirebaseFirestore.getInstance()

//    private val db: WeakReference<FirebaseFirestore> = FirebaseFirestore.getInstance() as WeakReference<FirebaseFirestore>
    fun getRestaurantData(emitter: SingleEmitter<List<RestaurantData>>) {

        db.collection(Constants.FIRESTORE_RESTAURANT).get()
            .addOnSuccessListener { result ->
                result
                    .map {
                        it.toObject(RestaurantData::class.java)
                    }
                    .let {
                        emitter.onSuccess(it)
                    }
            }
            .addOnFailureListener {
                Timber.e(it)
            }
//        db.get()?.collection(Constants.FIRESTORE_RESTAURANT)?.get()
//            ?.addOnSuccessListener { result ->
//                result
//                    .map {
//                        it.toObject(RestaurantData::class.java)
//                    }
//                    .let {
//                        emitter.onSuccess(it)
//                    }
//            }
//            ?.addOnFailureListener {
//                Timber.e(it)
//            }
    }
}