package com.example.basiclayouts.ui.collections

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.basiclayouts.ui.AlignYourBodyElement
import com.example.basiclayouts.ui.theme.BasicLayoutsTheme

@Composable
fun AlignYourBodyRow(
	modifier: Modifier = Modifier
) {
	LazyRow(
		modifier = modifier,
		horizontalArrangement = Arrangement.spacedBy(16.dp),
		contentPadding = PaddingValues(horizontal = 16.dp)
	) {
		items(alignYourBodyData) { element ->
			AlignYourBodyElement(
				drawable = element.drawable,
				text = element.text,
				modifier = Modifier.padding(8.dp)
			)
		}
	}
}

@Preview(showBackground = true)
@Composable
fun AlignYourBodyRowPreview() {
	BasicLayoutsTheme {
		AlignYourBodyRow()
	}
}