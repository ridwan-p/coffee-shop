package com.ridwanpa.coffeeshop.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.google.accompanist.systemuicontroller.rememberSystemUiController
import com.ridwanpa.coffeeshop.R
import com.ridwanpa.coffeeshop.ui.components.CardMenu
import com.ridwanpa.coffeeshop.ui.theme.Gray300
import com.ridwanpa.coffeeshop.ui.theme.Gray600
import com.ridwanpa.coffeeshop.ui.theme.Gray900

@Composable
fun HomeScreen(navController: NavController) {
    var search by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .verticalScroll(rememberScrollState())
            .padding(bottom = 16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        Box() {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(240.dp)
                    .background(Gray900)
                    .align(Alignment.TopCenter)
            )
            Column(
                modifier = Modifier.padding(horizontal = 32.dp),
                verticalArrangement = Arrangement.spacedBy(24.dp)
            ) {
                Row(
                    horizontalArrangement = Arrangement.SpaceBetween,
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Column() {
                        Text(
                            text = "Ridwan Pamungkas",
                            style = MaterialTheme.typography.h4,
                            color = Color.White
                        )
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            Text(
                                text = "Sewon, Bantul",
                                color = Gray300,
                                style = MaterialTheme.typography.body2
                            )
                            Image(
                                painter = painterResource(id = R.drawable.caret_down),
                                contentDescription = "down",
                                modifier = Modifier.size(12.dp)
                            )
                        }
                    }
                    Image(
                        painter = painterResource(id = R.drawable.avatar),
                        contentDescription = "Avatar",
                        modifier = Modifier.size(42.dp),
                    )
                }
                TextField(
                    modifier = Modifier.fillMaxWidth(),
                    value = search,
                    leadingIcon = {
                        Image(
                            painter = painterResource(id = R.drawable.search),
                            contentDescription = "Search",
                            modifier = Modifier.size(24.dp),
                        )
                    },
                    placeholder = { Text(text = "Search Coffee") },
                    onValueChange = { search = it },
                    shape = MaterialTheme.shapes.medium,
                    colors = TextFieldDefaults.textFieldColors(
                        backgroundColor = Gray600,
                        placeholderColor = Gray300
                    )
                )
                Image(
                    painter = painterResource(id = R.drawable.banner_promo),
                    contentDescription = "banner promo",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier.fillMaxWidth()
                )
            }
        }
        Column(
            modifier = Modifier.padding(horizontal = 32.dp),
            verticalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            Row(
                horizontalArrangement = Arrangement.spacedBy(12.dp)
            ) {
                CardMenu(
                    modifier = Modifier.weight(1f),
                    text = "Cappuccino",
                    desc = "with Chocolate",
                    price = "20K",
                    painter = painterResource(id = R.drawable.cappucino)
                )
                CardMenu(
                    modifier = Modifier.weight(1f),
                    text = "Latte",
                    desc = "with Oat Milk",
                    price = "22K",
                    painter = painterResource(id = R.drawable.latte)
                )
            }
            Row(
                horizontalArrangement = Arrangement.spacedBy(12.dp)
            ) {
                CardMenu(
                    modifier = Modifier.weight(1f),
                    text = "Mochaccino",
                    desc = "with Chocolate",
                    price = "22K",
                    painter = painterResource(id = R.drawable.mochaccino)
                )
                CardMenu(
                    modifier = Modifier.weight(1f),
                    text = "Cappuccino",
                    desc = "with Oat Milk",
                    price = "20K",
                    painter = painterResource(id = R.drawable.cappucino2)
                )
            }
        }
    }
}