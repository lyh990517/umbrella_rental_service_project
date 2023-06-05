package com.example.feature_info

import androidx.activity.compose.BackHandler
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.screen_util.CardItemTemplate
import com.example.screen_util.ScreenTemplate

@Composable
fun InfoScreen(navHostController: NavHostController) {
    ScreenTemplate(navHostController = navHostController) {
        Spacer(modifier = Modifier.padding(vertical = 30.dp))
        Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Center) {
            Text(text = "홍길동님 안녕하세요.", fontSize = 40.sp)
        }
        Spacer(modifier = Modifier.padding(vertical = 10.dp))
        CardItemTemplate(navHostController, "상세정보", "")
        Spacer(modifier = Modifier.padding(vertical = 10.dp))
        CardItemTemplate(navHostController, "결제연동", "")
        Spacer(modifier = Modifier.padding(vertical = 10.dp))
        CardItemTemplate(navHostController, "로그아웃", "")
    }
}