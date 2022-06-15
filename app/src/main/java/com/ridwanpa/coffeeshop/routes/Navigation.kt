package com.ridwanpa.coffeeshop.routes

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.selection.selectableGroup
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.google.accompanist.systemuicontroller.rememberSystemUiController
import com.ridwanpa.coffeeshop.ui.screens.HomeScreen
import com.ridwanpa.coffeeshop.ui.screens.OnBoardingScreen
import com.ridwanpa.coffeeshop.ui.screens.OrderScreen
import com.ridwanpa.coffeeshop.ui.theme.Gray300
import com.ridwanpa.coffeeshop.ui.theme.Gray900

@Composable
fun Navigation() {
    val navController = rememberNavController()
    val systemUiController = rememberSystemUiController()

    NavHost(navController = navController, startDestination = Route.OnBoardingScreen.name) {
        composable(Route.OnBoardingScreen.name) {
            systemUiController.setStatusBarColor(MaterialTheme.colors.background)
            OnBoardingScreen(navController)
        }
        composable(Route.HomeScreen.name) {
            systemUiController.setStatusBarColor(Gray900)
            MainView(navController) {
                HomeScreen(navController)
            }
        }
        composable(Route.OrderScreen.name) {
            systemUiController.setStatusBarColor(MaterialTheme.colors.background)
            OrderScreen(navController)
        }
    }
}

@Composable
fun MainView(
    navController: NavController,
    content: @Composable BoxScope.() -> Unit
) {
    Scaffold(bottomBar = { BottomNavigationBar(navController) }) { padding ->
        Box(Modifier.padding(padding), content = content)
    }
}

@Composable
fun BottomNavigationBar(navController: NavController) {
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentDestination = navBackStackEntry?.destination
    val items = listOf(
        NavigationItem.Home,
        NavigationItem.Like,
        NavigationItem.Order,
        NavigationItem.Notification
    )

    BottomNavigation(
        backgroundColor = Color.White,
        contentColor = Gray300,
        elevation = 16.dp,
        shape = RoundedCornerShape(topStart = 16.dp, topEnd = 16.dp)
    ) {
        items.forEach { item ->
            val selected =
                currentDestination?.hierarchy?.any { item.route == it.route } == true
            BottomNavigationItem(
                modifier = Modifier.padding(vertical = 8.dp),
                selected = selected,
                icon = {
                    val modifierActive = if (selected) {
                        Modifier
                            .clip(CircleShape)
                            .background(MaterialTheme.colors.primary)
                            .padding(8.dp)
                    } else {
                        Modifier
                    }

                    Icon(
                        painter = painterResource(id = item.icon),
                        contentDescription = "menu",
                        modifier = modifierActive.size(24.dp),
                        tint = if (selected) Color.White else Gray300
                    )
                },
                onClick = {
                    navController.navigate(item.route) {
                        // Pop up to the start destination of the graph to
                        // avoid building up a large stack of destinations
                        // on the back stack as users select items
                        navController.graph.findNode(Route.HomeScreen.name)?.let {
                            popUpTo(it.id) {
                                saveState = true
                            }
                        }
                        // Avoid multiple copies of the same destination when
                        // reselecting the same item
                        launchSingleTop = true
                        // Restore state when reselecting a previously selected item
                        restoreState = true
                    }
                }
            )
        }
    }
}

@Composable
fun BottomNavigation(
    modifier: Modifier = Modifier,
    backgroundColor: Color = MaterialTheme.colors.primarySurface,
    contentColor: Color = contentColorFor(backgroundColor),
    elevation: Dp = BottomNavigationDefaults.Elevation,
    shape: Shape = MaterialTheme.shapes.medium,
    content: @Composable RowScope.() -> Unit
) {
    Surface(
        color = backgroundColor,
        contentColor = contentColor,
        elevation = elevation,
        shape = shape,
        modifier = modifier
    ) {
        Row(
            Modifier
                .fillMaxWidth()
                .height(BottomNavigationHeight)
                .selectableGroup(),
            horizontalArrangement = Arrangement.SpaceBetween,
            content = content
        )
    }
}

/**
 * Height of a [BottomNavigation] component
 */
private val BottomNavigationHeight = 56.dp
