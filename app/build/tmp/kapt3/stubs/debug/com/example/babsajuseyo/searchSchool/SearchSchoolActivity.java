package com.example.babsajuseyo.searchSchool;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0006\u0010\u000f\u001a\u00020\u0010J\u0012\u0010\u0011\u001a\u00020\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0014J\b\u0010\u0014\u001a\u00020\u0010H\u0014J\u0006\u0010\u0015\u001a\u00020\u0010J\u0016\u0010\u0016\u001a\u00020\u00102\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018H\u0016R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\f\u0010\r\u00a8\u0006\u001a"}, d2 = {"Lcom/example/babsajuseyo/searchSchool/SearchSchoolActivity;", "Lcom/example/babsajuseyo/base/BaseActivity;", "Lcom/example/babsajuseyo/searchSchool/SearchSchoolContract$View;", "()V", "searchRestaurantAdapter", "Lcom/example/babsajuseyo/restaurantList/RestaurantListAdpater;", "getSearchRestaurantAdapter", "()Lcom/example/babsajuseyo/restaurantList/RestaurantListAdpater;", "searchRestaurantAdapter$delegate", "Lkotlin/Lazy;", "searchSchoolPresenter", "Lcom/example/babsajuseyo/searchSchool/SearchSchoolPresenter;", "getSearchSchoolPresenter", "()Lcom/example/babsajuseyo/searchSchool/SearchSchoolPresenter;", "searchSchoolPresenter$delegate", "hideLoading", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "showLoading", "showNearbyRestaurant", "data", "", "Lcom/example/babsajuseyo/entity/RestaurantData;", "app_debug"})
public final class SearchSchoolActivity extends com.example.babsajuseyo.base.BaseActivity implements com.example.babsajuseyo.searchSchool.SearchSchoolContract.View {
    private final kotlin.Lazy searchSchoolPresenter$delegate = null;
    private final kotlin.Lazy searchRestaurantAdapter$delegate = null;
    private java.util.HashMap _$_findViewCache;
    
    private final com.example.babsajuseyo.searchSchool.SearchSchoolPresenter getSearchSchoolPresenter() {
        return null;
    }
    
    private final com.example.babsajuseyo.restaurantList.RestaurantListAdpater getSearchRestaurantAdapter() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    public final void showLoading() {
    }
    
    public final void hideLoading() {
    }
    
    @java.lang.Override()
    public void showNearbyRestaurant(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.babsajuseyo.entity.RestaurantData> data) {
    }
    
    @java.lang.Override()
    protected void onDestroy() {
    }
    
    public SearchSchoolActivity() {
        super();
    }
}