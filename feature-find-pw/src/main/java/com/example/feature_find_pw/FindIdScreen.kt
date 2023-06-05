package com.example.feature_find_pw

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.screen_util.DefaultCardButton
import com.example.screen_util.InputBar
import com.example.screen_util.LongCardButton
import com.example.screen_util.ScreenTemplate
import com.example.screen_util.TitleBar
import com.example.screen_util.VerticalSpacer

@Composable
fun FindIdScreen(navHostController: NavHostController) {
    ScreenTemplate(navHostController = navHostController) {
        TitleBar(title = "ID 찾기")
        VerticalSpacer(padding = 20)
        Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Center) {
            Text(text = "회원정보에 등록한 휴대전화로 인증")
        }
        VerticalSpacer(padding = 10)
        InputBar(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 20.dp), hint = "이름"
        )
        VerticalSpacer(padding = 10)
        Row(
            modifier = Modifier
                .fillMaxWidth()
        ) {
            InputBar(
                modifier = Modifier
                    .weight(8f)
                    .padding(horizontal = 20.dp), hint = "휴대폰 번호"
            )
            DefaultCardButton(
                navHostController = navHostController,
                content = "인증",
                destination = ""
            )
        }
        VerticalSpacer(padding = 10)
        InputBar(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 20.dp), hint = "인증번호"
        )
        VerticalSpacer(padding = 10)
        LongCardButton(navHostController = navHostController, content = "확인", destination = "")
    }
}