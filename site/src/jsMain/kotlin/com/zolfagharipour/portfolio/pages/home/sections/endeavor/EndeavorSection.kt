package com.zolfagharipour.portfolio.pages.home.sections.endeavor

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxWidth
import com.zolfagharipour.portfolio.components.Headline1
import com.zolfagharipour.portfolio.components.Spacing
import com.zolfagharipour.portfolio.models.Section
import com.zolfagharipour.portfolio.pages.home.sections.endeavor.portfolio.PortfolioSubEndeavor
import com.zolfagharipour.portfolio.util.AppConstants
import org.jetbrains.compose.web.css.px


@Composable
fun EndeavorSection() {
    Column(
        modifier = Modifier.fillMaxWidth(),
    ) {
        Headline1(
            id = Section.ENDEAVOR.id,
            text = Section.ENDEAVOR.title
        )
        Spacing(height = AppConstants.Size.Margin.BETWEEN_TITLE_AND_CONTENT.px)
        PortfolioSubEndeavor()
    }
}