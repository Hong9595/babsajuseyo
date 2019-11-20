package com.example.babsajuseyo.data.source;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0019\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R#\u0010\n\u001a\n \u0005*\u0004\u0018\u00010\u000b0\u000b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u001b\u0010\u0010\u001a\u00020\u00118FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0012\u0010\u0013\u00a8\u0006\u0015"}, d2 = {"Lcom/example/babsajuseyo/data/source/ApiManager;", "", "()V", "gson", "Lcom/google/gson/Gson;", "kotlin.jvm.PlatformType", "getGson", "()Lcom/google/gson/Gson;", "okHttpClientBuilder", "Lokhttp3/OkHttpClient$Builder;", "restaurantAdapter", "Lretrofit2/Retrofit;", "getRestaurantAdapter", "()Lretrofit2/Retrofit;", "restaurantAdapter$delegate", "Lkotlin/Lazy;", "restaurantApi", "Lcom/example/babsajuseyo/data/source/RestaurantApi;", "getRestaurantApi", "()Lcom/example/babsajuseyo/data/source/RestaurantApi;", "restaurantApi$delegate", "app_debug"})
public final class ApiManager {
    private static final com.google.gson.Gson gson = null;
    private static final okhttp3.OkHttpClient.Builder okHttpClientBuilder = null;
    private static final kotlin.Lazy restaurantAdapter$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private static final kotlin.Lazy restaurantApi$delegate = null;
    public static final com.example.babsajuseyo.data.source.ApiManager INSTANCE = null;
    
    public final com.google.gson.Gson getGson() {
        return null;
    }
    
    private final retrofit2.Retrofit getRestaurantAdapter() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.babsajuseyo.data.source.RestaurantApi getRestaurantApi() {
        return null;
    }
    
    private ApiManager() {
        super();
    }
}