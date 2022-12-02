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
import androidx.compose.ui.unit.dp

@Composable
fun ChooseFromThreeOptions(option1Text: String, option2Text: String, option3Text: String, option1Path: () -> Unit, option2Path: () -> Unit, option3Path: () -> Unit) {
    Column(horizontalAlignment = Alignment.CenterHorizontally, modifier = Modifier
        .fillMaxSize()
        .padding(0.dp, 20.dp, 0.dp, 0.dp)) {
        val painter = painterResource(id = R.drawable.wheel_of_fortune_logo)
        Image(
            painter = painter, contentDescription = "Wheel of Fortune Logo", modifier = Modifier
                .width(200.dp)
                .height(200.dp)
        )
        OutlinedButton(onClick = option1Path, border = BorderStroke(1.dp, Color.Black),colors = ButtonDefaults.outlinedButtonColors(contentColor = Color.Black, backgroundColor = Color.Yellow), modifier = Modifier.width(200.dp).height(50.dp).padding(0.dp, 10.dp, 0.dp, 0.dp)) {
            Text(text = option1Text)
        }
        OutlinedButton(onClick = option2Path, border = BorderStroke(1.dp, Color.Black),colors = ButtonDefaults.outlinedButtonColors(contentColor = Color.Black, backgroundColor = Color.Yellow), modifier = Modifier.width(200.dp).height(50.dp).padding(0.dp, 10.dp, 0.dp, 0.dp)) {
            Text(text = option2Text)
        }
        OutlinedButton(onClick = option3Path, border = BorderStroke(1.dp, Color.Black),colors = ButtonDefaults.outlinedButtonColors(contentColor = Color.Black, backgroundColor = Color.Yellow), modifier = Modifier.width(200.dp).height(50.dp).padding(0.dp, 10.dp, 0.dp, 0.dp)) {
            Text(text = option3Text)
        }
    }
}