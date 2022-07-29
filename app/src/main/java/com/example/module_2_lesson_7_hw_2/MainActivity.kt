package com.example.module_2_lesson_7_hw_2

import android.graphics.BitmapFactory
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        clMain.visibility = View.GONE

        var toastsArrayList = getToasts()

        val onBoardArrayList = arrayListOf(
            OnBoard(resources.getString(R.string.onboard_first), BitmapFactory.decodeResource(resources,R.drawable.audi_rs3_4gen)),
            OnBoard(resources.getString(R.string.onboard_second), BitmapFactory.decodeResource(resources,R.drawable.audi_a3_4gen)),
            OnBoard(resources.getString(R.string.onboard_third), BitmapFactory.decodeResource(resources,R.drawable.audi_s3_4gen))
        )

        vpOnBoarding.adapter = OnBoardAdapter(onBoardArrayList,supportFragmentManager)

        btToast.setOnClickListener {
            if (toastsArrayList.isEmpty()){
                toastsArrayList = getToasts()
                val randomIndex = Random.nextInt(toastsArrayList.size)
                tvToast.text = toastsArrayList[randomIndex]
                toastsArrayList.removeAt(randomIndex)
                MediaPlayer.create(this,R.raw.cheer).start()
            } else {
                val randomIndex = Random.nextInt(toastsArrayList.size)
                tvToast.text = toastsArrayList[randomIndex]
                toastsArrayList.removeAt(randomIndex)
                MediaPlayer.create(this,R.raw.cheer).start()
            }
        }

    }

    private fun getToasts(): ArrayList<String> {
        return arrayListOf(
            resources.getString(R.string.toast_1),
            resources.getString(R.string.toast_2),
            resources.getString(R.string.toast_3),
            resources.getString(R.string.toast_4),
            resources.getString(R.string.toast_5),
            resources.getString(R.string.toast_6),
            resources.getString(R.string.toast_7),
            resources.getString(R.string.toast_8),
            resources.getString(R.string.toast_9),
            resources.getString(R.string.toast_10)
        )
    }

}