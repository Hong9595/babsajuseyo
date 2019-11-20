package com.example.babsajuseyo.base

import androidx.appcompat.app.AppCompatActivity

open class BaseActivity : AppCompatActivity() {
    override fun onSupportNavigateUp(): Boolean {
        // TODO: 질문1. 이게 왜 동작하는거지? 설명 보면 뒤로가기 성공시에 true, 실패시에 false return인거 같은데, false가 return됐다 치더라도 onBackPressed()는 그냥 뒤로가기 눌렸을때 콜백 아닌가? 원래 onBackPressed()에서 finish해주지 않나
        if (!super.onSupportNavigateUp())
            onBackPressed()
        return true

    }
}