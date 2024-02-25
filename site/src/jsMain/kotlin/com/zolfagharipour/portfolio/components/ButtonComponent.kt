package com.zolfagharipour.portfolio.components

import androidx.compose.runtime.*
import com.varabyte.kobweb.compose.css.TextDecorationLine
import com.varabyte.kobweb.compose.css.Visibility
import com.varabyte.kobweb.compose.foundation.layout.*
import com.varabyte.kobweb.compose.ui.*
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.silk.components.icons.fa.FaArrowUp
import com.varabyte.kobweb.silk.components.icons.fa.IconSize
import com.varabyte.kobweb.silk.components.navigation.Link
import com.varabyte.kobweb.silk.components.style.toModifier
import com.zolfagharipour.portfolio.models.*
import com.zolfagharipour.portfolio.theme.HoverResizeStyle
import com.zolfagharipour.portfolio.util.*
import kotlinx.browser.document
import kotlinx.browser.window
import org.jetbrains.compose.web.css.Position
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.Button

/*@Composable
fun ButtonLink(
    text: String,
    path: String,
) {
    Button(
        attrs = Modifier
            .minHeight(35.px)
            .minWidth(50.px)
            .border(width = 0.px)
            .padding(all = 0.px)
            .pointerCursor()
            .bgColor(BGColor.Image)
            .rounded(radiusSize = RadiusSize.Button)
            .toAttrs()
    ) {
        Link(
            modifier = Modifier
                .fgColor(FGColor.Button)
                .padding(leftRight = 20.px, topBottom = 10.px)
                .margin(0.px)
                .textSize(textSize = TextSize.Button)
                .textDecorationLine(TextDecorationLine.None),
            text = text,
            path = path
        )
    }
}*/

/*@Composable
fun DefaultButton(
    text: String,
    onClick: () -> Unit
) {
    Button(
        attrs = Modifier
            .height(40.px)
            .border(width = 0.px)
            .padding(all = 0.px)
            .pointerCursor()
            .onClick { onClick() }
            .radiusSize(radiusSize = RadiusSize.Button)
            .backgroundColor(defaultButtonBackground()())
            .toAttrs()
    ) {
        B(
            attrs = Modifier
                .color(buttonTextColor())
                .margin(0.px)
                .padding(leftRight = 20.px, topBottom = 10.px)
                .textDecorationLine(TextDecorationLine.None)
                .textSize(textSize = TextSize.Button)
                .toAttrs()

        ) {
            Text(text)
        }
    }
}*/

@Composable
fun ToTopButton() {
    var scroll: Double by remember { mutableStateOf(0.0) }
    val showButton: Boolean by remember {
        derivedStateOf {
            scroll > 400.0
        }
    }

    LaunchedEffect(Unit) {
        window.addEventListener(
            type = "scroll",
            callback = {
                scroll = document.documentElement?.scrollTop ?: 0.0
            })
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .maxWidth(AppConstants.Size.Screen.MAX_WIDTH.px)
            .styleModifier {
                // Set this to solve disabled views problem
                property("pointer-events", "none")
            }
            .position(Position.Fixed)
            .zIndex(1),// show on top of all elements
        horizontalAlignment = Alignment.End,
        verticalArrangement = Arrangement.Bottom,
    ) {

        Button(
            attrs = HoverResizeStyle
                .toModifier()
                .styleModifier {
                    // Set this to solve disabled views problem
                    property("pointer-events", "auto")
                }
                .visibility(if (showButton) Visibility.Visible else Visibility.Hidden)
                .margin(right = 40.px, bottom = 40.px)
                .bgColor(BGColor.Button)
                .border(width = 0.px)
                .padding(all = 0.px)
                .rounded(radiusSize = RadiusSize.Button)
                .toAttrs()
        ) {
            Box(
                modifier = Modifier.fillMaxSize(),
                contentAlignment = Alignment.Center
            ) {
                // To ensure clickable whole box, Icon must be placed first.
                FaArrowUp(
                    modifier = Modifier.fgColor(FGColor.Button),
                    size = IconSize.SM
                )
                Link(
                    modifier = Modifier
                        .fillMaxSize()
                        .textDecorationLine(TextDecorationLine.None),
                    path = "#${AppConstants.Home.ID}",
                    text = ""
                )
            }
        }
    }
}