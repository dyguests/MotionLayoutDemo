package com.fanhl.motionlayoutdemo.widget

import android.animation.ObjectAnimator
import android.content.Context
import android.support.constraint.ConstraintHelper
import android.support.constraint.ConstraintLayout
import android.util.AttributeSet
import android.view.animation.BounceInterpolator

class FlyingBounceHelper @JvmOverloads constructor(
        context: Context,
        attrs: AttributeSet? = null,
        defStyleAttr: Int = 0
) : ConstraintHelper(context, attrs, defStyleAttr) {
    private var mContainer: ConstraintLayout? = null

    override fun updatePreLayout(container: ConstraintLayout?) {
        if (mContainer !== container) {
            val views = getViews(container)
            for (i in 0 until mCount) {
                val view = views[i]
                val animator = ObjectAnimator.ofFloat(view, "translationX", -2000f, 0f).setDuration(1000)
                animator.interpolator = BounceInterpolator()
                animator.start()
            }
        }
        mContainer = container
    }
}