package com.example.module_2_lesson_7_hw_2

import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        clMain.visibility = View.GONE

        val onBoardArrayList = arrayListOf(
            OnBoard(resources.getString(R.string.onboard_first), BitmapFactory.decodeResource(resources,R.drawable.audi_rs3_4gen)),
            OnBoard(resources.getString(R.string.onboard_second), BitmapFactory.decodeResource(resources,R.drawable.audi_a3_4gen)),
            OnBoard(resources.getString(R.string.onboard_third), BitmapFactory.decodeResource(resources,R.drawable.audi_s3_4gen))
        )

        vpOnBoarding.adapter = OnBoardAdapter(onBoardArrayList,supportFragmentManager)

        btToast.setOnClickListener {
            tvToast.text = "Toast1"
        }

    }
}