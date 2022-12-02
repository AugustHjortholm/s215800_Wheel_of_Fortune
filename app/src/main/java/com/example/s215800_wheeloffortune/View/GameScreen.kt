package com.example.s215800_wheeloffortune.View

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.OutlinedButton
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.s215800_wheeloffortune.View.Composables.OnScreenKeyboard
import com.example.s215800_wheeloffortune.ViewModel.AppViewModel

@Composable
fun GameScreen(viewModel: AppViewModel) {

    val words = viewModel.getWord().split("\\s".toRegex()).toTypedArray()
    val wordAmount = 4
    val largestCharAmount = 6
    var haveSpun by remember { mutableStateOf(false) }
    var infoText by remember { mutableStateOf("Spin that wheel!") }

    Column(modifier = Modifier
        .fillMaxWidth()
        .padding(50.dp), horizontalAlignment = Alignment.CenterHorizontally) {
        for (i in 1..wordAmount){
        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Center) {
            for (j in 1..largestCharAmount){
                Box(
                    modifier = Modifier
                        .background(Color.Gray)
                        .border(BorderStroke(1.dp, Color.Black))
                        .width(25.dp)
                        .height(25.dp)
                ) { Text(text = "t", modifier = Modifier.align(Alignment.Center)) }
        }}
    }
        Text(text = infoText, modifier = Modifier.padding(20.dp))
        if(haveSpun){
            OnScreenKeyboard()
        }
        else {
            OutlinedButton(onClick = { haveSpun = true }, border = BorderStroke(1.dp, Color.Black),colors = ButtonDefaults.outlinedButtonColors(contentColor = Color.Black, backgroundColor = Color.Yellow), modifier = Modifier
                .width(200.dp)
                .height(40.dp)) {
                Text(text = "GO!")
            }
        }
    }
}