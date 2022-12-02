package com.example.s215800_wheeloffortune

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import com.example.s215800_wheeloffortune.ViewModel.AppViewModel

@Composable
fun ChooseDifficulty(viewModel: AppViewModel){
    ChooseFromThreeOptions("Easy","Medium","Hard", { viewModel.navController.navigate("choose_difficulty_easy")}, { viewModel.navController.navigate("choose_difficulty_medium")}, { viewModel.navController.navigate("choose_difficulty_hard")})
}

@Composable
fun ChooseDifficultyEasy(viewModel: AppViewModel){
    ChooseFromThreeOptions("Food","Countries","Top 100 Movies", {/*TODO*/}, {/*TODO*/}, {/*TODO*/})
}

@Composable
fun ChooseDifficultyMedium(viewModel: AppViewModel){
    ChooseFromThreeOptions("Top 100 Songs","Cities","Events", {/*TODO*/}, {/*TODO*/}, {/*TODO*/})
}

@Composable
fun ChooseDifficultyHard(viewModel: AppViewModel){
    ChooseFromThreeOptions("Megawords","Swedish Cousine","Anything", {/*TODO*/}, {/*TODO*/}, {/*TODO*/})
}

@Preview (showBackground = true)
@Composable
fun ChooseDifficultyPreview(){
    ChooseDifficulty(AppViewModel(rememberNavController()))
}