package com.example.s215800_wheeloffortune.ViewModel

import androidx.navigation.NavHostController

class AppViewModel (val navController: NavHostController){
    private var score = 0
    fun getScore(): Int{
        return score
    }

    fun setScore(newScore: Int){
        score = newScore
    }
}