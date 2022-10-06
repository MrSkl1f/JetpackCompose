package com.example.basiclayouts.ui

import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.basiclayouts.ui.screens.HomeScreen
import com.example.basiclayouts.ui.theme.BasicLayoutsTheme

@Composable
fun MyApp() {
	BasicLayoutsTheme {
		Scaffold(
			bottomBar = { SootheBottomNavigation() }
		) { padding ->
			HomeScreen(Modifier.padding(padding))
		}
	}
}

@Preview(showBackground = true)
@Composable
fun AppPreview() {
	MyApp()
}