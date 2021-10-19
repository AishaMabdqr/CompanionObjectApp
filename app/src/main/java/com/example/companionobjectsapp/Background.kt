package com.example.companionobjectsapp

import android.view.View

class Background {


    companion object{
        val day = 0
        val night = 1
    }

    fun changeBackground (layout : View, day: Int){
        when (day){
            0 -> {layout.setBackgroundResource(R.drawable.day)}
            1 -> {layout.setBackgroundResource(R.drawable.night)}
        }
    }
}