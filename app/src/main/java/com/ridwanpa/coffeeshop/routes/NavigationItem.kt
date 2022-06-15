package com.ridwanpa.coffeeshop.routes

import com.ridwanpa.coffeeshop.R

sealed class NavigationItem(val route: String, val icon: Int) {
    object Home : NavigationItem(route = Route.HomeScreen.name, icon = R.drawable.ic_home)
    object Like : NavigationItem(route = Route.LikeScreen.name, icon = R.drawable.ic_like)
    object Order : NavigationItem(route = Route.OrderScreen.name, icon = R.drawable.ic_cart)
    object Notification : NavigationItem(route = Route.NotificationScreen.name, icon = R.drawable.ic_notification)
}