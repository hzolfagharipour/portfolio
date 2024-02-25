package com.zolfagharipour.portfolio.pages.home.sections.experience.appStore

import androidx.compose.runtime.Composable
import com.zolfagharipour.portfolio.components.InfoLine
import com.zolfagharipour.portfolio.models.TextInput
import com.zolfagharipour.portfolio.pages.home.sections.experience.ExperienceComponent
import com.zolfagharipour.portfolio.util.AppConstants
import com.zolfagharipour.portfolio.util.AppRes

@Composable
internal fun AppStoreSubExperience(onDialog: () -> Unit) {
    ExperienceComponent(
        id = AppConstants.Experience.AppStore.ID,
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