package com.example.babsajuseyo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.example.babsajuseyo.entity.RestaurantData
import com.example.babsajuseyo.restaurantList.RestaurantListActivity
import com.example.babsajuseyo.util.Constants
import com.google.firebase.firestore.FirebaseFirestore
import io.reactivex.Observable
import io.reactivex.Single
import io.reactivex.SingleSource
import kotlinx.android.synthetic.main.activity_main.*
import org.apache.poi.hssf.usermodel.HSSFCell
import org.apache.poi.hssf.usermodel.HSSFRow
import org.apache.poi.hssf.usermodel.HSSFWorkbook
import org.apache.poi.poifs.filesystem.POIFSFileSystem
import timber.log.Timber
import java.io.InputStream
import java.util.*

/**
 *
 */
class MainActivity : AppCompatActivity() {

    // api 바꾸고
    // 2. 화면 만들어주고
    // 3. 클릭하면 디테일
    private var items: MutableList<RestaurantData> = mutableListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tempBtn.setOnClickListener { view ->
            val intent = Intent(this,RestaurantListActivity::class.java)
            startActivity(intent)
        }
//        readExcelFileFromAssets()
//        putExcelData()
    }
    private fun readExcelFileFromAssets() {
        try {
            val myInput: InputStream
            // assetManager 초기 설정
            val assetManager = assets
            //  엑셀 시트 열기
            myInput = assetManager.open("songpa.xls")
            // POI File System 객체 만들기
            //OPCPackage
            val myFileSystem = POIFSFileSystem(myInput)
            //워크 북
            val myWorkBook = HSSFWorkbook(myFileSystem)
            // 워크북에서 시트 가져오기
            val sheet = myWorkBook.getSheetAt(0)

            //행을 반복할 변수 만들어주기
            val rowIter = sheet.rowIterator()
            //행 넘버 변수 만들기
            var rowno = 0



            //행 반복문
            // rowno가 0 일때는 제목이므로 데이터 안 넣고 넘겨버림. 따라서 301번 반복해야 데이터 300개 들어감.
            for(i in 0..Constants.RESTAURANT_DATA_NUM) {
//            while (rowIter.hasNext()) {
                val myRow = rowIter.next() as HSSFRow
                if (rowno != 0) {
                    //열을 반복할 변수 만들어주기
                    val cellIter = myRow.cellIterator()
                    //열 넘버 변수 만들기
                    var colno = 0
                    var imageUrl = ""
                    var title = ""
                    var address = ""
                    //열 반복문
                    while (cellIter.hasNext()) {
                        val myCell = cellIter.next() as HSSFCell
                        if (colno == 0) {
                            imageUrl = myCell.toString()
                        } else if (colno == 1) {
                            address = myCell.toString()
                        } else if (colno == 2){
                            title = myCell.toString()
                        }
                        colno++
                    }
                    //4,8번째 열을 Mutablelist에 추가
                    items.add(RestaurantData(imageUrl, title, address))
                }
                rowno++
            }
            Timber.tag("CheckExcelFile").e("items:" + items)
//            Log.e("checking", " items: " + items)
        } catch (e: Exception) {
//            e.printStackTrace()
//            Timber.tag("CheckExcelFile").e(e.printStackTrace().toString())
            Toast.makeText(this, "에러 발생", Toast.LENGTH_LONG).show()
        }
    }

    fun putExcelData(){
        val db = FirebaseFirestore.getInstance()
        for(i in 0..Constants.RESTAURANT_DATA_NUM-1) {
            Timber.tag("CheckExcelFile").d(i.toString())
            val data = hashMapOf(
                "ImageUrl" to items[i].ImageUrl,
                "address" to items[i].address,
                "title" to items[i].title
            )
            db.collection("restaurant")
                .add(data)
                .addOnSuccessListener { documentReference->
                    Timber.d("DocumentSnapshot added with ID: ${documentReference.id}")

                }
                .addOnFailureListener{  exception ->
                    Timber.d("Error adding document")
                    Timber.e(exception)
                }
        }
    }

    fun putData(){
        val db = FirebaseFirestore.getInstance()
        val user = hashMapOf(
            "ImageUrl" to "https://image.tmdb.org/t/p/w300/kqjL17yufvn9OVLyXYpvtyrFfak.jpg",
            "address" to "서울시 송파구 송파동 51-2 106호",
            "title" to "차만다"
        )
        db.collection("restaurant")
            .add(user)
            .addOnSuccessListener { documentReference->
                Timber.d("DocumentSnapshot added with ID: ${documentReference.id}")

            }
            .addOnFailureListener{  exception ->
                Timber.d("Error adding document")
                Timber.e(exception)
            }

    }

}
