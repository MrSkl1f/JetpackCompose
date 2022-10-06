package com.example.basiclayouts.ui.collections

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyHorizontalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.basiclayouts.ui.elements.FavouriteCollectionCard
import com.example.basiclayouts.ui.theme.BasicLayoutsTheme

@Composable
fun FavoriteCollectionsGrid(
	modifier: Modifier = Modifier
) {
	LazyHorizontalGrid(
		rows = GridCells.Fixed(2),
		contentPadding = PaddingValues(horizontal = 16.dp),
		horizontalArrangement = Arrangement.spacedBy(8.dp),
		verticalArrangement = Arrangement.spacedBy(8.dp),
		modifier = modifier.height(120.dp)
	) {
		items(favoriteCollectionsData) { element ->
			FavouriteCollectionCard(
				drawable = element.drawable, 
				text = element.text,
				modifier = Modifier.height(120.dp)
			)
		}
	}
}

@Preview(showBackground = true, backgroundColor = 0xFFF0EAE2)
@Composable
fun FavoriteCollectionsGridPreview() {
	BasicLayoutsTheme {
		FavoriteCollectionsGrid(modifier = Modifier.padding(8.dp))
	}
}