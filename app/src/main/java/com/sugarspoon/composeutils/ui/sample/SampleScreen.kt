package com.sugarspoon.composeutils.ui.sample

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.sugarspoon.composeutils.text.CustomArea
import com.sugarspoon.composeutils.text.CustomText
import com.sugarspoon.composeutils.R

@Composable
fun SampleScreen() {
    CustomText(
        text = stringResource(id = R.string.text_sample),
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        customArea = listOf(
            Underline.copy(text = stringResource(id = R.string.formatted_first))
        )
    )
    CustomText(
        text = stringResource(id = R.string.text_sample),
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        customArea = listOf(
            Italic.copy(text = stringResource(id = R.string.formatted_first))
        )
    )
    CustomText(
        text = stringResource(id = R.string.text_sample),
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        customArea = listOf(
            BoldCursive.copy(text = stringResource(id = R.string.formatted_first)),
            BoldCursive.copy(
                text = stringResource(id = R.string.formatted_second),
                textStyle = BoldCursive.textStyle.copy(color = Color.Red)
            )
        ),
        textStyleDefault = CursiveTextStyle.copy(fontSize = 20.sp)
    )
    CustomText(
        text = stringResource(id = R.string.text_sample),
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        customArea = listOf(
            SemiBoldMonospace.copy(text = stringResource(id = R.string.formatted_first)),
            SemiBoldMonospace.copy(
                text = stringResource(id = R.string.formatted_second),
                textStyle = SemiBoldMonospace.textStyle.copy(color = Color.Blue)
            )
        ),
        textStyleDefault = MonoSpaceTextStyle.copy(fontSize = 20.sp)
    )
    CustomText(
        text = stringResource(id = R.string.text_sample),
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        customArea = listOf(
            ExtraLightMonospace.copy(text = stringResource(id = R.string.formatted_first)),
            ExtraLightMonospace.copy(
                text = stringResource(id = R.string.formatted_second),
                textStyle = ExtraLightMonospace.textStyle.copy(color = Color.Blue)
            ),
            ExtraLightMonospace.copy(
                text = stringResource(id = R.string.formatted_third),
                textStyle = ExtraLightMonospace.textStyle.copy(
                    color = Color.Green,
                    textDecoration = TextDecoration.LineThrough,
                    fontWeight = FontWeight.Bold
                )
            ),
        ),
        textStyleDefault = SerifTextStyle.copy(fontSize = 20.sp)
    )
}


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

@Composable
fun SpacingVertical() {
    Spacer(modifier = Modifier.height(16.dp))
}