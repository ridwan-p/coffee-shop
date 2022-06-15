package com.ridwanpa.coffeeshop.ui.theme

import androidx.compose.material.MaterialTheme
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable


private val LightColorPalette = lightColors(
    primary = Tussock,
    onPrimary = Gray200,
    primaryVariant = Purple700,
    secondary = Teal200,
    background = Gray100,
    onBackground = Black

    /* Other default colors to override
    background = Color.White,
    surface = Color.White,
    onPrimary = Color.White,
    onSecondary = Color.Black,
    onBackground = Color.Black,
    onSurface = Color.Black,
    */
)

@Composable
fun CoffeeShopTheme(content: @Composable () -> Unit) {
    val colors = LightColorPalette
//    val systemUiController = rememberSystemUiController()
//    systemUiController.setSystemBarsColor(
//        color = Color.Transparent
//    )
//    systemUiController.isStatusBarVisible = false // Status bar
//    systemUiController.isNavigationBarVisible = false // Navigation bar
//    systemUiController.isSystemBarsVisible = false // Status & Navigation bars

    MaterialTheme(
        colors = colors,
        typography = Typography,
        shapes = Shapes,
        content = content
    )
}