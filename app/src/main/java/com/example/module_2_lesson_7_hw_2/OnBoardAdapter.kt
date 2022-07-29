package com.example.module_2_lesson_7_hw_2

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class OnBoardAdapter (val onBoards: ArrayList<OnBoard>, fm: FragmentManager) : FragmentPagerAdapter(fm){
    override fun getCount(): Int {
        return onBoards.size
    }

    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> {
                OnBoardFirstFragment.newInstance(onBoards[0])
            }
            1 -> {
                OnBoardFirstFragment.newInstance(onBoards[1])
            }
            else -> {
                OnBoardStartFragment.newInstance(onBoards[2])
            }
        }
    }
}