package com.zolfagharipour.portfolio.components

import androidx.compose.runtime.*
import com.varabyte.kobweb.compose.foundation.layout.*
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxWidth
import com.varabyte.kobweb.silk.components.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.theme.breakpoint.rememberBreakpoint
import org.jetbrains.compose.web.css.px

@Composable
fun LeftRight(
    modifier: Modifier = Modifier,
    reverse: Boolean,
    leftSide: @Composable () -> Unit,
    rightSide: @Composable () -> Unit,
    horizontalArrangement: Arrangement.Horizontal = Arrangement.SpaceBetween
) {

    val breakpoint = rememberBreakpoint()
    val smallerScreen by derivedStateOf { breakpoint <= Breakpoint.SM }

    if (smallerScreen) {
        Column(
            modifier = modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.Start,
            verticalArrangement = Arrangement.Top
        ) {
            leftSide()
            Spacing(height = 10.px)
            rightSide()
        }
    } else {
        Row(
            modifier = modifier.fillMaxWidth(),
            horizontalArrangement = horizontalArrangement,
            verticalAlignment = Alignment.Top
        ) {
            if (reverse) {
                rightSide()
                Spacing(width = 40.px)
                leftSide()
            } else {
                leftSide()
                Spacing(width = 40.px)
                rightSide()
            }
        }
    }
}