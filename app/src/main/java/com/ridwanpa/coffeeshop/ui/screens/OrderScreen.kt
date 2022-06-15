package com.ridwanpa.coffeeshop.ui.screens

import androidx.compose.foundation.*
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.ridwanpa.coffeeshop.R
import com.ridwanpa.coffeeshop.routes.Route
import com.ridwanpa.coffeeshop.ui.components.Navbar
import com.ridwanpa.coffeeshop.ui.components.TabMenu
import com.ridwanpa.coffeeshop.ui.theme.*

@Composable
fun OrderScreen(navController: NavController) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxSize()
    ) {
        Navbar(
            title = "Order",
            onClickBack = { navController.popBackStack() },
            modifier = Modifier.padding(horizontal = 32.dp)
        )
        Spacer(modifier = Modifier.height(4.dp))
        Column(
            verticalArrangement = Arrangement.spacedBy(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .weight(1f)
                .verticalScroll(rememberScrollState())
        ) {
            TabMenu(modifier = Modifier.defaultMinSize(minWidth = 258.dp))
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 32.dp),
                horizontalAlignment = Alignment.Start
            ) {
                Text(
                    text = "Delivery Address",
                    color = Color(0xFF613921),
                    style = MaterialTheme.typography.h4
                )
                Text(
                    text = "Pelemsewu No. 354 RT 07",
                    color = Gray500
                )
                Text(
                    text = "Sewon, Bantul , Yogyakarta",
                    color = Gray300
                )
                Spacer(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 8.dp)
                        .height(1.dp)
                        .background(Gray200)
                )
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 32.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.cappucino),
                    contentDescription = "item",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .size(42.dp)
                        .clip(MaterialTheme.shapes.medium)
                )
                Column(Modifier.weight(1f)) {
                    Text(text = "Cappucino", style = MaterialTheme.typography.h4)
                    Text(
                        text = "with Chocolate",
                        style = MaterialTheme.typography.body2,
                        color = Gray500
                    )
                }
                Row(
                    horizontalArrangement = Arrangement.spacedBy(6.dp),
                ) {
                    Icon(
                        painter = painterResource(id = R.drawable.plus_circle),
                        contentDescription = "plus",
                        tint = Black,
                        modifier = Modifier.size(24.dp)
                    )
                    Text(text = "1", fontWeight = FontWeight.SemiBold)
                    Icon(
                        painter = painterResource(id = R.drawable.minus_circle),
                        contentDescription = "plus",
                        tint = Black,
                        modifier = Modifier.size(24.dp)
                    )
                }
            }

            Spacer(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(3.dp)
                    .background(Gray200)
            )
            Box(Modifier.padding(horizontal = 32.dp)) {
                Button(
                    onClick = { /*TODO*/ },
                    border = BorderStroke(1.dp, MaterialTheme.colors.primary),
                    colors = ButtonDefaults.buttonColors(
                        backgroundColor = Gray100,
                        contentColor = Black,
                    ),
                    elevation = ButtonDefaults.elevation(defaultElevation = 0.dp),
                    contentPadding = PaddingValues(vertical = 12.dp, horizontal = 16.dp),
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.spacedBy(4.dp),
                    ) {
                        Icon(
                            painter = painterResource(id = R.drawable.ic_dicount),
                            contentDescription = "discount",
                            modifier = Modifier.size(18.dp),
                            tint = MaterialTheme.colors.primary
                        )
                        Text(
                            text = "1 Discount is applied",
                            style = MaterialTheme.typography.h5,
                            modifier = Modifier.weight(1f)
                        )
                        Icon(
                            painter = painterResource(id = R.drawable.right_outlined),
                            contentDescription = "right",
                            modifier = Modifier.size(16.dp),
                            tint = MaterialTheme.colors.onBackground
                        )
                    }
                }
            }
            Column(
                modifier = Modifier.padding(horizontal = 32.dp)
            ) {
                Text(text = "Payment Summary", style = MaterialTheme.typography.h4)
                Spacer(modifier = Modifier.height(4.dp))
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Text(text = "Price")
                    Text(
                        text = "20K",
                        fontWeight = FontWeight.Bold
                    )
                }
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Text(text = "Delivery Fee")
                    Text(
                        text = "2K",
                        fontWeight = FontWeight.Bold
                    )
                }
                Spacer(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 8.dp)
                        .height(1.dp)
                        .background(Gray200)
                )
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Text(
                        text = "Total Payment",
                        fontWeight = FontWeight.Bold
                    )
                    Text(
                        text = "22K",
                        fontWeight = FontWeight.Bold
                    )
                }
            }

        }
        Surface(
            elevation = 8.dp,
            shape = RoundedCornerShape(topStart = 16.dp, topEnd = 16.dp)
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 32.dp, vertical = 12.dp)
                    .background(Color.White),
                verticalArrangement = Arrangement.spacedBy(12.dp)
            ) {
                Row(modifier = Modifier.fillMaxWidth()) {
                    Row(
                        modifier = Modifier.weight(1f),
                        horizontalArrangement = Arrangement.spacedBy(4.dp)
                    ) {
                        Icon(
                            painter = painterResource(id = R.drawable.ic_cash),
                            contentDescription = "cash",
                            modifier = Modifier.size(24.dp),
                            tint = MaterialTheme.colors.primary
                        )
                        Row(
                            modifier = Modifier
                                .clip(RoundedCornerShape(100))
                                .background(Color(0xFFE2E2E2))
                        ) {
                            Text(
                                text = "Cash",
                                style = MaterialTheme.typography.body2,
                                color = MaterialTheme.colors.onPrimary,
                                modifier = Modifier
                                    .clip(RoundedCornerShape(100))
                                    .background(MaterialTheme.colors.primary)
                                    .padding(vertical = 2.dp, horizontal = 6.dp)
                            )
                            Text(
                                text = "22K",
                                style = MaterialTheme.typography.body2,
                                color = MaterialTheme.colors.onBackground,
                                modifier = Modifier
                                    .padding(vertical = 2.dp, horizontal = 6.dp)
                            )
                        }
                    }
                    Image(
                        painter = painterResource(id = R.drawable.ic_menu),
                        contentDescription = "cash",
                        modifier = Modifier.size(24.dp)
                    )
                }

                Button(
                    onClick = { navController.navigate(Route.HomeScreen.name) },
                    contentPadding = PaddingValues(16.dp),
                    shape = MaterialTheme.shapes.medium,
                    modifier = Modifier
                        .fillMaxWidth()
                ) {
                    Text(text = "Order")
                }
            }
        }
    }
}