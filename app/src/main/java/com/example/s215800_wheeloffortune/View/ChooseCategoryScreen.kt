package com.example.s215800_wheeloffortune

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import com.example.s215800_wheeloffortune.ViewModel.AppViewModel

@Composable
fun ChooseDifficultyScreen(viewModel: AppViewModel) {
    ChooseFromThreeOptions(
        "Easy",
        "Medium",
        "Hard",
        { viewModel.navController.navigate("choose_difficulty_easy") },
        { viewModel.navController.navigate("choose_difficulty_medium") },
        { viewModel.navController.navigate("choose_difficulty_hard") })
}

@Composable
fun ChooseDifficultyEasyScreen(viewModel: AppViewModel) {
    ChooseFromThreeOptions(
        "Food",
        "Countries",
        "Top 100 Movies",
        {
            viewModel.setWord(viewModel.getWordFromCategory("Food"))
            viewModel.navController.navigate("game")
        }, {
            viewModel.setWord(viewModel.getWordFromCategory("Countries"))
            viewModel.navController.navigate("game")
        }, {
            viewModel.setWord(viewModel.getWordFromCategory("Top 100 Movies"))
            viewModel.navController.navigate("game")
        })
}

@Composable
fun ChooseDifficultyMediumScreen(viewModel: AppViewModel) {
    ChooseFromThreeOptions(
        "Top 100 Songs",
        "Cities",
        "Events",
        {
            viewModel.setWord(viewModel.getWordFromCategory("Top 100 Songs"))
            viewModel.navController.navigate("game")
        }, {
            viewModel.setWord(viewModel.getWordFromCategory("Cities"))
            viewModel.navController.navigate("game")
        }, {
            viewModel.setWord(viewModel.getWordFromCategory("Events"))
            viewModel.navController.navigate("game")
        })
}

@Composable
fun ChooseDifficultyHardScreen(viewModel: AppViewModel) {
    ChooseFromThreeOptions(
        "Megawords",
        "Swedish Cousine",
        "Anything",
        {
            viewModel.setWord(viewModel.getWordFromCategory("Megawords"))
            viewModel.navController.navigate("game")
        }, {
            viewModel.setWord(viewModel.getWordFromCategory("Swedish Cousine"))
            viewModel.navController.navigate("game")
        }, {
            viewModel.setWord(viewModel.getWordFromCategory("Anything"))
            viewModel.navController.navigate("game")
        })
}

@Preview(showBackground = true)
@Composable
fun ChooseDifficultyPreviewScreen() {
    ChooseDifficultyScreen(AppViewModel(rememberNavController()))
}