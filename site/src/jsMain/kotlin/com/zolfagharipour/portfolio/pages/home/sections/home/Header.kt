package com.zolfagharipour.portfolio.pages.home.sections.home

import androidx.compose.runtime.*
import com.varabyte.kobweb.compose.css.AnimationIterationCount
import com.varabyte.kobweb.compose.css.TextDecorationLine
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.silk.components.animation.Keyframes
import com.varabyte.kobweb.silk.components.animation.toAnimation
import com.varabyte.kobweb.silk.components.icons.mdi.*
import com.varabyte.kobweb.silk.components.navigation.Link
import com.varabyte.kobweb.silk.components.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.theme.breakpoint.rememberBreakpoint
import com.varabyte.kobweb.silk.theme.colors.ColorMode
import com.zolfagharipour.portfolio.models.*
import com.zolfagharipour.portfolio.theme.hoverIconStyle
import com.zolfagharipour.portfolio.util.font
import com.zolfagharipour.portfolio.util.textSize
import org.jetbrains.compose.web.css.*

@Composable
internal fun Header(
    onMenuIconClick: () -> Unit,
) {
    val breakpoint = rememberBreakpoint()

    if (breakpoint < Breakpoint.MD)
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            MdiMenu(
                modifier = hoverIconStyle()
                    .margin(0.px)
                    .alignContent(AlignContent.Start)
                    .onClick { onMenuIconClick() },
                style = IconStyle.ROUNDED
            )
            ThemeChanger()
        }
    else
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.End,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Section.entries.forEach {
                Link(
                    modifier = hoverIconStyle()
                        .margin(right = 20.px)
                        .padding(0.px)
                        .font(fontFamily = FontFamily.Bold)
                        .textSize(textSize = TextSize.Body)
                        .textDecorationLine(TextDecorationLine.None),
                    path = it.path,
                    text = it.title
                )
            }
            ThemeChanger()
        }
}

val WobbleKeyframesSun by Keyframes {
    to { Modifier.rotate(360.deg) }
}

val WobbleKeyframesMoon by Keyframes {
    to { Modifier.rotate(45.deg) }
}

@Composable
private fun ThemeChanger() {
    var colorMode by ColorMode.currentState
    if (colorMode.isDark)
        MdiLightMode(
            style = IconStyle.ROUNDED,
            modifier = hoverIconStyle()
                .animation(
                    WobbleKeyframesSun.toAnimation(
                        duration = 10.s,
                        iterationCount = AnimationIterationCount.Infinite,
                        timingFunction = AnimationTimingFunction.Linear,
                        direction = AnimationDirection.Normal,
                    )
                )
                .onClick { colorMode = colorMode.opposite }
        )
    else
        MdiDarkMode(
            style = IconStyle.ROUNDED,
            modifier = hoverIconStyle()
                .animation(
                    WobbleKeyframesMoon.toAnimation(
                        duration = 1.s,
                        iterationCount = AnimationIterationCount.Infinite,
                        timingFunction = AnimationTimingFunction.EaseInOut,
                        direction = AnimationDirection.Alternate,
                    )
                )
                .onClick {
                    colorMode = if (colorMode.isDark) ColorMode.LIGHT else ColorMode.DARK
                }
        )
}