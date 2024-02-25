package com.zolfagharipour.portfolio.components

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.css.CSSLengthNumericValue
import com.varabyte.kobweb.compose.css.Width
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.*
import org.jetbrains.compose.web.css.*

@Composable
fun Spacing(width: CSSSizeValue<CSSUnit.px> = 0.px, height: CSSSizeValue<CSSUnit.px> = 0.px) {
    Box(
        modifier = Modifier

            .width(width)
            .height(height)
            .backgroundColor(Colors.Transparent)
    )
}