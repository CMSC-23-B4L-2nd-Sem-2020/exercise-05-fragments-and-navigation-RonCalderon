package com.android.example.aboutme

import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.android.example.aboutme.databinding.FragmentGameBinding
import kotlinx.android.synthetic.main.fragment_game.*

/**
 * A simple [Fragment] subclass.
 */
class GameFragment : Fragment() {

    //returns boxes list
    /*private fun getBoxes(inflater: LayoutInflater, container: ViewGroup?,
                         savedInstanceState: Bundle?): MutableList<TextView> {
        val binding = DataBindingUtil.inflate<FragmentGameBinding>(inflater,
            R.layout.fragment_game,container,false)
        //declare list containing all the boxes.
        val box1 = binding.box1
        val box2 = binding.box2
        val box3 = binding.box3
        val box4 = binding.box4
        val box5 = binding.box5
        val box6 = binding.box6
        val box7 = binding.box7
        val box8 = binding.box8
        val box9 = binding.box9
        val box10 = binding.box10
        val box11 = binding.box11
        val box12 = binding.box12
        val box13 = binding.box13
        val box14 = binding.box14
        val box15 = binding.box15
        val box16 = binding.box16
        val box17 = binding.box17
        val box18 = binding.box18
        val box19 = binding.box19
        val box20 = binding.box20
        val box21 = binding.box21
        val box22 = binding.box22
        val box23 = binding.box23
        val box24 = binding.box24
        val box25 = binding.box25

        val arrayBoxes = mutableListOf(box1,box2,box3,box4,box5,box6,box7,box8,box9,box10,
            box11,box12,box13,box14,box15,box16,box17,box18,box19,box20,
            box21,box22,box23,box24,box25)

        return arrayBoxes
    }

    //adds 1 to the click counter
    private fun updateClickCount(inflater: LayoutInflater, container: ViewGroup?,
                                 savedInstanceState: Bundle?) {
        val binding = DataBindingUtil.inflate<FragmentGameBinding>(inflater,
            R.layout.fragment_game,container,false)
        val countClick = binding.clickCounter
        var countString = countClick.text.toString()
        var count = countString.toInt() + 1
        countClick.text = count.toString()
    }

    //sets all boxes and click counter to be visibility.visible
    private fun showBoard(inflater: LayoutInflater, container: ViewGroup?,
                          savedInstanceState: Bundle?) {
        val binding = DataBindingUtil.inflate<FragmentGameBinding>(inflater,
            R.layout.fragment_game,container,false)
        val box1 = binding.box1
        val box2 = binding.box2
        val box3 = binding.box3
        val box4 = binding.box4
        val box5 = binding.box5
        val box6 = binding.box6
        val box7 = binding.box7
        val box8 = binding.box8
        val box9 = binding.box9
        val box10 = binding.box10
        val box11 = binding.box11
        val box12 = binding.box12
        val box13 = binding.box13
        val box14 = binding.box14
        val box15 = binding.box15
        val box16 = binding.box16
        val box17 = binding.box17
        val box18 = binding.box18
        val box19 = binding.box19
        val box20 = binding.box20
        val box21 = binding.box21
        val box22 = binding.box22
        val box23 = binding.box23
        val box24 = binding.box24
        val box25 = binding.box25

        val arrayBoxes = mutableListOf(box1,box2,box3,box4,box5,box6,box7,box8,box9,box10,
            box11,box12,box13,box14,box15,box16,box17,box18,box19,box20,
            box21,box22,box23,box24,box25)
        val nameClick = binding.clickCounter
        val countClick = binding.clickLabel
        val resetButton = binding.resetButton
        resetButton.visibility = View.VISIBLE
        nameClick.visibility = View.VISIBLE
        countClick.visibility = View.VISIBLE
        for(number in 0..24) {
            arrayBoxes[number].visibility = View.VISIBLE
        }
    }

    //sets all boxes and click counter to be visibility.gone
    private fun hideBoard(inflater: LayoutInflater, container: ViewGroup?,
                          savedInstanceState: Bundle?) {
        val binding = DataBindingUtil.inflate<FragmentGameBinding>(inflater,
            R.layout.fragment_game,container,false)
        val box1 = binding.box1
        val box2 = binding.box2
        val box3 = binding.box3
        val box4 = binding.box4
        val box5 = binding.box5
        val box6 = binding.box6
        val box7 = binding.box7
        val box8 = binding.box8
        val box9 = binding.box9
        val box10 = binding.box10
        val box11 = binding.box11
        val box12 = binding.box12
        val box13 = binding.box13
        val box14 = binding.box14
        val box15 = binding.box15
        val box16 = binding.box16
        val box17 = binding.box17
        val box18 = binding.box18
        val box19 = binding.box19
        val box20 = binding.box20
        val box21 = binding.box21
        val box22 = binding.box22
        val box23 = binding.box23
        val box24 = binding.box24
        val box25 = binding.box25

        val arrayBoxes = mutableListOf(box1,box2,box3,box4,box5,box6,box7,box8,box9,box10,
            box11,box12,box13,box14,box15,box16,box17,box18,box19,box20,
            box21,box22,box23,box24,box25)
        val nameClick = binding.clickCounter
        val countClick = binding.clickLabel
        val resetButton = binding.resetButton
        resetButton.visibility = View.GONE
        nameClick.visibility = View.GONE
        countClick.visibility = View.GONE
        for(number in 0..24) {
            arrayBoxes[number].visibility = View.GONE
        }

    //sets all boxes to be yellow
    private fun resetBoard(inflater: LayoutInflater, container: ViewGroup?,
                           savedInstanceState: Bundle?) {
        val binding = DataBindingUtil.inflate<FragmentGameBinding>(inflater,
            R.layout.fragment_game,container,false)
        val box1 = binding.box1
        val box2 = binding.box2
        val box3 = binding.box3
        val box4 = binding.box4
        val box5 = binding.box5
        val box6 = binding.box6
        val box7 = binding.box7
        val box8 = binding.box8
        val box9 = binding.box9
        val box10 = binding.box10
        val box11 = binding.box11
        val box12 = binding.box12
        val box13 = binding.box13
        val box14 = binding.box14
        val box15 = binding.box15
        val box16 = binding.box16
        val box17 = binding.box17
        val box18 = binding.box18
        val box19 = binding.box19
        val box20 = binding.box20
        val box21 = binding.box21
        val box22 = binding.box22
        val box23 = binding.box23
        val box24 = binding.box24
        val box25 = binding.box25

        val arrayBoxes = mutableListOf(box1,box2,box3,box4,box5,box6,box7,box8,box9,box10,
            box11,box12,box13,box14,box15,box16,box17,box18,box19,box20,
            box21,box22,box23,box24,box25)
        val countClick = binding.clickCounter
        countClick.visibility = View.VISIBLE
        countClick.text = "0"
        for(number in 0..24) {
            arrayBoxes[number].setBackgroundResource(R.color.my_lightOn)
        }
    }    }*/


    //check current color, change the surrounding to the opposite color (black and yellow)
    private fun flickLights(arr: List<TextView> ,number: Int, inflater: LayoutInflater, container: ViewGroup?,
                            savedInstanceState: Bundle?) {
        val middle = intArrayOf(6,7,8,11,12,13,16,17,18)
        val middleTop =  intArrayOf(5,10,15)
        val middleLeft = intArrayOf(1,2,3)
        val middleRight = intArrayOf(21,22,23)
        val middleBottom = intArrayOf(9,14,19)
        val topLeft = 0
        val topRight = 20
        val bottomLeft = 4
        val bottomRight = 24
        val cd = arr[number].background as ColorDrawable
        val colorCode = cd.color
        //color code equivalent of yellow
        if(colorCode == -256){
            arr[number].setBackgroundResource(R.color.my_lightOff)
        }
        else{
            arr[number].setBackgroundResource(R.color.my_lightOn)
        }
        for (n in middle) {
            if (n == number) {
                flickLightsBasic(arr,number-1) //top
                flickLightsBasic(arr,number-5) //left
                flickLightsBasic(arr,number+1) //bottom
                flickLightsBasic(arr,number+5) //right
                break
            }
        }
        for (n in middleTop) {
            if (n == number) {
                flickLightsBasic(arr,number-5) //left
                flickLightsBasic(arr,number+1) //bottom
                flickLightsBasic(arr,number+5) //right
                break
            }
        }
        for (n in middleLeft) {
            if (n == number) {
                flickLightsBasic(arr,number-1) //top
                flickLightsBasic(arr,number+1) //bottom
                flickLightsBasic(arr,number+5) //right
                break
            }
        }
        for (n in middleRight) {
            if (n == number) {
                flickLightsBasic(arr,number-1) //top
                flickLightsBasic(arr,number-5) //left
                flickLightsBasic(arr,number+1) //bottom
                break
            }
        }
        for (n in middleBottom) {
            if (n == number) {
                flickLightsBasic(arr,number-1) //top
                flickLightsBasic(arr,number-5) //left
                flickLightsBasic(arr,number+5) //right
                break
            }
        }
        if (number == topLeft){
            flickLightsBasic(arr,number+1) //bottom
            flickLightsBasic(arr,number+5) //right
        }
        if (number == topRight){
            flickLightsBasic(arr,number-5) //left
            flickLightsBasic(arr,number+1) //bottom
        }
        if (number == bottomLeft){
            flickLightsBasic(arr,number-1) //top
            flickLightsBasic(arr,number+5) //right
        }
        if (number == bottomRight){
            flickLightsBasic(arr,number-1) //top
            flickLightsBasic(arr,number-5) //left
        }
        checkWin(arr)
    }

    //change only the given box to change color (for the surrounding flickerLights)
    private fun flickLightsBasic(arr: List<TextView> ,number: Int) {
        val cd = arr[number].background as ColorDrawable
        val colorCode = cd.color
        //color code equivalent of yellow
        if(colorCode == -256){
            arr[number].setBackgroundResource(R.color.my_lightOff)
        }
        else{
            arr[number].setBackgroundResource(R.color.my_lightOn)
        }
    }

    //checks if there are no more yellow boxes
    private fun checkWin(arr: List<TextView>):Boolean{
        for(number in 0..24) {
            val cd = arr[number].background as ColorDrawable
            val colorCode = cd.color
            //color code equivalent of yellow
            if(colorCode == -256){
                return false
            }
        }
        return true
    }


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val binding = DataBindingUtil.inflate<FragmentGameBinding>(inflater,
            R.layout.fragment_game,container,false)
        //binding.box1.setBackgroundResource(R.color.my_lightOff)
        val box1 = binding.box1
        val box2 = binding.box2
        val box3 = binding.box3
        val box4 = binding.box4
        val box5 = binding.box5
        val box6 = binding.box6
        val box7 = binding.box7
        val box8 = binding.box8
        val box9 = binding.box9
        val box10 = binding.box10
        val box11 = binding.box11
        val box12 = binding.box12
        val box13 = binding.box13
        val box14 = binding.box14
        val box15 = binding.box15
        val box16 = binding.box16
        val box17 = binding.box17
        val box18 = binding.box18
        val box19 = binding.box19
        val box20 = binding.box20
        val box21 = binding.box21
        val box22 = binding.box22
        val box23 = binding.box23
        val box24 = binding.box24
        val box25 = binding.box25

        val arrayBoxes = mutableListOf(box1,box2,box3,box4,box5,box6,box7,box8,box9,box10,
            box11,box12,box13,box14,box15,box16,box17,box18,box19,box20,
            box21,box22,box23,box24,box25)
        val countClick = binding.clickCounter
        binding.resetButton.setOnClickListener {
            countClick.text = "0"
            for(number in 0..24) {
                arrayBoxes[number].setBackgroundResource(R.color.my_lightOn)
            }
        }
        for(number in 0..24) {
            arrayBoxes[number].setOnClickListener { view : View ->
                flickLights(arrayBoxes,number,inflater,container,savedInstanceState)
                var countString = countClick.text.toString()
                var count = countString.toInt() + 1
                countClick.text = count.toString()
                if(checkWin(arrayBoxes)){
                    view.findNavController().navigate(R.id.action_GameFragment_to_WinFragment)
                }
            }
        }

        return binding.root
    }
}
