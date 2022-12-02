package com.example.s215800_wheeloffortune.ViewModel

import androidx.navigation.NavHostController

class AppViewModel (val navController: NavHostController){
    private var score = 0
    private var word = ""

    fun getScore(): Int{
        return score
    }

    fun setScore(newScore: Int){
        score = newScore
    }

    fun getWord(): String{
        return word
    }

    fun setWord(newWord: String?){
        if (newWord != null) {
            word = newWord
        }
    }
}