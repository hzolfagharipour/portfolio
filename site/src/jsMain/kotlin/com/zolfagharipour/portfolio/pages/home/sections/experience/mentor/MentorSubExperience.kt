package com.zolfagharipour.portfolio.pages.home.sections.experience.mentor

import androidx.compose.runtime.Composable
import com.zolfagharipour.portfolio.components.HeadlineDesBulletTag
import com.zolfagharipour.portfolio.models.TextInput
import com.zolfagharipour.portfolio.util.AppConstants


@Composable
internal fun MentorSubExperience() {
    HeadlineDesBulletTag(
        id = AppConstants.Experience.Mentor.ID,
        title = AppConstants.Experience.Mentor.TITLE,
        textInputs = listOf(
            TextInput(
                desList = AppConstants.Experience.Mentor.INTRO_DES,
                bullets = AppConstants.Experience.Mentor.INTRO_FEA,
            )
        ),
        tags = null,
    )
}