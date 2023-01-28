package com.sugarspoon.composeutils.ui.resources

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

val ButtonHeight = 56.dp
val ButtonCorners = 2.dp
val PaddingXXS = 16.dp
val PaddingXS = 8.dp

@Composable
fun SpacingVertical(height: Dp = PaddingXS) {
    Spacer(modifier = Modifier.height(8.dp))
}