package com.sugarspoon.composeutils.text

import androidx.compose.ui.text.TextStyle

/**
 * CustomArea
 * Classe utilizada para formatar áreas específicas no texto
 *
 * @param previousTextReference: Texto de referencia anterior para quando houver palavras iguais na mesma frase
 * Ex: A rápida raposa marrom pula sobre o cachorro marrom preguiçoso.
 * Se quiser aplicar um estilo na segundo texto de marrom utilize a palavra cachorro como
 * referencia de texto anterior
 * @param text: Texto a ser aplicado o estilo
 * @param textStyle: Estilo de texto a ser aplicado
 */
data class CustomArea(
    val previousTextReference: String? = null,
    val text: String? = "",
    val textStyle: TextStyle
)