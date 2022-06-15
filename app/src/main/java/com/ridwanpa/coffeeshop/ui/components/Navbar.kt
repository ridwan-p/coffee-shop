package com.ridwanpa.coffeeshop.ui.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.ridwanpa.coffeeshop.R
import com.ridwanpa.coffeeshop.ui.theme.Black

@Composable
fun Navbar(
    title: String,
    onClickBack: () -> Unit,
    modifier: Modifier = Modifier

) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = modifier
    ) {
        Icon(
            painter = painterResource(id = R.drawable.left_outlined), contentDescription = "back",
            modifier = Modifier
                .clip(MaterialTheme.shapes.small)
                .clickable { onClickBack() }
                .padding(vertical = 8.dp)
                .size(18.dp),
            tint = Black
        )
        Text(
            text = title,
            style = MaterialTheme.typography.h4,
            modifier = Modifier.weight(1f),
            textAlign = TextAlign.Center
        )
    }
}