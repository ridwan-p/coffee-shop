package com.ridwanpa.coffeeshop.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ridwanpa.coffeeshop.R
import com.ridwanpa.coffeeshop.ui.theme.Gray300
import com.ridwanpa.coffeeshop.ui.theme.Gray900

@Composable
fun CardMenu(
    modifier: Modifier = Modifier,
    text:String,
    desc:String,
    price:String,
    painter:Painter
) {
    Card(
        modifier = modifier.background(Color.White),
        shape = RoundedCornerShape(16.dp),
        elevation = 2.dp
    ) {
        Column() {
            Image(
                painter = painter,
                contentDescription = "product",
                contentScale = ContentScale.Crop,
                modifier = Modifier.fillMaxWidth()
                    .height(100.dp)
            )
            Column(Modifier.padding(8.dp)) {
                Column() {
                    Text(text = text, style = MaterialTheme.typography.h4, color = Gray900)
                    Text(
                        text = desc,
                        style = MaterialTheme.typography.body2,
                        color = Gray300
                    )
                }

                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween,
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Text(text = price, style = MaterialTheme.typography.h3, color = Gray900)
                    Button(onClick = { /*TODO*/ }) {
                        Image(
                            painter = painterResource(id = R.drawable.plus_circle),
                            contentDescription = "plus",
                            modifier = Modifier.size(24.dp)
                        )
                    }
                }
            }
        }
    }
}