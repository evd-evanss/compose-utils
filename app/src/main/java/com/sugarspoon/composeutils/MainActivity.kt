package com.sugarspoon.composeutils

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.TopAppBar
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.sugarspoon.composeutils.text.CustomText
import com.sugarspoon.composeutils.ui.sample.BoldCursive
import com.sugarspoon.composeutils.ui.sample.MonoSpaceTextStyle
import com.sugarspoon.composeutils.ui.sample.SampleScreen
import com.sugarspoon.composeutils.ui.theme.ComposeUtilsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeUtilsTheme {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(MaterialTheme.colors.background),
                    verticalArrangement = Arrangement.Top
                ) {
                    TopAppBar(
                        backgroundColor = Color.Transparent,
                        elevation = 1.dp
                    ) {
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
                                fontSize = 16.sp
                            )
                        )
                    }
                    SampleScreen()
                }
            }
        }
    }
}