package com.ridwanpa.coffeeshop.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.ridwanpa.coffeeshop.ui.theme.Black
import com.ridwanpa.coffeeshop.ui.theme.Gray300

@Composable
fun TabMenu(
    modifier: Modifier = Modifier
) {
    Row(
        modifier = modifier
            .clip(MaterialTheme.shapes.small)
            .background(Color(0xFFE2E2E2))
            .padding(2.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(4.dp)
    ) {
        Text(
            text = "Deliver",
            color = Color.White,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .clip(MaterialTheme.shapes.small)
                .defaultMinSize(minWidth = 124.dp)
                .background(MaterialTheme.colors.primary)
                .padding(4.dp)
        )
        Text(
            text = "Pick Up",
            textAlign = TextAlign.Center,
            modifier = Modifier
                .clip(MaterialTheme.shapes.small)
                .defaultMinSize(minWidth = 124.dp)
                .padding(4.dp)
        )
    }
}