package com.ridwanpa.coffeeshop.routes

sealed class Route(val name: String) {
    object OnBoardingScreen : Route("on_boarding")
    object HomeScreen : Route("home")
    object OrderScreen : Route("order")
    object LikeScreen : Route("like")
    object NotificationScreen : Route("notification")

//    fun withArgs(vararg args: String): String {
//        return buildString {
//            append(name)
//            args.forEach { append("/$it") }
//        }
//    }
}