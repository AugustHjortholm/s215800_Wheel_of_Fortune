package com.example.s215800_wheeloffortune

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.s215800_wheeloffortune.ViewModel.AppViewModel

@Composable
fun WheelOfFortuneApp(){

    val viewModel = AppViewModel(rememberNavController())

    //TODO
    NavHost(
        navController = viewModel.navController,
        startDestination = "start_screen"
    ) {
        composable("start_screen") { StartGameScreen(viewModel) }
        composable("choose_difficulty") { ChooseDifficulty(viewModel) }
        composable("choose_difficulty_easy") { ChooseDifficultyEasy(viewModel) }
        composable("choose_difficulty_medium") { ChooseDifficultyMedium(viewModel) }
        composable("choose_difficulty_hard") { ChooseDifficultyHard(viewModel) }
    }
}