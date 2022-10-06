package com.example.basiclayouts.ui.sections

import androidx.annotation.StringRes
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.paddingFromBaseline
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.basiclayouts.R
import com.example.basiclayouts.ui.collections.AlignYourBodyRow
import com.example.basiclayouts.ui.theme.BasicLayoutsTheme
import com.example.basiclayouts.ui.theme.typography

@Composable
fun HomeSection(
	@StringRes title: Int,
	modifier: Modifier = Modifier,
	content: @Composable () -> Unit
) {
	Column(modifier) {
		Text(
			text = stringResource(id = title),
			style = typography.h2,
			modifier = Modifier
				.paddingFromBaseline(top = 40.dp, bottom = 8.dp)
				.padding(horizontal = 16.dp)
		)
		content()
	}
}

@Preview(showBackground = true, backgroundColor = 0xFFF0EAE2)
@Composable
fun HomeSectionPreview() {
	BasicLayoutsTheme {
		HomeSection(R.string.align_your_body) {
			AlignYourBodyRow()
		}
	}
}