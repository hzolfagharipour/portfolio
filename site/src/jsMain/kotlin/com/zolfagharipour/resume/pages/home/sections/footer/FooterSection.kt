package com.zolfagharipour.resume.pages.home.sections.footer

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.css.TextAlign
import com.varabyte.kobweb.compose.foundation.layout.*
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.navigation.OpenLinkStrategy
import com.varabyte.kobweb.silk.components.icons.fa.*
import com.varabyte.kobweb.silk.components.navigation.Link
import com.zolfagharipour.resume.components.BodyTextBold
import com.zolfagharipour.resume.components.Spacing
import com.zolfagharipour.resume.models.Section
import com.zolfagharipour.resume.theme.hoverIconStyle
import com.zolfagharipour.resume.util.AppConstants
import org.jetbrains.compose.web.css.*

@Composable
fun FooterSection() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .id(Section.CONTACT.id)
            .margin(top = AppConstants.Size.Margin.BETWEEN_SECTIONS.px),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        SocialBar()
        Spacing(height = 5.px)
        MadeWith()
        Spacing(height = 20.px)
    }
}

@Composable
private fun SocialBar() {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center
    ) {
        Social.entries.forEach {
            Link(
                modifier = Modifier.margin(right = 20.px),
                path = it.link,
                openExternalLinksStrategy = OpenLinkStrategy.IN_NEW_TAB
            ) {
                FaIcon(
                    name = it.socialIconId,
                    modifier = hoverIconStyle()
                        .padding(0.px)
                        .margin(0.px),
                    style = IconCategory.BRAND,
                    size = IconSize.XL
                )
            }
        }
    }
}

@Composable
private fun MadeWith() {
    Row(
        modifier = Modifier.margin(top = 10.px).flexFlow(FlexDirection.Row, FlexWrap.Wrap),
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically
    ) {
        BodyTextBold(text = AppConstants.Footer.MADE_WITH, textAlign = TextAlign.Start)

        FaHeart(
            style = IconStyle.FILLED,
            size = IconSize.SM,
            modifier = Modifier
                .color(Colors.PaleVioletRed)
                .margin(leftRight = 5.px)
        )
        BodyTextBold(AppConstants.Footer.POWERED_BY, textAlign = TextAlign.Start)
    }
}