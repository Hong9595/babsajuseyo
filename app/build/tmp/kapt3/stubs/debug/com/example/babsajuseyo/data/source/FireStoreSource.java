package com.example.babsajuseyo.data.source;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u001a\u0010\u0005\u001a\u00020\u00062\u0012\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/example/babsajuseyo/data/source/FireStoreSource;", "", "()V", "db", "Lcom/google/firebase/firestore/FirebaseFirestore;", "getRestaurantData", "", "emitter", "Lio/reactivex/SingleEmitter;", "", "Lcom/example/babsajuseyo/entity/RestaurantData;", "app_debug"})
public final class FireStoreSource {
    private final com.google.firebase.firestore.FirebaseFirestore db = null;
    
    public final void getRestaurantData(@org.jetbrains.annotations.NotNull()
    io.reactivex.SingleEmitter<java.util.List<com.example.babsajuseyo.entity.RestaurantData>> emitter) {
    }
    
    public FireStoreSource() {
        super();
    }
}