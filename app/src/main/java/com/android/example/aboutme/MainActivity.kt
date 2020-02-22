/*
 * Copyright (C) 2018 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
//edited for education purposes
package com.android.example.aboutme

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.graphics.drawable.ColorDrawable


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.done_button).setOnClickListener {
            addNickname(it)
        }

        findViewById<TextView>(R.id.nickname_text).setOnClickListener {
            updateNickname(it)
        }

        for(number in 0..24) {
            getBoxes()[number].setOnClickListener {
               flickLights(getBoxes(),number)
          }
        }
    }


    //returns boxes list
    private fun getBoxes(): MutableList<TextView> {
        //declare list containing all the boxes.
        val box1 = findViewById<TextView>(R.id.box_1)
        val box2 = findViewById<TextView>(R.id.box_2)
        val box3 = findViewById<TextView>(R.id.box_3)
        val box4 = findViewById<TextView>(R.id.box_4)
        val box5 = findViewById<TextView>(R.id.box_5)
        val box6 = findViewById<TextView>(R.id.box_6)
        val box7 = findViewById<TextView>(R.id.box_7)
        val box8 = findViewById<TextView>(R.id.box_8)
        val box9 = findViewById<TextView>(R.id.box_9)
        val box10 = findViewById<TextView>(R.id.box_10)
        val box11 = findViewById<TextView>(R.id.box_11)
        val box12 = findViewById<TextView>(R.id.box_12)
        val box13 = findViewById<TextView>(R.id.box_13)
        val box14 = findViewById<TextView>(R.id.box_14)
        val box15 = findViewById<TextView>(R.id.box_15)
        val box16 = findViewById<TextView>(R.id.box_16)
        val box17 = findViewById<TextView>(R.id.box_17)
        val box18 = findViewById<TextView>(R.id.box_18)
        val box19 = findViewById<TextView>(R.id.box_19)
        val box20 = findViewById<TextView>(R.id.box_20)
        val box21 = findViewById<TextView>(R.id.box_21)
        val box22 = findViewById<TextView>(R.id.box_22)
        val box23 = findViewById<TextView>(R.id.box_23)
        val box24 = findViewById<TextView>(R.id.box_24)
        val box25 = findViewById<TextView>(R.id.box_25)

        val arrayBoxes = mutableListOf(box1,box2,box3,box4,box5,box6,box7,box8,box9,box10,
            box11,box12,box13,box14,box15,box16,box17,box18,box19,box20,
            box21,box22,box23,box24,box25)
        return arrayBoxes
    }

    /**
     * Click handler for the DONE button.
     * Hides the EditText and the DONE button.
     * Sets the EditText content to the TextView and displays it.
     */
    private fun addNickname(view: View) {
        val editText = findViewById<EditText>(R.id.nickname_edit)
        val nicknameTextView = findViewById<TextView>(R.id.nickname_text)
        val nameClick = findViewById<TextView>(R.id.click_counter)
        val countClick = findViewById<TextView>(R.id.click_label)
        val arrayBoxes = getBoxes()
        for(number in 0..24) {
            arrayBoxes[number].visibility = View.VISIBLE
        }

        nicknameTextView.text = editText.text
        editText.visibility = View.GONE
        view.visibility = View.GONE
        nicknameTextView.visibility = View.VISIBLE
        nameClick.visibility = View.VISIBLE
        countClick.visibility = View.VISIBLE
        // Hide the keyboard.
        val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.hideSoftInputFromWindow(view.windowToken, 0)

    }

    /**
     * Click handler for the nickname TextView.
     * Displays the EditText and the DONE button.
     * Hides the nickname TextView.
     */
    private fun updateNickname(view: View) {
        val editText = findViewById<EditText>(R.id.nickname_edit)
        val doneButton = findViewById<Button>(R.id.done_button)

        editText.visibility = View.VISIBLE
        doneButton.visibility = View.VISIBLE
        view.visibility = View.INVISIBLE

        // Set the focus to the edit text.
        editText.requestFocus()

        // Show the keyboard.
        val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.showSoftInput(editText, 0)
    }

    //check current color, change the surrounding to the opposite color (black and yellow)
    private fun flickLights(arr: List<TextView> ,number: Int) {
        val cd = arr[number].background as ColorDrawable
        val colorCode = cd.color
        val middle = intArrayOf(6,7,8,11,12,13,16,17,18)
        val middleTop =  intArrayOf(5,10,15)
        val middleLeft = intArrayOf(1,2,3)
        val middleRight = intArrayOf(21,22,23)
        val middleBottom = intArrayOf(9,14,19)
        val topLeft = 0
        val topRight = 20
        val bottomLeft = 4
        val bottomRight = 24
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
}