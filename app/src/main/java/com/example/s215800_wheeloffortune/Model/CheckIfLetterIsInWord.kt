package com.example.s215800_wheeloffortune.Model

import android.util.Log
import com.example.s215800_wheeloffortune.ViewModel.AppViewModel

fun CheckIfLetterIsInWord(guessedLetter: Char, viewModel: AppViewModel): Int{
    val words = viewModel.getWord()
    for (i in words.indices) {
            if (words[i].toChar() == guessedLetter) {

                return i
        }
    }
    //number to signify no match
    return 300
}
