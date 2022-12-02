package com.example.s215800_wheeloffortune

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun WheelOfFortuneApp(){

    val navController = rememberNavController()
    val viewModel = AppViewModel()

    //TODO
    NavHost(
        navController = navController,
        startDestination = "start_screen"
    ) {
        composable("start_screen") { StartGameScreen(viewModel) }
    }
}