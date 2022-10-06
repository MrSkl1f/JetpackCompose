package com.example.basiclayouts.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.basiclayouts.R
import com.example.basiclayouts.ui.SearchBar
import com.example.basiclayouts.ui.collections.AlignYourBodyRow
import com.example.basiclayouts.ui.collections.FavoriteCollectionsGrid
import com.example.basiclayouts.ui.sections.HomeSection
import com.example.basiclayouts.ui.theme.BasicLayoutsTheme

@Composable
fun HomeScreen(
	modifier: Modifier = Modifier
) {
	Column(
		modifier = modifier
	) {
		Spacer(modifier = Modifier.height(16.dp))
		SearchBar(Modifier.padding(horizontal = 16.dp))
		HomeSection(title = R.string.align_your_body) {
			AlignYourBodyRow()
		}
		HomeSection(title = R.string.favorite_collections) {
			FavoriteCollectionsGrid()
		}
		Spacer(modifier = Modifier.height(16.dp))
	}
}

@Preview(showBackground = true, backgroundColor = 0xFFF0EAE2)
@Composable
fun HomeScreenPreview() {
	BasicLayoutsTheme {
		HomeScreen()
	}
}