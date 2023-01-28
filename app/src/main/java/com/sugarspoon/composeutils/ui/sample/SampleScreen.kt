package com.sugarspoon.composeutils.ui.sample

import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.sp
import com.sugarspoon.composeutils.R
import com.sugarspoon.composeutils.text.CustomText
import com.sugarspoon.composeutils.ui.resources.*

@Composable
fun SampleScreen() {
    Column(
        modifier = Modifier.fillMaxSize().padding(PaddingXXS),
        verticalArrangement = Arrangement.Top
    ) {
        CustomText(
            text = stringResource(id = R.string.text_sample),
            modifier = Modifier.fillMaxWidth().padding(bottom = PaddingXXS),
            customArea = listOf(
                Underline.copy(text = stringResource(id = R.string.formatted_first))
            )
        )
        CustomText(
            text = stringResource(id = R.string.text_sample),
            modifier = Modifier.fillMaxWidth().padding(bottom = PaddingXXS),
            customArea = listOf(
                Italic.copy(text = stringResource(id = R.string.formatted_first))
            )
        )
        CustomText(
            text = stringResource(id = R.string.text_sample),
            modifier = Modifier .fillMaxWidth().padding(bottom = PaddingXXS),
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
            modifier = Modifier.fillMaxWidth().padding(bottom = PaddingXXS),
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
            modifier = Modifier.fillMaxWidth().padding(bottom = PaddingXXS),
            customArea = listOf(
                ExtraLightMonospace.copy(text = stringResource(id = R.string.formatted_first)),
                ExtraLightMonospace.copy(
                    text = stringResource(id = R.string.formatted_second),
                    textStyle = ExtraLightMonospace.textStyle.copy(color = Color.Blue)
                ),
                ExtraLightMonospace.copy(
                    text = stringResource(id = R.string.formatted_third),
                    textStyle = ExtraLightMonospace.textStyle.copy(
                        color = Color.Blue,
                        textDecoration = TextDecoration.LineThrough,
                        fontWeight = FontWeight.Bold
                    )
                ),
            ),
            textStyleDefault = SerifTextStyle.copy(fontSize = 20.sp)
        )
    }
}