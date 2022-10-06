package com.example.basiclayouts.ui

import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material.icons.filled.Spa
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.basiclayouts.R
import com.example.basiclayouts.ui.theme.BasicLayoutsTheme

@Composable
fun SootheBottomNavigation(
	modifier: Modifier = Modifier
) {
	BottomNavigation(
		modifier = modifier
	) {
		BottomNavigationItem(
			icon = {
				Icon(
					imageVector = Icons.Default.Spa,
					contentDescription = null
				)
			},
			label = {
				Text(text = stringResource(id = R.string.bottom_navigation_home))
			},
			selected = true,
			onClick = { }
		)
		BottomNavigationItem(
			icon = {
				Icon(
					imageVector = Icons.Default.AccountBox,
					contentDescription = null
				)
			},
			label = {
				Text(text = stringResource(id = R.string.bottom_navigation_profile))
			},
			selected = false,
			onClick = { }
		)
	}
}

@Preview(showBackground = true)
@Composable
fun SootheBottomNavigationPreview() {
	BasicLayoutsTheme {
		SootheBottomNavigation()
	}
}