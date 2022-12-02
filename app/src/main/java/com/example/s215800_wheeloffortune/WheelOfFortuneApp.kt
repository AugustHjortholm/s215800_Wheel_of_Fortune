package com.example.s215800_wheeloffortune

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.s215800_wheeloffortune.View.GameScreen
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
        composable("choose_difficulty") { ChooseDifficultyScreen(viewModel) }
        composable("choose_difficulty_easy") { ChooseDifficultyEasyScreen(viewModel) }
        composable("choose_difficulty_medium") { ChooseDifficultyMediumScreen(viewModel) }
        composable("choose_difficulty_hard") { ChooseDifficultyHardScreen(viewModel) }
        composable("game") { GameScreen(viewModel) }
    }
}