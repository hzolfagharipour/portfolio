package com.zolfagharipour.portfolio.pages.home.sections.endeavor.portfolio

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.foundation.layout.*
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.navigation.OpenLinkStrategy
import com.varabyte.kobweb.silk.components.graphics.Image
import com.varabyte.kobweb.silk.components.navigation.Link
import com.zolfagharipour.portfolio.components.*
import com.zolfagharipour.portfolio.models.TextInput
import com.zolfagharipour.portfolio.util.*
import org.jetbrains.compose.web.css.*


@Composable
internal fun PortfolioSubEndeavor() {
    Column(
        horizontalAlignment = Alignment.Start,
        verticalArrangement = Arrangement.Top
    ) {
        HeadlineDesBulletTag(
            id = AppConstants.Endeavor.Portfolio.ID,
            title = AppConstants.Endeavor.Portfolio.TITLE,
            textInputs = listOf(
                TextInput(
                    desList = AppConstants.Endeavor.Portfolio.INTRO_DES,
                    bullets = AppConstants.Endeavor.Portfolio.TECH_FEA,
                )
            ),
        )
        Spacing(height = 10.px)
        BodyText(
            text = AppConstants.Endeavor.Portfolio.KOBWEB_INTRO,
            modifier = Modifier.fillMaxWidthHandled()
            )

        // Images
        Row(
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.fillMaxWidth().margin(top = 10.px).flexFlow(FlexDirection.Row, FlexWrap.Wrap)
        ) {
            Link(
                path = AppConstants.Endeavor.Portfolio.KOTLIN_OFFICIAL_LINK,
                openExternalLinksStrategy = OpenLinkStrategy.IN_NEW_TAB,
            ) {
                Image(
                    src = AppRes.Icons.Framework.KOTLIN,
                    modifier = Modifier.maxWidth(80.px)
                )
            }
            Spacing(width = 20.px)
            Link(
                path = AppConstants.Endeavor.Portfolio.COMPOSE_OFFICIAL_LINK,
                openExternalLinksStrategy = OpenLinkStrategy.IN_NEW_TAB,
            ) {
                Image(
                    src = AppRes.Icons.Framework.COMPOSE,
                    modifier = Modifier.maxWidth(80.px)
                )
            }
            Spacing(width = 20.px)
            Link(
                path = AppConstants.Endeavor.Portfolio.KOBWEB_OFFICIAL_LINK,
                openExternalLinksStrategy = OpenLinkStrategy.IN_NEW_TAB,
            ) {
                Image(
                    modifier = Modifier.maxWidth(200.px),
                    src = AppRes.Image.Endeavor.KOBWEB_LOGO
                )
            }
        }
    }
}