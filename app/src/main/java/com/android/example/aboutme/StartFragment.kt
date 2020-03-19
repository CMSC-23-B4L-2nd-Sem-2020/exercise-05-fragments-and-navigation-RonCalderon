package com.android.example.aboutme

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.core.content.ContextCompat.getSystemService
import androidx.core.os.bundleOf
import androidx.navigation.findNavController
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import com.android.example.aboutme.databinding.FragmentGameBinding
import com.android.example.aboutme.databinding.FragmentStartScreenBinding

/**
 * A simple [Fragment] subclass.
 */
class StartFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val binding = DataBindingUtil.inflate<FragmentStartScreenBinding>(inflater,
            R.layout.fragment_start_screen,container,false)

        /**
         * Click handler for the DONE button.
         * Hides the EditText and the DONE button.
         * Sets the EditText content to the TextView and displays it.
         */
        //click done to go to the gameboard
        binding.doneButton.setOnClickListener { view : View ->
<<<<<<< HEAD
            view.findNavController().navigate(R.id.action_StartFragment_to_GameFragment)
=======
            var bundle = bundleOf("PASSED_NICKNAME" to binding.nicknameText.text)
            view.findNavController().navigate(R.id.action_StartFragment_to_GameFragment,bundle)
>>>>>>> parent of 859fa25... docs:removed unecessary code

        }
        return binding.root
    }


}
