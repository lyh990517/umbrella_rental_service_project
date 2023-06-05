package com.example.umbrellarentalserviceproject

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.feature_extend.ExtendScreen
import com.example.feature_home.HomeScreen
import com.example.feature_info.InfoScreen
import com.example.feature_lost_extend_home.LostExtendScreen
import com.example.feature_map2.MapScreen
import com.example.feature_review.ReviewScreen
import com.example.lost.LostScreen

@Composable
fun UmbrellaApp(navController: NavHostController = rememberNavController()) {
    NavHost(navController = navController, startDestination = "Home") {
        composable("Home") {
            HomeScreen(navController = navController)
        }
        composable("Info") {
            InfoScreen(navHostController = navController)
        }
        composable("lostExtendHome") {
            LostExtendScreen(navHostController = navController)
        }
        composable("lost") {
            LostScreen(navHostController = navController)
        }
        composable("extend") {
            ExtendScreen(navController = navController)
        }
        composable("map") {
            MapScreen(navHostController = navController)
        }
        composable("review") {
            ReviewScreen(navHostController = navController)
        }
        composable("detail") {

        }
        composable("login") {

        }
        composable("findPw") {

        }
        composable("signup") {

        }
    }
}