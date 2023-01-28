package com.sugarspoon.composeutils

import androidx.compose.foundation.border
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.composed
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.unit.dp

fun Modifier.displayBounds(enable: Boolean) : Modifier = composed { composed {
    val borderColor = remember {
        mutableStateOf(Color.Red)
    }
    if(enable)
    Modifier.border(
            width = .4.dp,
            color = borderColor.value,
            shape = RectangleShape
        )
    else Modifier
} }