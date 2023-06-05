package com.example.screen_util

import androidx.activity.compose.BackHandler
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavDestination
import androidx.navigation.NavHostController

@Composable
fun CardItemTemplate(navHostController: NavHostController, itemTitle: String, destination: String) {
    Card(
        Modifier
            .fillMaxWidth()
            .height(70.dp)
            .padding(horizontal = 20.dp)
            .clickable {
                navHostController.navigate(destination)
            }
            .background(Color(LocalContext.current.getColor(R.color.main))),
        border = BorderStroke(2.dp, Color.Black),
    ) {
        Box(
            Modifier
                .fillMaxSize()
                .background(Color(LocalContext.current.getColor(R.color.main)))
        ) {
            Column() {
                Row(
                    horizontalArrangement = Arrangement.Center,
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier.fillMaxSize()
                ) {
                    Text(text = itemTitle, fontSize = 40.sp)
                }
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun InputBar(modifier: Modifier, hint: String = "") {
    val state = rememberSaveable {
        mutableStateOf(String())

    }
    OutlinedTextField(
        placeholder = { Text(text = hint) },
        value = state.value,
        onValueChange = { state.value = it },
        modifier = modifier
            .background(Color.White),
        keyboardActions = KeyboardActions(onSearch = {
        }),
        keyboardOptions = KeyboardOptions.Default.copy(imeAction = ImeAction.Search)
    )
}

@Composable
fun TitleBar(title: String) {
    Spacer(modifier = Modifier.padding(vertical = 30.dp))
    Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Center) {
        Text(text = title, fontSize = 40.sp)
    }
}

@Composable
fun VerticalSpacer(padding: Int) {
    Spacer(modifier = Modifier.padding(vertical = padding.dp))
}

@Composable
fun ScreenTemplate(
    navHostController: NavHostController,
    content: @Composable ColumnScope.() -> Unit
) {
    Column(
        Modifier
            .fillMaxSize()
            .background(color = Color(LocalContext.current.getColor(R.color.main))),
        verticalArrangement = Arrangement.Bottom
    ) {
        TopMenu(navHostController)
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .height(500.dp)
                .background(Color(LocalContext.current.getColor(R.color.main)))
                .padding(horizontal = 20.dp),
            border = BorderStroke(2.dp, color = Color.Black)
        ) {
            Box(
                Modifier
                    .fillMaxSize()
                    .background(Color(LocalContext.current.getColor(R.color.main)))
            ) {
                Column() {
                    content()
                }
            }
        }
        Spacer(modifier = Modifier.padding(vertical = 70.dp))
        BottomNav(navHostController)
    }
    BackHandler {
        navHostController.popBackStack()
    }
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
        DefaultCardButton(
            navHostController = navHostController,
            content = "내정보",
            destination = "login"
        )
    }
}

@Composable
fun DefaultCardButton(
    navHostController: NavHostController,
    content: String,
    destination: String,
    modifier: Modifier = Modifier
) {
    Card(border = BorderStroke(2.dp, Color.Black)) {
        Box(
            modifier
                .background(Color(LocalContext.current.getColor(R.color.main)))
        ) {
            Column() {
                Text(
                    modifier = Modifier
                        .padding(10.dp)
                        .clickable {
                            navHostController.navigate(destination)
                        }, text = content
                )
            }
        }
    }
}

@Composable
fun LongCardButton(
    navHostController: NavHostController,
    content: String,
    destination: String,
    modifier: Modifier = Modifier
) {
    Card(
        border = BorderStroke(2.dp, Color.Black), modifier = Modifier
            .padding(
                horizontal = 20.dp
            )
            .height(50.dp)
            .clickable {
                navHostController.navigate(destination)
            }
    ) {
        Box(
            modifier
                .fillMaxSize()
        ) {
            Row(
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(
                    modifier = Modifier
                        .padding(10.dp), text = content
                )
            }
        }
    }
}

@Composable
fun BottomNav(
    navController: NavHostController,
    item1: String = "대여소 \n 현황",
    item2: String = "연장\n/분실",
    item3: String = "리뷰\n작성",
    destination1: String = "map",
    destination2: String = "lostExtendHome",
    destination3: String = "review"
) {
    Row(
        Modifier
            .fillMaxWidth()
            .padding(bottom = 50.dp),
        horizontalArrangement = Arrangement.SpaceAround
    ) {
        Text(text = item1, fontSize = 18.sp, modifier = Modifier.clickable {
            navController.navigate(destination1)
        })
        Text(text = item2, fontSize = 18.sp, modifier = Modifier.clickable {
            navController.navigate(destination2)
        })
        Text(text = item3, fontSize = 18.sp, modifier = Modifier.clickable {
            navController.navigate(destination3)
        })
    }
}

