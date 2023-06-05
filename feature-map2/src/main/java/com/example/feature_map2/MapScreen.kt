package com.example.feature_map2

import androidx.activity.compose.BackHandler
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController

@Composable
fun MapScreen(navHostController: NavHostController) {
    Text(text = "Map")
    BackHandler {
        navHostController.popBackStack()
    }

}