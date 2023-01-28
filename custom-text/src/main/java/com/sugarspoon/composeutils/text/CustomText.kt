package com.sugarspoon.composeutils.text

import androidx.compose.foundation.text.BasicText
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp

/**
 *
 * CustomText
 *
 * @param text Defines text with default formatting
 *
 * @param modifier Responsible for general modifications to the component
 *
 * @param customArea List of areas that will be customized in the text. see:[CustomArea]
 *
 * @param textStyleDefault Default text style
 *
 * @param textColorDefault Default text color
 *
 * @param textAlign Defines how to align text horizontally. TextAlign controls how text
 * aligns in the space it appears
 *
 */
@Composable
fun CustomText(
    text: String,
    modifier: Modifier,
    customArea: List<CustomArea>,
    textStyleDefault: TextStyle = TextStyle(fontSize = 16.sp),
    textColorDefault: Color = Color.Black,
    textAlign: TextAlign? = null
) {
    val annotatedString = remember {
        mutableStateOf(AnnotatedString(""))
    }

    annotatedString.value = changeStyle(
        text = text,
        customArea = customArea
    )

    BasicText(
        text = annotatedString.value,
        style = textStyleDefault.copy(
            color = textColorDefault,
            textAlign = textAlign
        ),
        modifier = modifier,
    )
}

internal fun changeStyle(
    text: String,
    customArea: List<CustomArea>
) = buildAnnotatedString {

    customArea.forEach {
        text.getIndex(
            text = it.text.orEmpty(),
            previousText = it.previousTextReference
        ) { start, end ->
            addStyle(it.textStyle.toSpanStyle(), start, end)
        }
    }
    append(text)
}

private fun String.getIndex(
    text: String,
    previousText: String? = null,
    positions: (start: Int, end: Int) -> Unit
) {
    val start = if (previousText != null) indexOf(previousText) + previousText.length
    else indexOf(text)
    val end = if (previousText != null) start + text.length + 1
    else start + text.length
    positions(start, end)
}