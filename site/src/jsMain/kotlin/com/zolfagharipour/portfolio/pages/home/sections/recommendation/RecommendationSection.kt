package com.zolfagharipour.portfolio.pages.home.sections.recommendation

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
import com.zolfagharipour.portfolio.components.*
import com.zolfagharipour.portfolio.models.RadiusSize
import com.zolfagharipour.portfolio.models.Section
import com.zolfagharipour.portfolio.theme.HoverBorderCardStyle
import com.zolfagharipour.portfolio.util.*
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
        ) { Recommendation.entries.forEach { RecommendationItem(recommendation = it) } }
    else
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.Top
        ) { Recommendation.entries.forEach { RecommendationItem(recommendation = it) } }
}

@Composable
fun RecommendationItem(recommendation: Recommendation) {
    Column(
        modifier = HoverBorderCardStyle()
            .rounded()
            .bgColor(recommendation.bgColor)
            .fillMaxWidth()
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
                    .rounded(radiusSize = RadiusSize.Circle)
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