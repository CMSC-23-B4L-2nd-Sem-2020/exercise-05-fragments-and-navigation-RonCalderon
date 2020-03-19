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

    /*private fun addNickname(view: View, inflater: LayoutInflater, container: ViewGroup?,
                            savedInstanceState: Bundle?) {
        val binding = DataBindingUtil.inflate<FragmentStartScreenBinding>(inflater,
            R.layout.fragment_start_screen,container,false)
        val editText = binding.nicknameEdit
        val nicknameTextView = binding.nicknameText
        //showBoard()

        nicknameTextView.text = editText.text
        //editText.visibility = View.GONE
        //view.visibility = View.GONE
        //nicknameTextView.visibility = View.VISIBLE

        // Hide the keyboard.
        //val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        //imm.hideSoftInputFromWindow(view.windowToken, 0)

    }*/

    /**
     * Click handler for the nickname TextView.
     * Displays the EditText and the DONE button.
     * Hides the nickname TextView.
     */
    /*private fun updateNickname(view: View , inflater: LayoutInflater, container: ViewGroup?,
                               savedInstanceState: Bundle?) {
        val binding = DataBindingUtil.inflate<FragmentStartScreenBinding>(inflater,
            R.layout.fragment_start_screen,container,false)
        val editText = binding.nicknameEdit
        //val doneButton = binding.doneButton
        //hideBoard()
        //editText.visibility = View.VISIBLE
        //doneButton.visibility = View.VISIBLE
        //view.visibility = View.INVISIBLE

        // Set the focus to the edit text.
        editText.requestFocus()

        // Show the keyboard.
        //val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        //imm.showSoftInput(editText, 0)
    }*/



    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val binding = DataBindingUtil.inflate<FragmentStartScreenBinding>(inflater,
            R.layout.fragment_start_screen,container,false)


        //binding.nicknameText.setOnClickListener {
        //    binding.nicknameText.text =  binding.nicknameEdit.text
        //}

        /**
         * Click handler for the DONE button.
         * Hides the EditText and the DONE button.
         * Sets the EditText content to the TextView and displays it.
         */
        binding.doneButton.setOnClickListener { view : View ->
            var bundle = bundleOf("PASSED_NICKNAME" to binding.nicknameText.text)
            view.findNavController().navigate(R.id.action_StartFragment_to_GameFragment,bundle)

        }


        return binding.root
    }


}
