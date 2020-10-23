package com.example.madlevel2task2

import androidx.recyclerview.widget.ItemTouchHelper

data class Question (
    val questionText: String,
    val answer: Int
){
    companion object {
        private val correct = ItemTouchHelper.RIGHT
        private val incorrect = ItemTouchHelper.LEFT
        val Questions = arrayOf(
            Question("The sky is blue", correct),
            Question("Goldfish only have a memory of three seconds", incorrect),
            Question("An octopus has three hearts", correct),
            Question("Flying in an aeroplane is statistically safer than driving in a car", correct),
            Question("The currency of France is the Franc", incorrect)
        )
    }
}