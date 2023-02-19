package com.loureiro.msu.trafficlightapp

import android.graphics.Color
import android.hardware.lights.Light
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import androidx.core.view.isVisible


class MainActivity : AppCompatActivity() {


    private lateinit var greenLight: ImageView
    private lateinit var redLight: ImageView
    private lateinit var yellowLight: ImageView

    private lateinit var btn: Button
    private var clicked = 0
    private var getColor = 0



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn = findViewById(R.id.button)


        btn.setOnClickListener {
            clicked += 1
            if (clicked > 3) clicked = 1
            when (clicked) {
                1 -> {
                    btn.setBackgroundColor(Color.RED)
                    btn.text = "STOP"
                  //  redLight.isVisible = true
                }
                2 -> {
                    btn.setBackgroundColor(Color.GREEN)
                    btn.text = "GO"
                  //  greenLight.isVisible = true
                     }
                3 -> {
                    btn.setBackgroundColor(Color.YELLOW)
                    btn.text = "WAIT"
                   // yellowLight.isVisible = true
                     }

            }


        }
    }
}





