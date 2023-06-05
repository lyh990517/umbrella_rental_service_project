package com.example.feature_detail

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.screen_util.InputBar
import com.example.screen_util.LongCardButton
import com.example.screen_util.ScreenTemplate
import com.example.screen_util.TitleBar
import com.example.screen_util.VerticalSpacer

@Composable
fun SyncCardScreen(navHostController: NavHostController) {
    ScreenTemplate(navHostController = navHostController) {
        TitleBar(title = "결제연동")
        VerticalSpacer(padding = 10)
        Text(text = "카드번호", modifier = Modifier.padding(start = 20.dp))
        VerticalSpacer(padding = 10)
        Row(
            horizontalArrangement = Arrangement.SpaceEvenly,
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 20.dp)
        ) {
            InputBar(modifier = Modifier.weight(3f), hint = "1234")
            Text(text = "", modifier = Modifier.weight(1f))
            InputBar(modifier = Modifier.weight(3f), hint = "5678")
            Text(text = "", modifier = Modifier.weight(1f))
            InputBar(modifier = Modifier.weight(3f), hint = "0000")
            Text(text = "", modifier = Modifier.weight(1f))
            InputBar(modifier = Modifier.weight(3f), hint = "7777")
        }
        VerticalSpacer(padding = 10)
        Row(
            horizontalArrangement = Arrangement.SpaceEvenly,
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 20.dp)
        ) {
            Text(text = "유효기간", modifier = Modifier.padding(start = 20.dp))
            Text(text = "CVC", modifier = Modifier.padding(start = 20.dp))
        }

        Row(
            horizontalArrangement = Arrangement.SpaceEvenly,
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 20.dp)
        ) {
            InputBar(modifier = Modifier.weight(3f), hint = "0000")
            Text(text = "", modifier = Modifier.weight(1f))
            InputBar(modifier = Modifier.weight(3f), hint = "7777")
        }
        VerticalSpacer(padding = 10)
        Text(text = "카드 비밀번호", modifier = Modifier.padding(start = 20.dp))
        Row(
            horizontalArrangement = Arrangement.SpaceEvenly,
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 20.dp)
        ) {
            InputBar(modifier = Modifier.fillMaxWidth(), hint = "1234")
        }
        VerticalSpacer(padding = 10)
        LongCardButton(
            navHostController = navHostController,
            content = "확인",
            destination = "detail"
        )
    }
}