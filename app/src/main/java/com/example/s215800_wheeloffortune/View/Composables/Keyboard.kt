package com.example.s215800_wheeloffortune.View.Composables

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.OutlinedButton
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.s215800_wheeloffortune.Model.getWheelSpinOutcome

@Composable
fun OnScreenKeyboard (startLetter: Char, endLetter: Char, onClick: () -> Unit) {
    for (i in startLetter..endLetter)
        OutlinedButton(
            onClick = { onClick() },
            border = BorderStroke(1.dp, Color.Black),
            colors = ButtonDefaults.outlinedButtonColors(
                contentColor = Color.Black
            ),
            modifier = Modifier
                .width(40.dp)
                .height(40.dp)
        ) {
            Text(text = i.toString())
        }
}