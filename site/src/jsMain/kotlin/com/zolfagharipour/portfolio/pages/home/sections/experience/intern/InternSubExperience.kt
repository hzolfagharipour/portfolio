package com.zolfagharipour.portfolio.pages.home.sections.experience.intern

import androidx.compose.runtime.Composable
import com.zolfagharipour.portfolio.models.TextInput
import com.zolfagharipour.portfolio.pages.home.sections.experience.ExperienceComponent
import com.zolfagharipour.portfolio.util.AppConstants
import com.zolfagharipour.portfolio.util.AppRes


@Composable
internal fun InternSubExperience() {
    ExperienceComponent(
        id = AppConstants.Experience.Intern.ID,
        headline = AppConstants.Experience.Intern.TITLE,
        image = AppRes.Image.Experience.INTERNSHIP,
        textInputs = listOf(
            TextInput(
                title = AppConstants.Experience.Intern.TECH_TITLE_MUSIC_PLAYER,
                desList = AppConstants.Experience.Intern.TECH_DES_MUSIC_PLAYER,
                bullets = AppConstants.Experience.Intern.TECH_FEA_MUSIC_PLAYER,
            ),
            TextInput(
                title = AppConstants.Experience.Intern.TECH_TITLE_MARKET,
                desList = AppConstants.Experience.Intern.TECH_DES_MARKET,
                bullets = AppConstants.Experience.Intern.TECH_FEA_MARKET,
            )
        ),
        tags = AppConstants.Experience.Intern.SKILLS,
        reverse = false,
        content = {  }
    )
}