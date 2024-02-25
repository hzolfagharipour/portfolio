package com.zolfagharipour.portfolio.pages.home.sections.footer

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.css.TextAlign
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.silk.components.icons.fa.*
import com.zolfagharipour.portfolio.components.BodyTextBold
import com.zolfagharipour.portfolio.components.Spacing
import com.zolfagharipour.portfolio.util.AppConstants
import org.jetbrains.compose.web.css.*

@Composable
fun FooterSection() {
    Row(
        modifier = Modifier.margin(top = 10.px).fillMaxWidth()
            .margin(top = AppConstants.Size.Margin.BETWEEN_SECTIONS.px).flexFlow(FlexDirection.Row, FlexWrap.Wrap),
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically
    ) {
        BodyTextBold(text = AppConstants.Footer.MADE_WITH, textAlign = TextAlign.Start)

        FaHeart(
            style = IconStyle.FILLED,
            size = IconSize.SM,
            modifier = Modifier.color(Colors.PaleVioletRed).margin(leftRight = 5.px)
        )
        BodyTextBold(AppConstants.Footer.POWERED_BY, textAlign = TextAlign.Start)
    }
    Spacing(height = 20.px)
}