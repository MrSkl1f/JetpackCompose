package com.example.basiclayouts.ui.elements

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.basiclayouts.R
import com.example.basiclayouts.ui.theme.BasicLayoutsTheme
import com.example.basiclayouts.ui.theme.Shapes
import com.example.basiclayouts.ui.theme.typography

@Composable
fun FavouriteCollectionCard(
	@DrawableRes drawable: Int,
	@StringRes text: Int,
	modifier: Modifier = Modifier
) {
	Surface(
		shape = Shapes.small,
		modifier = modifier
	) {
		Row(
			verticalAlignment = Alignment.CenterVertically,
			modifier = Modifier.width(192.dp)
		) {
			Image(
				painter = painterResource(id = drawable),
				contentDescription = null,
				contentScale = ContentScale.Crop,
				modifier = Modifier.size(56.dp)
			)
			Text(
				text = stringResource(id = text),
				style = typography.h3,
				modifier = Modifier.padding(horizontal = 16.dp)
			)
		}
	}
}

@Preview(showBackground = true)
@Composable
fun FavouriteCollectionCardPreview() {
	BasicLayoutsTheme {
		FavouriteCollectionCard(
			drawable = R.drawable.fc2_nature_meditations,
			text = R.string.fc2_nature_meditations,
			Modifier.padding(8.dp)
		)
	}
}