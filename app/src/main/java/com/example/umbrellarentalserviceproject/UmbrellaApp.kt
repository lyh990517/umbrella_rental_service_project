package com.example.umbrellarentalserviceproject

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.feature_home.HomeScreen

@Composable
fun UmbrellaApp(navController:NavHostController = rememberNavController()){
    NavHost(navController = navController, startDestination = "Home" ){
        composable("Home"){
            HomeScreen(navController = navController)
        }
        composable("Info"){

        }
        composable("lostExtendHome"){

        }
        composable("lost"){

        }
        composable("extend"){

        }
        composable("map"){

        }
        composable("review"){

        }
        composable("detail"){

        }
        composable("login"){

        }
        composable("findPw"){

        }
        composable("signup"){

        }
    }
}