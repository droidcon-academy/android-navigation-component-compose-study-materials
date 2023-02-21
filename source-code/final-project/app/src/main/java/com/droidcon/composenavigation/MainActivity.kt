package com.droidcon.composenavigation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.droidcon.composenavigation.ui.theme.ComposeNavigationTheme

class MainActivity : ComponentActivity() {

	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContent {
			ComposeNavigationTheme {
				MyNavHost()
			}
		}
	}
}

@Composable
fun MyNavHost() {

	val navHostController = rememberNavController()

	NavHost(navController = navHostController, startDestination = "firstScreen") {

		composable("firstScreen") {
			FirstScreen(navHostController)
		}

		composable("secondScreen/{backgroundColor}/{textColor}",
			arguments = listOf(
				navArgument("backgroundColor") { type = NavType.IntType },
				navArgument("textColor") { type = NavType.IntType }
			)
		) { backStackEntry ->
			val bgColor = backStackEntry.arguments?.getInt("backgroundColor")!!
			val txtColor = backStackEntry.arguments?.getInt("textColor")!!
			SecondScreen(bgColor, txtColor)
		}
	}
}