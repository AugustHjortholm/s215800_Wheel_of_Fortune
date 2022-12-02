package com.example.s215800_wheeloffortune

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import com.example.s215800_wheeloffortune.ViewModel.AppViewModel

@Composable
fun ChooseDifficulty(viewModel: AppViewModel){
    ChooseFromThreeOptions("Easy","Medium","Hard", {/*TODO*/}, {/*TODO*/}, {/*TODO*/})
}

@Preview (showBackground = true)
@Composable
fun ChooseDifficultyPreview(){
    ChooseDifficulty(AppViewModel(rememberNavController()))
}