package com.example.bmiviewmodel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class BMICalculatorViewModel : ViewModel() {


    var height by mutableStateOf("")
        private set
    var weight by mutableStateOf("")
        private set


    var bmi by mutableStateOf(0.0)
        private set


    fun updateHeight(newHeight: String) {
        height = newHeight
        calculateBMI()
    }

    fun updateWeight(newWeight: String) {
        weight = newWeight
        calculateBMI()
    }


    private fun calculateBMI() {
        val heightInMeters = height.toDoubleOrNull() ?: 0.0
        val weightInKg = weight.toDoubleOrNull() ?: 0.0
        if (heightInMeters > 0) {
            bmi = weightInKg / (heightInMeters * heightInMeters)
        }
    }
}
