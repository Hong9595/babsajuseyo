package com.example.babsajuseyo.data.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u001c\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\u0006\u0010\t\u001a\u00020\nH\u0016J\u0014\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/example/babsajuseyo/data/repository/FireStoreRepo;", "Lcom/example/babsajuseyo/data/FirestoreSource;", "()V", "firestoreDataSource", "Lcom/example/babsajuseyo/data/source/FirestoreDataSource;", "getNearbySchoolRestaurant", "Lio/reactivex/Maybe;", "", "Lcom/example/babsajuseyo/entity/RestaurantData;", "searchText", "", "getRestaurantData", "app_debug"})
public final class FireStoreRepo implements com.example.babsajuseyo.data.FirestoreSource {
    private final com.example.babsajuseyo.data.source.FirestoreDataSource firestoreDataSource = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Maybe<java.util.List<com.example.babsajuseyo.entity.RestaurantData>> getRestaurantData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Maybe<java.util.List<com.example.babsajuseyo.entity.RestaurantData>> getNearbySchoolRestaurant(@org.jetbrains.annotations.NotNull()
    java.lang.String searchText) {
        return null;
    }
    
    public FireStoreRepo() {
        super();
    }
}