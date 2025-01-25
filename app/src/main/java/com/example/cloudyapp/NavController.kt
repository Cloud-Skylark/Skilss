package com.example.cloudyapp

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun AppNavigation() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "HomeScreen") {
       // This One For Home Screen Demo Perpuse =========================
/*        composable(route = "HomeScreen") {
            HomeScreen(navController)
        }
        composable(route = "DetailsScreen") {
            DetailsScreen()
        }*/


        // This One For Profile Screen ------------------------------
        composable(route = "HomeScreen") {
            HomeScreen(navController)
        }
        composable(route = "ProfileCard") {
            ProfileCard(navController)
        }
        composable(route = "DetailsScreen") {
            DetailsScreen()
        }
        composable(route = "Skills") {
            Skills()
        }
        composable(route = "ProfileCard") {
            ProfileCard(navController)
        }
    }
}