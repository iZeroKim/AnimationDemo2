package com.sriyank.animationdemo2

import android.graphics.drawable.AnimatedVectorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //play animation
        avdImage.setOnClickListener {
            checkToClose()
        }
    }

    private fun checkToClose() {
        avdImage.setImageResource(R.drawable.avd_anim)
        val avdAnimation = avdImage.drawable as AnimatedVectorDrawable
        avdAnimation.start()
    }
}