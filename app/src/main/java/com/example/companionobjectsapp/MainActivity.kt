package com.example.companionobjectsapp

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {

    lateinit var clMain : ConstraintLayout
    lateinit var eUserInput : EditText
    lateinit var bChange : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        clMain = findViewById(R.id.clMain)
        eUserInput = findViewById(R.id.eUserInput)
        bChange = findViewById(R.id.bChange)

        bChange.setOnClickListener {
            var userInput = eUserInput.text.toString()

            when(userInput.toLowerCase()){
                "day" -> { val background = Background()
                    background.changeBackground(clMain, Background.day)
                }

                "night" -> {val background = Background()
                    background.changeBackground(clMain, Background.night)
                }
            }
        }

    }
}