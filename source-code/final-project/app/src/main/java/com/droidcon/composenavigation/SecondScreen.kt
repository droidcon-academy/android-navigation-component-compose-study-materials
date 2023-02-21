package com.droidcon.composenavigation

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.sp

@Composable
fun SecondScreen(bgColor: Int, txtColor: Int) {

	Row(
		modifier = Modifier.fillMaxSize().background(Color(bgColor)),
		horizontalArrangement = Arrangement.Center,
		verticalAlignment = Alignment.CenterVertically
	) {
		Text(
			color = Color(txtColor),
			text = "This is Second Screen",
			fontSize = 30.sp
		)
	}
}