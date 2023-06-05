package com.example.feature_lost_extend_home

import androidx.activity.compose.BackHandler
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.screen_util.CardItemTemplate
import com.example.screen_util.ScreenTemplate

@Composable
fun LostExtendScreen(navHostController: NavHostController) {
    ScreenTemplate(navHostController = navHostController) {
        Spacer(modifier = Modifier.padding(vertical = 30.dp))
        Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Center) {
            Text(text = "연장신청/분실신고", fontSize = 40.sp)
        }
        Spacer(modifier = Modifier.padding(vertical = 10.dp))
        CardItemTemplate(navHostController, "연장신청", "")
        Spacer(modifier = Modifier.padding(vertical = 10.dp))
        CardItemTemplate(navHostController, "분실신고", "")
    }
    BackHandler {
        navHostController.popBackStack()
    }
}

@Preview
@Composable
fun Preview(){

}