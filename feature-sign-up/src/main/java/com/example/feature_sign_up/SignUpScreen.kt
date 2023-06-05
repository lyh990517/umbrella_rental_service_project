package com.example.feature_sign_up

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.screen_util.DefaultCardButton
import com.example.screen_util.InputBar
import com.example.screen_util.ScreenTemplate
import com.example.screen_util.TitleBar
import com.example.screen_util.VerticalSpacer

@Composable
fun SignUpScreen(navHostController: NavHostController) {
    ScreenTemplate(navHostController = navHostController) {
        TitleBar(title = "회원가입")
        VerticalSpacer(padding = 10)
        Row(
            Modifier
                .fillMaxWidth()
                .padding(horizontal = 20.dp), horizontalArrangement = Arrangement.End
        ) {
            DefaultCardButton(navHostController = navHostController, content = "제출하기", "")
        }
        Row(Modifier.fillMaxWidth().padding(start = 20.dp), horizontalArrangement = Arrangement.Start) {
            Text(text = "아이디")
        }
        VerticalSpacer(padding = 5)
        InputBar(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 20.dp), hint = "아이디"
        )
        Row(Modifier.fillMaxWidth().padding(start = 20.dp), horizontalArrangement = Arrangement.Start) {
            Text(text = "비밀번호")
        }
        VerticalSpacer(padding = 5)
        InputBar(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 20.dp), hint = "비밀번호"
        )
        Row(Modifier.fillMaxWidth().padding(start = 20.dp), horizontalArrangement = Arrangement.Start) {
            Text(text = "비밀번호 확인")
        }
        VerticalSpacer(padding = 5)
        InputBar(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 20.dp), hint = "비밀번호 확인"
        )
        Row(Modifier.fillMaxWidth().padding(start = 20.dp), horizontalArrangement = Arrangement.Start) {
            Text(text = "이름")
        }
        VerticalSpacer(padding = 5)
        InputBar(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 20.dp), hint = "이름"
        )
    }
}