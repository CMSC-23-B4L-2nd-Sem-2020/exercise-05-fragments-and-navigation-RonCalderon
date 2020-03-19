package com.android.example.aboutme

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.android.example.aboutme.databinding.FragmentGameBinding
import com.android.example.aboutme.databinding.FragmentWinBinding

/**
 * A simple [Fragment] subclass.
 */
class WinFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val binding = DataBindingUtil.inflate<FragmentWinBinding>(inflater,
            R.layout.fragment_win,container,false)

        /**
         * Click handler for the DONE button.
         * Hides the EditText and the DONE button.
         * Sets the EditText content to the TextView and displays it.
         */
        binding.restartButton.setOnClickListener { view : View ->
            view.findNavController().navigate(R.id.action_WinFragment_to_StartFragment)

        }
        binding.clickCounter.text = arguments?.getString("TOTAL_CLICKS")
        return binding.root
    }
}
