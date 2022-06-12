package com.saikat.colormyviews

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.core.content.ContextCompat

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setListeners()
    }

    private fun setListeners() {

        val clickableViews: List<View> =
            listOf(
                findViewById<TextView>(R.id.box_one_text),
                findViewById<TextView>(R.id.box_two_text),
                findViewById<TextView>(R.id.box_three_text),
                findViewById<TextView>(R.id.box_four_text),
                findViewById<TextView>(R.id.box_five_text),
                findViewById<Button>(R.id.red_button),
                findViewById<Button>(R.id.yellow_button),
                findViewById<Button>(R.id.green_button)
            )
        for (item in clickableViews) {
            item.setOnClickListener {
                makeColored(it);
            }
        }

    }

    private fun makeColored(view: View) {
        when (view.id) {
            // Boxes using color class colors for background
            R.id.box_one_text -> view.setBackgroundColor(Color.DKGRAY)
            R.id.box_two_text -> view.setBackgroundColor(Color.GRAY)
            //Boxes using Android color resources for background
            //R.id.box_three_text -> view.setBackgroundColor(android.R.color.holo_green_light)
            R.id.box_three_text -> view.setBackgroundColor(
                ContextCompat.getColor(
                    this,
                    R.color.holo_green_light
                )
            )
            R.id.box_four_text -> view.setBackgroundColor(
                ContextCompat.getColor(
                    this,
                    R.color.holo_green_dark
                )
            )
            R.id.box_five_text -> view.setBackgroundColor(
                ContextCompat.getColor(
                    this,
                    R.color.holo_green_light
                )
            )
            R.id.red_button -> findViewById<TextView>(R.id.box_three_text).setBackgroundColor(
                ContextCompat.getColor(
                    this,
                    R.color.my_red
                )
            )
            R.id.yellow_button -> findViewById<TextView>(R.id.box_four_text).setBackgroundColor(
                ContextCompat.getColor(
                    this,
                    R.color.my_yellow
                )
            )
            R.id.green_button -> findViewById<TextView>(R.id.box_five_text).setBackgroundColor(
                ContextCompat.getColor(
                    this,
                    R.color.my_green
                )
            )

            else -> view.setBackgroundColor(Color.LTGRAY)
        }
    }
}