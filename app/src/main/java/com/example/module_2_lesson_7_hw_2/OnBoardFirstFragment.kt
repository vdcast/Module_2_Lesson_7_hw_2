package com.example.module_2_lesson_7_hw_2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_on_board_first.*
import kotlinx.android.synthetic.main.fragment_on_board_start.*

private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"


class OnBoardFirstFragment : Fragment() {
    var onBoardPage: OnBoard? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_on_board_first, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

//        ivOnBoardFirst.setImageBitmap(onBoardPage?.image)
        tvOnBoardFirstDescription.text = onBoardPage?.description

    }

    companion object {

        @JvmStatic
        fun newInstance(onBoardPage: OnBoard) =
            OnBoardFirstFragment().apply {
                this.onBoardPage = onBoardPage
            }
    }
}