package com.example.s215800_wheeloffortune.Model

import com.example.s215800_wheeloffortune.ViewModel.AppViewModel

fun CheckIfLetterIsInWord(guessedLetter: Char, viewModel: AppViewModel): Int{
    var words = viewModel.getWord()
    for (i in words.indices) {
            if (words[i] == guessedLetter) {
                return i
        }
    }
    return 0
}
