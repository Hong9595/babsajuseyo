package com.example.babsajuseyo.restaurantList;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0010\u001a\u00020\u0011H\u0016R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u0012"}, d2 = {"Lcom/example/babsajuseyo/restaurantList/RestaurantPresenter;", "Lcom/example/babsajuseyo/base/BasePresenter;", "Lcom/example/babsajuseyo/restaurantList/RestaurantContractor$View;", "Lcom/example/babsajuseyo/restaurantList/RestaurantContractor$Presenter;", "()V", "fireStoreRepo", "Lcom/example/babsajuseyo/data/repository/FireStoreRepo;", "getFireStoreRepo", "()Lcom/example/babsajuseyo/data/repository/FireStoreRepo;", "fireStoreRepo$delegate", "Lkotlin/Lazy;", "restaurantRepo", "Lcom/example/babsajuseyo/data/repository/RestaurantRepo;", "getRestaurantRepo", "()Lcom/example/babsajuseyo/data/repository/RestaurantRepo;", "restaurantRepo$delegate", "loadRestaurantList", "", "app_debug"})
public final class RestaurantPresenter extends com.example.babsajuseyo.base.BasePresenter<com.example.babsajuseyo.restaurantList.RestaurantContractor.View> implements com.example.babsajuseyo.restaurantList.RestaurantContractor.Presenter {
    private final kotlin.Lazy restaurantRepo$delegate = null;
    private final kotlin.Lazy fireStoreRepo$delegate = null;
    
    private final com.example.babsajuseyo.data.repository.RestaurantRepo getRestaurantRepo() {
        return null;
    }
    
    private final com.example.babsajuseyo.data.repository.FireStoreRepo getFireStoreRepo() {
        return null;
    }
    
    @java.lang.Override()
    public void loadRestaurantList() {
    }
    
    public RestaurantPresenter() {
        super();
    }
}