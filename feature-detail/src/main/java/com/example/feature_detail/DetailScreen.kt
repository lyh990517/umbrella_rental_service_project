package com.example.feature_detail

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.screen_util.DefaultCardButton
import com.example.screen_util.ScreenTemplate
import com.example.screen_util.TitleBar
import com.example.screen_util.VerticalSpacer

@Composable
fun DetailScreen(navHostController: NavHostController) {
    ScreenTemplate(navHostController = navHostController) {
        TitleBar(title = "상세정보")
        VerticalSpacer(padding = 10)
        item("이름", "홍길동")
        VerticalSpacer(padding = 10)
        item("아이디", "hong1234")
        VerticalSpacer(padding = 10)
        item("생년월일", "1900-01-01")
        VerticalSpacer(padding = 10)
        item("성별", "남성")
        VerticalSpacer(padding = 10)
        item("휴대전화", "010-9999-9999")
        VerticalSpacer(padding = 10)
        item("결제수단", "카드: 1234-5678-911")
        VerticalSpacer(padding = 10)
        Row(
            Modifier
                .fillMaxWidth()
                .padding(horizontal = 20.dp), horizontalArrangement = Arrangement.End
        ) {
            DefaultCardButton(navHostController = navHostController, content = "변경하기", "")
        }
    }
}

@Composable
private fun item(title: String, desc: String) {
    Row(
        Modifier
            .fillMaxWidth()
            .padding(horizontal = 20.dp), horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Text(text = title, fontSize = 25.sp)
        Text(text = desc, fontSize = 25.sp)
    }
}