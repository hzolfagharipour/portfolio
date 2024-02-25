package com.zolfagharipour.portfolio.pages.home.sections.home

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.css.FontStyle
import com.varabyte.kobweb.compose.css.TextAlign
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.zolfagharipour.portfolio.components.*
import com.zolfagharipour.portfolio.models.TextSize
import com.zolfagharipour.portfolio.util.*
import org.jetbrains.compose.web.css.px

@Composable
fun HomeSection(
    onOverFlowMenuClick: () -> Unit,
) {
    Column(
        modifier = Modifier
            .id(AppConstants.Home.ID)
            .fillMaxWidth(),
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        Spacing(height = 20.px)
        Header(onMenuIconClick = onOverFlowMenuClick)

        Spacing(height = 20.px)

        ImageAndContent(
            image = AppRes.Image.Person.HASAN,
            reverse = false
        ) { HomeContent() }
    }
}

@Composable
private fun HomeContent() {

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .margin(bottom = 40.px),
        horizontalAlignment = Alignment.Start
    ) {
        Headline2(text = AppConstants.Home.HELLO)

        Headline1(
            id = null,
            text = AppConstants.Home.FULL_NAME,
            marginTop = 15.px,
            textAlign = TextAlign.Start
        )

        Spacing(height = 10.px)

        Headline2(text = AppConstants.Home.JOB_TITLE)

        BodyText(
            text = AppConstants.Home.DEVELOPER_SHORT_INFO,
            modifier = Modifier.fillMaxWidthHandled().fontStyle(FontStyle.Italic),
            textSize = TextSize.LARGE
        )
    }
}