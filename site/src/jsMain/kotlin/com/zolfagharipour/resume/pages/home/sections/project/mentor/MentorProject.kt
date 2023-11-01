package com.zolfagharipour.resume.pages.home.sections.project.mentor

import androidx.compose.runtime.Composable
import com.zolfagharipour.resume.components.HeadlineDesBulletTag
import com.zolfagharipour.resume.models.TextInput
import com.zolfagharipour.resume.util.AppConstants


@Composable
fun MentorProject() {
    HeadlineDesBulletTag(
        id = AppConstants.ID.MENTOR,
        title = AppConstants.Project.Mentor.TITLE,
        textInputs = listOf(
            TextInput(
                desList = AppConstants.Project.Mentor.INTRO_DES,
                bullets = AppConstants.Project.Mentor.INTRO_FEA,
            )
        ),
        tags = null,
    )
}