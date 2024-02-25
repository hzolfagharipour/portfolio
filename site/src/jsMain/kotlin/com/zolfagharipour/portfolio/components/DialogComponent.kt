package com.zolfagharipour.portfolio.components

import androidx.compose.runtime.*
import com.varabyte.kobweb.compose.css.*
import com.varabyte.kobweb.compose.foundation.layout.*
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.silk.components.icons.fa.FaXmark
import com.varabyte.kobweb.silk.components.icons.fa.IconSize
import com.varabyte.kobweb.silk.theme.breakpoint.rememberBreakpoint
import com.zolfagharipour.portfolio.models.BGColor
import com.zolfagharipour.portfolio.theme.hoverIconStyle
import com.zolfagharipour.portfolio.util.*
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import org.jetbrains.compose.web.css.*


@Composable
fun DialogComponent(
    title: String,
    onClose: () -> Unit,
    content: @Composable () -> Unit,
) {
    val scope = rememberCoroutineScope()
    val breakpoint = rememberBreakpoint()
    var translateY by remember { mutableStateOf((-10).percent) }
    var opacity by remember { mutableStateOf(0.percent) }

    fun closedOperation() {
        scope.launch {
            translateY = (-10).percent
            opacity = 0.percent
            delay(500)
            onClose()
        }
    }

    LaunchedEffect(breakpoint) {
        translateY = 0.percent
        opacity = 100.percent
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .position(Position.Fixed)
            .zIndex(2)
            .opacity(opacity)
            .bgColor(BGColor.Shadow)
            .transition(CSSTransition(property = "opacity", duration = 200.ms)),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            modifier = Modifier
                .fillMaxSize(60.percent)
                .bgColor(BGColor.Card)
                .maxHeight(MaxHeight.FitContent)
                .rounded()
                .bordered()
                .padding(40.px)
                .overflow(Overflow.Auto)
                .scrollBehavior(ScrollBehavior.Smooth)
                .translateY(translateY)
                .transition(CSSTransition(property = "translate", duration = 200.ms)),
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.Top
            ) {
                Headline2(text = title)
                FaXmark(
                    modifier = hoverIconStyle()
                        .padding(10.px)
                        .onClick { closedOperation() },
                    size = IconSize.XL
                )
            }
            Spacing(height = 10.px)
            content()
        }
    }
}