package com.example.s215800_wheeloffortune

class AppViewModel {
    private var score = 0
    fun getScore(): Int{
        return score
    }

    fun setScore(newScore: Int){
        score = newScore
    }
}