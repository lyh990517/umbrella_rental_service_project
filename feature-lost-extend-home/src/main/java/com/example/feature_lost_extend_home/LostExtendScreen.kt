package com.example.feature_lost_extend_home

import androidx.activity.compose.BackHandler
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController

@Composable
fun LostExtendScreen(navHostController: NavHostController) {
    Text(text = "Lost")
    BackHandler {
        navHostController.popBackStack()
    }
}