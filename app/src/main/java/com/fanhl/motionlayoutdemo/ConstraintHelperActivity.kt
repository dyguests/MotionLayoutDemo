package com.fanhl.motionlayoutdemo

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.partial_coordinator_header.*

class ConstraintHelperActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_constraint_helper)

        //是否显示路径
        constraintToolbar.setShowPaths(true)
    }
}
