package com.zolfagharipour.resume.pages.home.sections.project

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxWidth
import com.zolfagharipour.resume.components.Headline1
import com.zolfagharipour.resume.models.Section
import com.zolfagharipour.resume.pages.home.sections.project.coroutine.CoroutineFlowProject
import com.zolfagharipour.resume.pages.home.sections.project.portfolio.PortfolioProject
import com.zolfagharipour.resume.util.AppConstants
import com.zolfagharipour.resume.components.Spacing
import com.zolfagharipour.resume.pages.home.sections.project.mentor.MentorProject
import org.jetbrains.compose.web.css.px

@Composable
fun ProjectSection() {
    Column(
        modifier = Modifier.fillMaxWidth(),
    ) {
        Headline1(
            id = Section.PROJECT.id,
            text = Section.PROJECT.title
        )
        Spacing(height = AppConstants.Size.Margin.BETWEEN_TITLE_AND_CONTENT.px)
        CoroutineFlowProject()
        Spacing(height = AppConstants.Size.Margin.BETWEEN_TITLE_AND_CONTENT.px)
        PortfolioProject()
        Spacing(height = AppConstants.Size.Margin.BETWEEN_TITLE_AND_CONTENT.px)
        MentorProject()
    }
}