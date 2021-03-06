package com.example.babsajuseyo.data.source;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\'J,\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\b\u001a\u00020\u00062\b\b\u0001\u0010\t\u001a\u00020\nH\'\u00a8\u0006\u000b"}, d2 = {"Lcom/example/babsajuseyo/data/source/RestaurantApi;", "", "getConfiguration", "Lio/reactivex/Single;", "Lcom/google/gson/JsonElement;", "key", "", "getPlayingList", "language", "page", "", "app_debug"})
public abstract interface RestaurantApi {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "configuration")
    public abstract io.reactivex.Single<com.google.gson.JsonElement> getConfiguration(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "api_key")
    java.lang.String key);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "movie/now_playing")
    public abstract io.reactivex.Single<com.google.gson.JsonElement> getPlayingList(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "api_key")
    java.lang.String key, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "language")
    java.lang.String language, @retrofit2.http.Query(value = "page")
    int page);
}