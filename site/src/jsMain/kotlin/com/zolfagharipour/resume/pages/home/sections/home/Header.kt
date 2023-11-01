package com.zolfagharipour.resume.pages.home.sections.home

import androidx.compose.runtime.*
import com.varabyte.kobweb.compose.css.TextDecorationLine
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.silk.components.icons.mdi.*
import com.varabyte.kobweb.silk.components.navigation.Link
import com.varabyte.kobweb.silk.components.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.theme.breakpoint.rememberBreakpoint
import com.varabyte.kobweb.silk.theme.colors.ColorMode
import com.zolfagharipour.resume.models.*
import com.zolfagharipour.resume.theme.hoverIconStyle
import com.zolfagharipour.resume.util.font
import com.zolfagharipour.resume.util.textSize
import org.jetbrains.compose.web.css.AlignContent
import org.jetbrains.compose.web.css.px

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
            Section.entries.dropLast(1).forEach {
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


@Composable
private fun ThemeChanger() {
    var colorMode by ColorMode.currentState
    if (colorMode.isDark)
        MdiLightMode(
            style = IconStyle.ROUNDED,
            modifier = hoverIconStyle()
                .onClick { colorMode = colorMode.opposite }
        )
    else
        MdiDarkMode(
            style = IconStyle.ROUNDED,
            modifier = hoverIconStyle()
                .onClick {
                    colorMode = if (colorMode.isDark) ColorMode.LIGHT else ColorMode.DARK
                }
        )
}