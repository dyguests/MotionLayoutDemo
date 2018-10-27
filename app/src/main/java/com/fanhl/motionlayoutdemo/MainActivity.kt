package com.fanhl.motionlayoutdemo

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.transition.TransitionManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        fab_1.setOnClickListener {
            TransitionManager.beginDelayedTransition(root)
            constraints_1.constraintSet.applyTo(root)
        }
    }
}
