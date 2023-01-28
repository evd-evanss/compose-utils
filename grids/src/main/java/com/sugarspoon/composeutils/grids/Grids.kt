package com.sugarspoon.composeutils.grids

import androidx.compose.foundation.layout.*
import androidx.compose.material.Divider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

@Composable
fun Grids(
    size: Dp = 8.dp,
    color: Color = Color.Red,
    thickness: Dp = .2.dp,
    enable: Boolean
) {
    if(enable) {
        BoxWithConstraints(modifier = Modifier.fillMaxSize()) {
            val configuration = LocalConfiguration.current
            val columns = configuration.screenHeightDp.dp / size
            val lines = configuration.screenWidthDp.dp / size
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxSize()
            ) {
                repeat(columns.toInt()) {
                    Divider(thickness = thickness, color = color)
                    Spacer(modifier = Modifier.height(size))
                }
            }
            Row(modifier = Modifier.fillMaxSize()) {
                repeat(lines.toInt()) {
                    Spacer(modifier = Modifier.width(size))
                    Divider(
                        modifier = Modifier
                            .width(thickness)
                            .fillMaxHeight(),
                        color = color
                    )
                }
            }
        }
    }
}