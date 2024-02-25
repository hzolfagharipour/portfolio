package com.zolfagharipour.portfolio.pages.home.sections.home

import androidx.compose.runtime.*
import com.varabyte.kobweb.compose.css.*
import com.varabyte.kobweb.compose.foundation.layout.*
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.navigation.OpenLinkStrategy
import com.varabyte.kobweb.silk.components.graphics.Image
import com.varabyte.kobweb.silk.components.icons.fa.*
import com.varabyte.kobweb.silk.components.navigation.Link
import com.varabyte.kobweb.silk.components.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.theme.breakpoint.rememberBreakpoint
import com.zolfagharipour.portfolio.components.BodyTextBold
import com.zolfagharipour.portfolio.components.Spacing
import com.zolfagharipour.portfolio.models.*
import com.zolfagharipour.portfolio.theme.hoverIconStyle
import com.zolfagharipour.portfolio.util.*
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import org.jetbrains.compose.web.css.*

@Composable
fun NavigationDrawer(
    onClose: () -> Unit,
) {
    val scope = rememberCoroutineScope()
    val breakpoint = rememberBreakpoint()
    var translateX by remember { mutableStateOf((-100).percent) }
    var opacity by remember { mutableStateOf(0.percent) }

    fun closedOperation() {
        scope.launch {
            translateX = (-100).percent
            opacity = 0.percent
            delay(500)
            onClose()
        }
    }

    LaunchedEffect(breakpoint) {
        translateX = 0.percent
        opacity = 100.percent
        if (breakpoint > Breakpoint.MD)
            closedOperation()
    }

    // Make dim the background
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(100.vh)
            .position(Position.Fixed)
            .zIndex(2)
            .opacity(opacity)
            .bgColor(BGColor.Shadow)
            .transition(CSSTransition(property = "opacity", duration = 150.ms))
    ) {
        Column(
            modifier = Modifier
                .fillMaxHeight()
                .width(if (breakpoint <= Breakpoint.SM) 70.percent else 30.percent)
                .bgColor(BGColor.Card)
                .borderRadius(
                    topRight = AppConstants.Size.Radius.NORMAL.px,
                    bottomRight = AppConstants.Size.Radius.NORMAL.px
                )
                .overflow(Overflow.Auto)
                .scrollBehavior(ScrollBehavior.Smooth)
                .translateX(translateX)
                .transition(CSSTransition(property = "translate", duration = 150.ms))
        ) {

            // Profile, Title and Close button
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier
                    .padding(top = 20.px, leftRight = 16.px)
                    .fillMaxWidth()
            ) {

                // Profile and Title
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                ) {
                    Image(
                        src = AppRes.Image.Person.HASAN,
                        modifier = Modifier
                            .fillMaxSize()
                            .objectFit(ObjectFit.Fill)
                            .rounded()
                            .size(50.px)
                            .padding(1.px)
                            .alignContent(org.jetbrains.compose.web.css.AlignContent.Center)
                            .alignSelf(org.jetbrains.compose.web.css.AlignSelf.Center)
                            .borderRadius(40.px)
                    )
                    Spacing(width = 12.px)
                    BodyTextBold(text = AppConstants.Home.NAME)
                }
                // Close Icon
                FaXmark(
                    modifier = hoverIconStyle()
                        .onClick { closedOperation() },
                    size = IconSize.LG
                )
            }

            // Divider
            Box(
                modifier = Modifier.fillMaxWidth()
                    .margin(top = 10.px, bottom = 20.px)
                    .bgColor(BGColor.Image)
                    .height(0.1.px)
            )

            // Sections
            Section.entries.forEach {
                Row(
                    modifier = Modifier.margin(bottom = 20.px, left = 20.px),
                    horizontalArrangement = Arrangement.Start,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    FaIcon(
                        name = it.icon,
                        style = IconCategory.SOLID,
                        modifier = Modifier.fgColor(FGColor.Headline2),
                        size = IconSize.SM
                    )
                    Link(
                        modifier = hoverIconStyle()
                            .margin(left = 12.px)
                            .font(fontFamily = FontFamily.Bold)
                            .textSize(textSize = TextSize.Body)
                            .fgColor(FGColor.Headline2)
                            .onClick { closedOperation() }
                            .textDecorationLine(TextDecorationLine.None),
                        openExternalLinksStrategy = OpenLinkStrategy.IN_PLACE,
                        path = it.path,
                        text = it.title
                    )
                }
            }
        }
    }
}