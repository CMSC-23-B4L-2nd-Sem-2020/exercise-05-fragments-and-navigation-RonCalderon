package com.android.example.aboutme

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import com.android.example.aboutme.databinding.FragmentGameBinding

/**
 * A simple [Fragment] subclass.
 */
class GameFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val binding = DataBindingUtil.inflate<FragmentGameBinding>(inflater,
            R.layout.fragment_game,container,false)
        // Inflate the layout for this fragment
        findViewById<TextView>(R.id.reset_button).setOnClickListener {
            resetBoard()
        }


        for(number in 0..24) {
            getBoxes()[number].setOnClickListener {
                flickLights(getBoxes(),number)
            }
        }
        return inflater.inflate(R.layout.fragment_start_screen, container, false)
    }
}
