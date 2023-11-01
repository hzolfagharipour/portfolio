package com.zolfagharipour.resume.pages.home.sections.project.portfolio

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.foundation.layout.*
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.navigation.OpenLinkStrategy
import com.varabyte.kobweb.silk.components.graphics.Image
import com.varabyte.kobweb.silk.components.navigation.Link
import com.zolfagharipour.resume.components.*
import com.zolfagharipour.resume.models.TextInput
import com.zolfagharipour.resume.util.AppConstants
import com.zolfagharipour.resume.util.AppRes
import org.jetbrains.compose.web.css.*


@Composable
internal fun PortfolioProject() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top
    ) {
        HeadlineDesBulletTag(
            id = AppConstants.ID.PORTFOLIO,
            title = AppConstants.Project.Portfolio.TITLE,
            textInputs = listOf(
                TextInput(
                    desList = AppConstants.Project.Portfolio.INTRO_DES,
                    bullets = AppConstants.Project.Portfolio.TECH_FEA,
                )
            ),
        )
        Spacing(height = 10.px)
        BodyText(text = AppConstants.Project.Portfolio.KOBWEB_INTRO)

        // Images
        Row(
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.fillMaxWidth().margin(top = 10.px).flexFlow(FlexDirection.Row, FlexWrap.Wrap)
        ) {
            Link(
                path = AppConstants.Project.Portfolio.KOTLIN_OFFICIAL_LINK,
                openExternalLinksStrategy = OpenLinkStrategy.IN_NEW_TAB,
            ) {
                Image(
                    src = AppRes.Icons.Framework.KOTLIN,
                    modifier = Modifier.maxWidth(80.px)
                )
            }
            Spacing(width = 20.px)
            Link(
                path = AppConstants.Project.Portfolio.COMPOSE_OFFICIAL_LINK,
                openExternalLinksStrategy = OpenLinkStrategy.IN_NEW_TAB,
            ) {
                Image(
                    src = AppRes.Icons.Framework.COMPOSE,
                    modifier = Modifier.maxWidth(80.px)
                )
            }
            Spacing(width = 20.px)
            Link(
                path = AppConstants.Project.Portfolio.KOBWEB_OFFICIAL_LINK,
                openExternalLinksStrategy = OpenLinkStrategy.IN_NEW_TAB,
            ) {
                Image(
                    modifier = Modifier.maxWidth(200.px),
                    src = AppRes.Image.Project.KOBWEB_LOGO
                )
            }
        }
    }
}