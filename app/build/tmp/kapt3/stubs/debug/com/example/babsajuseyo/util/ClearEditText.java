package com.example.babsajuseyo.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u000f\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007B\u0017\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nB\u001f\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\f\u00a2\u0006\u0002\u0010\rJ\u0012\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J*\u0010\u0016\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\fH\u0016J\b\u0010\u001b\u001a\u00020\u0013H\u0002J\u001a\u0010\u001c\u001a\u00020\u00132\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0016J*\u0010!\u001a\u00020\u00132\b\u0010\"\u001a\u0004\u0018\u00010\u00172\u0006\u0010#\u001a\u00020\f2\u0006\u0010$\u001a\u00020\f2\u0006\u0010%\u001a\u00020\fH\u0016J\u001c\u0010&\u001a\u00020 2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\b\u0010\'\u001a\u0004\u0018\u00010(H\u0016J\u0010\u0010)\u001a\u00020\u00132\u0006\u0010*\u001a\u00020 H\u0002J\u0012\u0010+\u001a\u00020\u00132\b\u0010,\u001a\u0004\u0018\u00010\u0004H\u0016J\u0012\u0010-\u001a\u00020\u00132\b\u0010,\u001a\u0004\u0018\u00010\u0003H\u0016R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006."}, d2 = {"Lcom/example/babsajuseyo/util/ClearEditText;", "Landroidx/appcompat/widget/AppCompatEditText;", "Landroid/text/TextWatcher;", "Landroid/view/View$OnTouchListener;", "Landroid/view/View$OnFocusChangeListener;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "clearDrawble", "Landroid/graphics/drawable/Drawable;", "focusChangeListener", "touchListener", "afterTextChanged", "", "p0", "Landroid/text/Editable;", "beforeTextChanged", "", "p1", "p2", "p3", "init", "onFocusChange", "view", "Landroid/view/View;", "hasFocus", "", "onTextChanged", "text", "start", "lengthBefore", "lengthAfter", "onTouch", "motionEvent", "Landroid/view/MotionEvent;", "setClearIconVisible", "visible", "setOnFocusChangeListener", "l", "setOnTouchListener", "app_debug"})
public final class ClearEditText extends androidx.appcompat.widget.AppCompatEditText implements android.text.TextWatcher, android.view.View.OnTouchListener, android.view.View.OnFocusChangeListener {
    private android.graphics.drawable.Drawable clearDrawble;
    private android.view.View.OnFocusChangeListener focusChangeListener;
    private android.view.View.OnTouchListener touchListener;
    private java.util.HashMap _$_findViewCache;
    
    private final void init() {
    }
    
    private final void setClearIconVisible(boolean visible) {
    }
    
    @java.lang.Override()
    public void onTextChanged(@org.jetbrains.annotations.Nullable()
    java.lang.CharSequence text, int start, int lengthBefore, int lengthAfter) {
    }
    
    @java.lang.Override()
    public void beforeTextChanged(@org.jetbrains.annotations.Nullable()
    java.lang.CharSequence p0, int p1, int p2, int p3) {
    }
    
    @java.lang.Override()
    public void afterTextChanged(@org.jetbrains.annotations.Nullable()
    android.text.Editable p0) {
    }
    
    @java.lang.Override()
    public boolean onTouch(@org.jetbrains.annotations.Nullable()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.view.MotionEvent motionEvent) {
        return false;
    }
    
    @java.lang.Override()
    public void onFocusChange(@org.jetbrains.annotations.Nullable()
    android.view.View view, boolean hasFocus) {
    }
    
    @java.lang.Override()
    public void setOnTouchListener(@org.jetbrains.annotations.Nullable()
    android.view.View.OnTouchListener l) {
    }
    
    @java.lang.Override()
    public void setOnFocusChangeListener(@org.jetbrains.annotations.Nullable()
    android.view.View.OnFocusChangeListener l) {
    }
    
    public ClearEditText(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
    
    public ClearEditText(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    public ClearEditText(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.util.AttributeSet attrs, int defStyleAttr) {
        super(null);
    }
}