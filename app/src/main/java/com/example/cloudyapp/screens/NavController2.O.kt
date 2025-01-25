package com.example.cloudyapp.screens

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun NavController2() {
    val navController = rememberNavController()
    NavHost(
        navController = navController, startDestination = "S1"
    ) {
        composable("S1") {
            S1(navController ) // homeScreen se
        }
        composable("S2") {
            S2(navController)
        }
        composable("S3") {
            S3(navController)
        }
        composable("S4") {
            S4(navController)
        }
    }
}