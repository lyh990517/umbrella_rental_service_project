package com.example.feature_login

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.screen_util.BottomNav
import com.example.screen_util.InputBar
import com.example.screen_util.LongCardButton
import com.example.screen_util.ScreenTemplate
import com.example.screen_util.TitleBar
import com.example.screen_util.VerticalSpacer

@Composable
fun LoginScreen(navHostController: NavHostController) {
    ScreenTemplate(navHostController = navHostController) {
        TitleBar(title = "Login")
        VerticalSpacer(padding = 30)
        InputBar(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 20.dp)
        )
        VerticalSpacer(padding = 10)
        InputBar(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 20.dp)
        )
        VerticalSpacer(padding = 10)
        LongCardButton(
            navHostController = navHostController,
            content = "로그인",
            "Info",
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 20.dp)
        )
        VerticalSpacer(padding = 20)
        BottomNav(
            navController = navHostController,
            item1 = "ID 찾기",
            item2 = "PW 찾기",
            item3 = "회원가입",
            destination1 = "findId",
            destination2 = "findPw",
            destination3 = "signUp"
        )
    }
}