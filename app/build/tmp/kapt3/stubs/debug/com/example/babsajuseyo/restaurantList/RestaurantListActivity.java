package com.example.babsajuseyo.restaurantList;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0006\u0010\u000f\u001a\u00020\u0010J\u0012\u0010\u0011\u001a\u00020\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0014J\b\u0010\u0014\u001a\u00020\u0010H\u0014J\u0016\u0010\u0015\u001a\u00020\u00102\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017H\u0016R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\f\u0010\r\u00a8\u0006\u0019"}, d2 = {"Lcom/example/babsajuseyo/restaurantList/RestaurantListActivity;", "Lcom/example/babsajuseyo/base/BaseActivity;", "Lcom/example/babsajuseyo/restaurantList/RestaurantContractor$View;", "()V", "presenter", "Lcom/example/babsajuseyo/restaurantList/RestaurantPresenter;", "getPresenter", "()Lcom/example/babsajuseyo/restaurantList/RestaurantPresenter;", "presenter$delegate", "Lkotlin/Lazy;", "restaurantAdapter", "Lcom/example/babsajuseyo/restaurantList/RestaurantListAdpater;", "getRestaurantAdapter", "()Lcom/example/babsajuseyo/restaurantList/RestaurantListAdpater;", "restaurantAdapter$delegate", "initView", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "showRestaurantData", "data", "", "Lcom/example/babsajuseyo/entity/RestaurantData;", "app_debug"})
public final class RestaurantListActivity extends com.example.babsajuseyo.base.BaseActivity implements com.example.babsajuseyo.restaurantList.RestaurantContractor.View {
    private final kotlin.Lazy presenter$delegate = null;
    private final kotlin.Lazy restaurantAdapter$delegate = null;
    private java.util.HashMap _$_findViewCache;
    
    private final com.example.babsajuseyo.restaurantList.RestaurantPresenter getPresenter() {
        return null;
    }
    
    private final com.example.babsajuseyo.restaurantList.RestaurantListAdpater getRestaurantAdapter() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    public final void initView() {
    }
    
    @java.lang.Override()
    public void showRestaurantData(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.babsajuseyo.entity.RestaurantData> data) {
    }
    
    @java.lang.Override()
    protected void onDestroy() {
    }
    
    public RestaurantListActivity() {
        super();
    }
}