package com.zolfagharipour.resume.pages.home.sections.about

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.silk.components.graphics.Image
import com.zolfagharipour.resume.components.*
import com.zolfagharipour.resume.models.*
import com.zolfagharipour.resume.util.AppConstants
import com.zolfagharipour.resume.util.radiusSize
import org.jetbrains.compose.web.css.*


@Composable
fun AboutSection() {
    Column(
        modifier = Modifier.fillMaxWidth()
    ) {
        Headline1(
            id = Section.ABOUT.id,
            text = Section.ABOUT.title,
        )

        Spacing(height = AppConstants.Size.Margin.BETWEEN_TITLE_AND_CONTENT.px)

        HeadlineDesBulletTag(
            title = AppConstants.About.CONTENT_TITLE,
            textInputs = listOf(
                TextInput(
                    desList = AppConstants.About.INTRO_DES,
                    bullets = AppConstants.About.INTRO_FEA,
                )
            ),
        )
        Spacing(height = 14.px)
        Frameworks()
    }
}

@Composable
private fun Frameworks() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .flexFlow(FlexDirection.Row, FlexWrap.Wrap)
    ) {
        Framework.entries.forEach {
            Image(
                modifier = Modifier
                    .size(60.px)
                    .margin(12.px)
                    .backgroundColor(it.color)
                    .padding(12.px)
                    .radiusSize(radiusSize = RadiusSize.Small),
                src = it.src
            )
        }
    }
}