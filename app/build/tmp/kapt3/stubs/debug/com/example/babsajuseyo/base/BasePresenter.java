package com.example.babsajuseyo.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0016\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0013\u0010\u000f\u001a\u00020\u00102\u0006\u0010\t\u001a\u00028\u0000\u00a2\u0006\u0002\u0010\rJ\u0006\u0010\u0011\u001a\u00020\u0010R\u0014\u0010\u0004\u001a\u00020\u0005X\u0084\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R*\u0010\t\u001a\u0004\u0018\u00018\u00002\b\u0010\b\u001a\u0004\u0018\u00018\u0000@DX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u000e\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r\u00a8\u0006\u0012"}, d2 = {"Lcom/example/babsajuseyo/base/BasePresenter;", "T", "", "()V", "compositeDisposble", "Lio/reactivex/disposables/CompositeDisposable;", "getCompositeDisposble", "()Lio/reactivex/disposables/CompositeDisposable;", "<set-?>", "view", "getView", "()Ljava/lang/Object;", "setView", "(Ljava/lang/Object;)V", "Ljava/lang/Object;", "attachView", "", "detachView", "app_debug"})
public class BasePresenter<T extends java.lang.Object> {
    @org.jetbrains.annotations.Nullable()
    private T view;
    @org.jetbrains.annotations.NotNull()
    private final io.reactivex.disposables.CompositeDisposable compositeDisposble = null;
    
    @org.jetbrains.annotations.Nullable()
    public final T getView() {
        return null;
    }
    
    protected final void setView(@org.jetbrains.annotations.Nullable()
    T p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final io.reactivex.disposables.CompositeDisposable getCompositeDisposble() {
        return null;
    }
    
    public final void attachView(T view) {
    }
    
    public final void detachView() {
    }
    
    public BasePresenter() {
        super();
    }
}