package com.example.babsajuseyo.searchSchool;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u00a8\u0006\u0004"}, d2 = {"Lcom/example/babsajuseyo/searchSchool/SearchSchoolContract;", "", "Presenter", "View", "app_debug"})
public abstract interface SearchSchoolContract {
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&\u00a8\u0006\u0007"}, d2 = {"Lcom/example/babsajuseyo/searchSchool/SearchSchoolContract$View;", "", "showNearbyRestaurant", "", "data", "", "Lcom/example/babsajuseyo/entity/RestaurantData;", "app_debug"})
    public static abstract interface View {
        
        public abstract void showNearbyRestaurant(@org.jetbrains.annotations.NotNull()
        java.util.List<com.example.babsajuseyo.entity.RestaurantData> data);
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/example/babsajuseyo/searchSchool/SearchSchoolContract$Presenter;", "", "loadNearbyRestaurant", "", "searchText", "", "app_debug"})
    public static abstract interface Presenter {
        
        public abstract void loadNearbyRestaurant(@org.jetbrains.annotations.NotNull()
        java.lang.String searchText);
    }
}