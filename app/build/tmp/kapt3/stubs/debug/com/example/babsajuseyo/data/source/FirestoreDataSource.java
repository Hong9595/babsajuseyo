package com.example.babsajuseyo.data.source;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\"\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0012\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\nJ\u001a\u0010\r\u001a\u00020\u00062\u0012\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\nR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lcom/example/babsajuseyo/data/source/FirestoreDataSource;", "", "()V", "db", "Lcom/google/firebase/firestore/FirebaseFirestore;", "getNearbySchoolRestaurant", "", "searchText", "", "emitter", "Lio/reactivex/SingleEmitter;", "", "Lcom/example/babsajuseyo/entity/RestaurantData;", "getRestaurantData", "app_debug"})
public final class FirestoreDataSource {
    private final com.google.firebase.firestore.FirebaseFirestore db = null;
    
    public final void getRestaurantData(@org.jetbrains.annotations.NotNull()
    io.reactivex.SingleEmitter<java.util.List<com.example.babsajuseyo.entity.RestaurantData>> emitter) {
    }
    
    public final void getNearbySchoolRestaurant(@org.jetbrains.annotations.NotNull()
    java.lang.String searchText, @org.jetbrains.annotations.NotNull()
    io.reactivex.SingleEmitter<java.util.List<com.example.babsajuseyo.entity.RestaurantData>> emitter) {
    }
    
    public FirestoreDataSource() {
        super();
    }
}