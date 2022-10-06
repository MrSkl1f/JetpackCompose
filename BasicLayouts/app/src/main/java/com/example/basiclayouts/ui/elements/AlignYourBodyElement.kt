package com.example.basiclayouts.ui

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.paddingFromBaseline
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.basiclayouts.R
import com.example.basiclayouts.ui.theme.BasicLayoutsTheme
import com.example.basiclayouts.ui.theme.typography

@Composable
fun AlignYourBodyElement(
	@DrawableRes drawable: Int,
	@StringRes text: Int,
	modifier: Modifier = Modifier
) {
	Column(
		modifier = modifier,
		horizontalAlignment = Alignment.CenterHorizontally
	) {
		Image(
			painter = painterResource(drawable),
			contentDescription = null,
			contentScale = ContentScale.Crop,
			modifier = Modifier
				.size(88.dp)
				.clip(CircleShape)
		)
		Text(
			text = stringResource(text),
			style = typography.h3,
			modifier = Modifier.padding(
				top = 24.dp
			)
		)
	}
}

@Preview(showBackground = true, backgroundColor = 0xFFF0EAE2)
@Composable
fun AlignYourBodyElementPreview() {
	BasicLayoutsTheme {
		AlignYourBodyElement(
			text = R.string.ab1_inversions,
			drawable = R.drawable.ab1_inversions,
			modifier = Modifier.padding(8.dp)
		)
	}
}
