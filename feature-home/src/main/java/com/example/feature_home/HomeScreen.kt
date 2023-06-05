package com.example.feature_home

import androidx.activity.compose.BackHandler
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
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
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController

@Composable
fun HomeScreen(navController: NavHostController = rememberNavController()) {
    Column(
        Modifier
            .fillMaxSize()
            .background(color = Color(LocalContext.current.getColor(R.color.main))),
        verticalArrangement = Arrangement.Bottom
    ) {
        TopMenu(navController)
        ImageView()
        Spacer(modifier = Modifier.padding(vertical = 70.dp))
        BottomNav(navController)
    }
    BackHandler {
        navController.popBackStack()
    }

}


@Composable
fun ImageView() {
    Image(
        modifier = Modifier
            .fillMaxWidth()
            .height(500.dp)
            .padding(start = 20.dp, end = 20.dp),
        painter = painterResource(id = R.drawable.sample_home),
        contentDescription = "sample"
    )
}

@Composable
fun TopMenu(navHostController: NavHostController) {
    Row(
        Modifier
            .fillMaxWidth()
            .padding(horizontal = 20.dp)
            .height(40.dp),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Image(
            modifier = Modifier.size(30.dp),
            painter = painterResource(id = R.drawable.qr_code_scanner),
            contentDescription = "qr"
        )
        Card(border = BorderStroke(2.dp, Color.Black)) {
            Text(
                modifier = Modifier
                    .padding(5.dp)
                    .clickable {
                        navHostController.navigate("Info")
                    }, text = "내정보"
            )
        }
    }
}
@Composable
fun BottomNav(navController: NavHostController) {
    Row(
        Modifier
            .fillMaxWidth()
            .padding(bottom = 50.dp),
        horizontalArrangement = Arrangement.SpaceAround
    ) {
        Text(text = "대여소 \n 현황", fontSize = 18.sp, modifier = Modifier.clickable {
            navController.navigate("map")
        })
        Text(text = "연장\n/분실", fontSize = 18.sp, modifier = Modifier.clickable {
            navController.navigate("lostExtendHome")
        })
        Text(text = "리뷰\n작성", fontSize = 18.sp, modifier = Modifier.clickable {
            navController.navigate("review")
        })
    }
}

@Preview
@Composable
fun BottomNavPreview() {
}

@Preview
@Composable
fun TopMenuPreview() {
}


@Preview
@Composable
fun HomePreview() {
    HomeScreen()
}