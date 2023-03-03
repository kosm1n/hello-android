package com.example.helloandroid.model

class Dice {

    var sides = 6

    fun roll(): Int {
        val randomNumber = (1..6).random()
        return randomNumber
    }

}