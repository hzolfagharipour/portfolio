package com.zolfagharipour.resume.pages.home.sections.recommendation

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.css.ObjectFit
import com.varabyte.kobweb.compose.foundation.layout.*
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.silk.components.graphics.Image
import com.varabyte.kobweb.silk.components.navigation.Link
import com.varabyte.kobweb.silk.components.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.theme.breakpoint.rememberBreakpoint
import com.varabyte.kobweb.silk.theme.shapes.Circle
import com.varabyte.kobweb.silk.theme.shapes.clip
import com.zolfagharipour.resume.components.*
import com.zolfagharipour.resume.models.*
import com.zolfagharipour.resume.theme.recommendationCardStyle
import com.zolfagharipour.resume.util.*
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px

@Composable
fun RecommendationSection() {
    Column(
        modifier = Modifier,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Headline1(
            id = Section.RECOMMENDATION.id,
            text = Section.RECOMMENDATION.title
        )
        Spacing(height = AppConstants.Size.Margin.BETWEEN_TITLE_AND_CONTENT.px)
        RecommendationCards()
    }
}



@Composable
private fun RecommendationCards() {
    val breakpoint = rememberBreakpoint()

    if (breakpoint < Breakpoint.MD)
        Column(
            modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Top
        ) { Recommendation.entries.forEach { RecommendationItem(recommendation = it, percent = 80) } }
    else
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.Top
        ) { Recommendation.entries.forEach { RecommendationItem(recommendation = it, percent = 30) } }
}

@Composable
fun RecommendationItem(recommendation: Recommendation, percent: Int) {
    Column(
        modifier = recommendationCardStyle()
            .radiusSize()
            .bgColor(BGColor.Card)
            .fillMaxWidth(percent.percent)
            .margin(all = 10.px)
            .padding(all = 20.px)

    ) {
        Row(
            horizontalArrangement = Arrangement.Start,
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Image(
                modifier = Modifier
                    .fillMaxSize()
                    .objectFit(ObjectFit.Cover)
                    .bordered()
                    .size(60.px)
                    .radiusSize(radiusSize = RadiusSize.Circle)
                    .clip(Circle()),
                src = recommendation.image,
            )

            Spacing(width = 10.px)

            Link(
                path = AppConstants.Recommendation.RECOMMENDATION_LINK
            ) { BodyTextBold(text = recommendation.title) }
        }

        BodyText(text = recommendation.text)
    }
}