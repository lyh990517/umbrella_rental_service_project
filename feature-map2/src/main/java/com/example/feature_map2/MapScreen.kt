package com.example.feature_map2

import androidx.activity.compose.BackHandler
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.feature_map.R
import com.example.screen_util.InputBar
import com.example.screen_util.ScreenTemplate
import com.example.screen_util.TitleBar

@Composable
fun MapScreen(navHostController: NavHostController) {
    ScreenTemplate(navHostController = navHostController) {
        TitleBar(title = "대여소 현황")
        Row() {
            InputBar(
                modifier = Modifier
                    .weight(9f)
                    .padding(horizontal = 10.dp)
            )
            Icon(
                imageVector = Icons.Default.Search,
                contentDescription = "",
                modifier = Modifier
                    .weight(1f)
                    .padding(horizontal = 5.dp)
            )
        }
        Image(
            modifier = Modifier
                .fillMaxWidth()
                .height(400.dp),
            painter = painterResource(id = R.drawable.map),
            contentDescription = ""
        )
    }
}