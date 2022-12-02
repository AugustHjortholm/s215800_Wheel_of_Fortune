package com.example.s215800_wheeloffortune

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.OutlinedButton
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.rememberNavController
import com.example.s215800_wheeloffortune.ViewModel.AppViewModel

@Composable
fun StartGameScreen(
    viewModel: AppViewModel
) {
    Column(horizontalAlignment = Alignment.CenterHorizontally, modifier = Modifier
        .fillMaxSize()
        .padding(0.dp, 20.dp, 0.dp, 0.dp)) {
        val painter = painterResource(id = R.drawable.wheel_of_fortune_logo)
        Image(painter = painter, contentDescription = "Wheel of Fortune Logo", modifier = Modifier
            .width(300.dp)
            .height(200.dp))
        Text(text = "By S215800, August Hjortholm", modifier = Modifier
            .padding(0.dp, 30.dp, 0.dp, 0.dp))
        Text(text = "Score: " + viewModel.getScore(), modifier = Modifier
            .padding(10.dp))
        OutlinedButton(onClick = { viewModel.navController.navigate("choose_difficulty")}, border = BorderStroke(1.dp, Color.Black),colors = ButtonDefaults.outlinedButtonColors(contentColor = Color.Black, backgroundColor = Color.Yellow)) {
            Text(text = "Start a game")
        }
    }
}

@Preview (showBackground = true)
@Composable
fun StartGameScreenPreview(){
    StartGameScreen(AppViewModel(rememberNavController()))
}