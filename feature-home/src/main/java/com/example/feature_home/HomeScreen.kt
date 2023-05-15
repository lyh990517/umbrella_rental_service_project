package com.example.feature_home

import androidx.activity.compose.BackHandler
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController

@Composable
fun HomeScreen(navController: NavHostController) {
    Text(text = "Home")
    BackHandler {
        navController.popBackStack()
    }

}