package com.sugarspoon.composeutils.ui.resources

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import com.sugarspoon.composeutils.text.CustomArea

val Underline = CustomArea(
    textStyle = TextStyle(
        textDecoration = TextDecoration.Underline
    )
)

val Italic = CustomArea(
    textStyle = TextStyle(
        fontStyle = FontStyle.Italic,
        color = Color.Red,
        textDecoration = TextDecoration.Underline
    )
)

val BoldCursive = CustomArea(
    textStyle = TextStyle(
        color = Color.Cyan,
        fontFamily = FontFamily.Cursive,
        fontWeight = FontWeight.Bold
    )
)

val SemiBoldMonospace = CustomArea(
    textStyle = TextStyle(
        color = Color.DarkGray,
        fontFamily = FontFamily.Monospace,
        fontWeight = FontWeight.SemiBold
    )
)

val ExtraLightMonospace = CustomArea(
    textStyle = TextStyle(
        color = Color.DarkGray,
        fontFamily = FontFamily.Serif,
        fontWeight = FontWeight.ExtraLight
    )
)

val CursiveTextStyle = TextStyle(
    color = Color.Black,
    fontFamily = FontFamily.Cursive
)

val MonoSpaceTextStyle = TextStyle(
    color = Color.Black,
    fontFamily = FontFamily.Monospace
)

val SerifTextStyle = TextStyle(
    color = Color.Black,
    fontFamily = FontFamily.Serif
)