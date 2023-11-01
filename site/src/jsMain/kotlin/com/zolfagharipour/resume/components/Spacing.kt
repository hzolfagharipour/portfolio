package com.zolfagharipour.resume.components

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.*
import org.jetbrains.compose.web.css.CSSNumeric
import org.jetbrains.compose.web.css.px

@Composable
fun Spacing(width: CSSNumeric = 0.px, height: CSSNumeric = 0.px) {
    Box(
        modifier = Modifier
            .width(width)
            .height(height)
            .backgroundColor(Colors.Transparent)
    )
}