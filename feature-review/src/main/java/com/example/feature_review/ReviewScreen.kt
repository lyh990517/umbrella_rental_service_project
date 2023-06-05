package com.example.feature_review

import androidx.activity.compose.BackHandler
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController

@Composable
fun ReviewScreen(navHostController: NavHostController){
    Text(text = "review")
    BackHandler {
        navHostController.popBackStack()
    }
}