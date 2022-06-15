package com.ridwanpa.coffeeshop.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.ridwanpa.coffeeshop.R
import com.ridwanpa.coffeeshop.routes.Route

@Composable
fun OnBoardingScreen(
    navController: NavController
) {
    Column(
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        Image(
            painter = painterResource(id = R.drawable.bg_coffee),
            contentDescription = "Background",
            contentScale = ContentScale.Crop,
            alignment = Alignment.BottomCenter,
            modifier = Modifier
                .fillMaxWidth()
        )
        Column(
            modifier = Modifier.padding(horizontal = 32.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(24.dp)
        ) {
            Column() {
                Text(
                    text = "COFFEE SO GOOD, YOUR TASTE BUDS WILL LOVE IT.",
                    color = Color(0xFF613921),
                    textAlign = TextAlign.Center,
                    style = MaterialTheme.typography.h2,
                    fontSize = 28.sp
                )
                Text(
                    text = "The best grain, the finest roast, the powerful flavor",
                    color = Color(0xFF696969),
                    textAlign = TextAlign.Center,
                    style = MaterialTheme.typography.body1
                )
            }
            Button(
                onClick = { navController.navigate(Route.HomeScreen.name)},
                contentPadding = PaddingValues(16.dp),
                shape = MaterialTheme.shapes.medium,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 16.dp)
            ) {
                Text(text = "Get Started")
            }
        }
    }
}