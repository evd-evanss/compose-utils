package com.sugarspoon.composeutils.ui.main

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.sugarspoon.composeutils.R
import com.sugarspoon.composeutils.grids.Grids
import com.sugarspoon.composeutils.text.CustomText
import com.sugarspoon.composeutils.ui.resources.BoldCursive
import com.sugarspoon.composeutils.ui.resources.MonoSpaceTextStyle
import com.sugarspoon.composeutils.ui.resources.SpacingVertical
import com.sugarspoon.composeutils.ui.sample.SampleScreen
import com.sugarspoon.composeutils.ui.theme.ComposeUtilsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeUtilsTheme {
                var enableGrids by remember {
                    mutableStateOf(false)
                }
                val scaffoldState = rememberScaffoldState()

                Scaffold(
                    scaffoldState = scaffoldState,
                    topBar = { CustomTopAppBar() },
                    drawerContent = { Text("Drawer content") },
                    bottomBar = {
                        BottomAppBar(cutoutShape = CircleShape) {}
                    },
                    floatingActionButton = {
                        ExtendedFloatingActionButton(
                            text = {
                                Text(
                                    text = stringResource(id = R.string.enable_grids_button_title),
                                    style = MonoSpaceTextStyle.copy(fontSize = 16.sp)
                                )
                            },
                            onClick = { enableGrids = !enableGrids }
                        )
                    },
                    floatingActionButtonPosition = FabPosition.Center,
                    isFloatingActionButtonDocked = true,
                    content = { innerPadding ->
                        innerPadding.apply {
                            SampleScreen()
                        }
                    }
                )
                Grids(
                    size = 16.dp,
                    enable = enableGrids
                )
            }
        }
    }
}

@Composable
fun CustomTopAppBar() {
    TopAppBar(
        backgroundColor = Color.Transparent,
        elevation = 0.dp
    ) {
        Column {
            CustomText(
                text = stringResource(id = R.string.app_name),
                modifier = Modifier.padding(start = 16.dp),
                customArea = listOf(
                    BoldCursive.copy(
                        textStyle = BoldCursive.textStyle.copy(
                            color = Color.DarkGray,
                            fontSize = 20.sp
                        ),
                        text = "Utils"
                    )
                ),
                textStyleDefault = MonoSpaceTextStyle.copy(
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold
                )
            )
            SpacingVertical()
            Divider()
        }
    }
}