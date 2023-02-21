package com.droidcon.composenavigation

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavController

@Composable
fun FirstScreen(navController: NavController) {

	Row(modifier = Modifier
		.fillMaxSize()
		.background(Color.Cyan),
		horizontalArrangement = Arrangement.Center,
		verticalAlignment = Alignment.CenterVertically
	) {
		Button(
			onClick = {
				val bgColor = android.graphics.Color.MAGENTA
				val txtColor = android.graphics.Color.YELLOW
				navController.navigate("secondScreen/$bgColor/$txtColor")
			}) {
			Text(text = "Go to Second Screen")
		}
	}
}