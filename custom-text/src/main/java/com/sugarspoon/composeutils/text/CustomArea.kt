package com.sugarspoon.composeutils.text

import androidx.compose.ui.text.TextStyle

/**
 * CustomArea
 * Class used to format specific areas in the text
 *
 * @param previousTextReference: Previous reference text for when there are equal words in the same sentence
 * Sample: The quick brown fox jumps over the lazy brown dog.
 * If you want to style the second brown text use the word dog like previous text reference
 * @param text: Text to be styled
 * @param textStyle: Text style to be applied
 */
data class CustomArea(
    val previousTextReference: String? = null,
    val text: String? = "",
    val textStyle: TextStyle
)