package com.example.feature_review

import androidx.activity.compose.BackHandler
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.screen_util.DefaultCardButton
import com.example.screen_util.InputBar
import com.example.screen_util.ScreenTemplate
import com.example.screen_util.TitleBar
import com.example.screen_util.VerticalSpacer

@Composable
fun ReviewScreen(navHostController: NavHostController) {
    ScreenTemplate(navHostController = navHostController) {
        TitleBar(title = "리뷰 작성")
        VerticalSpacer(padding = 10)
        InputBar(
            Modifier
                .padding(horizontal = 20.dp)
                .fillMaxWidth()
        )
        VerticalSpacer(padding = 10)
        Text(text = "내용", modifier = Modifier.padding(start = 20.dp), fontSize = 25.sp)
        VerticalSpacer(padding = 10)
        InputBar(
            Modifier
                .height(200.dp)
                .padding(horizontal = 20.dp)
                .fillMaxWidth()
        )
        VerticalSpacer(padding = 10)
        Row(
            Modifier
                .fillMaxWidth()
                .padding(horizontal = 20.dp), horizontalArrangement = Arrangement.End
        ) {
            DefaultCardButton(navHostController = navHostController, content = "작성하기", "")
        }
        VerticalSpacer(padding = 10)
    }
}