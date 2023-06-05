package com.example.feature_extend

import androidx.activity.compose.BackHandler
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowLeft
import androidx.compose.material.icons.filled.KeyboardArrowRight
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.screen_util.InputBar
import com.example.screen_util.ScreenTemplate
import com.example.screen_util.TitleBar

@Composable
fun ExtendScreen(navController: NavHostController) {
    ScreenTemplate(navHostController = navController) {
        TitleBar(title = "연장신청")
        InputBar(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 20.dp)
        )
        Row(
            Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                modifier = Modifier.weight(1f),
                imageVector = Icons.Default.KeyboardArrowLeft,
                contentDescription = ""
            )
            Image(
                modifier = Modifier
                    .weight(8f)
                    .height(300.dp),
                painter = painterResource(id = R.drawable.calendar),
                contentDescription = ""
            )
            Icon(
                modifier = Modifier.weight(1f),
                imageVector = Icons.Default.KeyboardArrowRight,
                contentDescription = ""
            )
        }
    }
}