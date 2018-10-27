package com.fanhl.motionlayoutdemo

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.WindowManager

class MineActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS)
        setContentView(R.layout.activity_mine)
    }
}
