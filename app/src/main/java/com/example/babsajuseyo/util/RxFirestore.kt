package com.example.babsajuseyo.util

import androidx.annotation.NonNull
import com.example.babsajuseyo.entity.RestaurantData
import com.google.firebase.firestore.*
import io.reactivex.Maybe
import timber.log.Timber

class RxFirestore{
    companion object{
        // get()하면 Task<QuerySnapShot!>이 return.
        fun getCollection(@NonNull ref: CollectionReference): Maybe<QuerySnapshot> {
            return Maybe.create<QuerySnapshot> { emitter ->
                ref.get()
                    .addOnSuccessListener { result ->
                        if(result.isEmpty) {
                            emitter.onComplete()
                        } else {
                            emitter.onSuccess(result)
                        }
                    }
                    .addOnFailureListener {
                        //                        Timber.e(it)
                        emitter.onError(it)
                    }
            }
        }
        // get()하면 Task<QuerySnapShot!>이 return.
        fun getCollection(@NonNull query: Query): Maybe<QuerySnapshot>{
            return Maybe.create<QuerySnapshot> { emitter ->
                query.get()
                    .addOnSuccessListener { result ->
                        if(result.isEmpty){
                            emitter.onComplete()
                        } else {
                            emitter.onSuccess(result)
                        }
                    }
                    .addOnFailureListener {
                        emitter.onError(it)
                    }
            }
        }
    }

}