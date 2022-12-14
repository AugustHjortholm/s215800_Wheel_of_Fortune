package com.example.s215800_wheeloffortune.View

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.OutlinedButton
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.s215800_wheeloffortune.View.Composables.OnScreenKeyboard
import com.example.s215800_wheeloffortune.ViewModel.AppViewModel

@Composable
fun GameScreen(viewModel: AppViewModel) {

    var words = viewModel.getWord().split("\\s".toRegex()).toTypedArray()
    var wordAmount = words.size
    var largestCharAmount = 0
    for (i in 0 until wordAmount) {
        if (words[i].length > largestCharAmount) {
            largestCharAmount = words[i].length
        }
    }
    for (i in 0 until wordAmount) {
        for (j in 0 until largestCharAmount) {
                viewModel.guessedLetters += " "
        }
    }

    var spinValue by remember { mutableStateOf("") }
    var haveSpun by remember { mutableStateOf(false) }
    var spinText by remember { mutableStateOf("the wheel landed on $spinValue") }
    var infoText by remember { mutableStateOf("Spin that wheel!") }

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(50.dp), horizontalAlignment = Alignment.CenterHorizontally
    ) {
        var counter = 0
        for (i in 1..wordAmount) {
            Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Center) {
                for (j in 1..largestCharAmount) {
                        Box(
                            modifier = Modifier
                                .border(BorderStroke(2.dp, Color.Black))
                                .width(35.dp)
                                .height(35.dp)
                        ) {
                            Text(
                                text = viewModel.guessedLetters[counter],
                                modifier = Modifier.align(Alignment.Center)
                            )
                        }
                    counter++
                }
            }
        }
        Text(text = infoText, modifier = Modifier.padding(20.dp), textAlign = TextAlign.Center)

        if (haveSpun) {
            Row() {
                OnScreenKeyboard(startLetter = 'a', endLetter = 'g', viewModel = viewModel) {
                    haveSpun = false
                    infoText = "Spin that wheel!"
                    spinValue = viewModel.getWheelSpinOutcome()
                }
            }
            Row() {
                OnScreenKeyboard(startLetter = 'h', endLetter = 'n', viewModel = viewModel) {
                    haveSpun = false
                    infoText = "Spin that wheel!"
                    spinValue = viewModel.getWheelSpinOutcome()
                }
            }
            Row() {
                OnScreenKeyboard(startLetter = 'o', endLetter = 'u', viewModel = viewModel) {
                    haveSpun = false
                    infoText = "Spin that wheel!"
                    spinValue = viewModel.getWheelSpinOutcome()
                }
            }
            Row() {
                OnScreenKeyboard(startLetter = 'v', endLetter = 'z', viewModel = viewModel) {
                    haveSpun = false
                    infoText = "Spin that wheel!"
                    spinValue = viewModel.getWheelSpinOutcome()
                }
            }
        } else {
            OutlinedButton(
                onClick = {
                    haveSpun = true
                    infoText = "Choose a letter \n $spinText"
                },
                border = BorderStroke(1.dp, Color.Black),
                colors = ButtonDefaults.outlinedButtonColors(
                    contentColor = Color.Black,
                    backgroundColor = Color.Yellow
                ),
                modifier = Modifier
                    .width(200.dp)
                    .height(40.dp)
            ) {
                Text(text = "GO!")
            }
        }
    }
}