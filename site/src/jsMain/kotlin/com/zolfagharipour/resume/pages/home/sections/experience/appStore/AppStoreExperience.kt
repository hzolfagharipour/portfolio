package com.zolfagharipour.resume.pages.home.sections.experience.appStore

import androidx.compose.runtime.Composable
import com.zolfagharipour.resume.components.InfoLine
import com.zolfagharipour.resume.models.TextInput
import com.zolfagharipour.resume.pages.home.sections.experience.ExperienceComponent
import com.zolfagharipour.resume.util.AppConstants
import com.zolfagharipour.resume.util.AppRes

@Composable
internal fun AppStoreExperience(onDialog: () -> Unit) {
    ExperienceComponent(
        id = AppConstants.ID.APP_STORE,
        headline = AppConstants.Experience.AppStore.TITLE,
        image = AppRes.Image.Experience.APP_STORE,
        textInputs = listOf(
            TextInput(
                desList = AppConstants.Experience.AppStore.TECH_DESC,
                bullets = AppConstants.Experience.AppStore.TECH_FEA,
            )
        ),
        tags = AppConstants.Experience.AppStore.SKILLS,
        reverse = true
    ) {
        InfoLine(text = AppConstants.Experience.AppStore.READ_MORE, onClick = onDialog)
    }
}