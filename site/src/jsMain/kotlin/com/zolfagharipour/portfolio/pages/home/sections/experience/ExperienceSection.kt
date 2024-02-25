package com.zolfagharipour.portfolio.pages.home.sections.experience

import androidx.compose.runtime.*
import com.varabyte.kobweb.compose.foundation.layout.*
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.zolfagharipour.portfolio.components.Headline1
import com.zolfagharipour.portfolio.components.Spacing
import com.zolfagharipour.portfolio.models.Section
import com.zolfagharipour.portfolio.pages.home.sections.experience.appStore.AppStoreSubExperience
import com.zolfagharipour.portfolio.pages.home.sections.experience.intern.InternSubExperience
import com.zolfagharipour.portfolio.pages.home.sections.experience.mentor.MentorSubExperience
import com.zolfagharipour.portfolio.pages.home.sections.experience.wallet.WalletSubExperience
import com.zolfagharipour.portfolio.util.AppConstants
import org.jetbrains.compose.web.css.*


@Composable
fun ExperienceSection(
    onWalletDialog: () -> Unit,
    onAppStoreDialog: () -> Unit
) {
    Column(
        modifier = Modifier.fillMaxWidth(),
    ) {
        Headline1(
            id = Section.EXPERIENCE.id,
            text = Section.EXPERIENCE.title,
        )
        Spacing(height = AppConstants.Size.Margin.BETWEEN_TITLE_AND_CONTENT.px)
        WalletSubExperience(onDialog = onWalletDialog)
        Spacing(height = AppConstants.Size.Margin.BETWEEN_SECTIONS.px)
        AppStoreSubExperience(onDialog = onAppStoreDialog)
        Spacing(height = AppConstants.Size.Margin.BETWEEN_SECTIONS.px)
        MentorSubExperience()
        Spacing(height = AppConstants.Size.Margin.BETWEEN_SECTIONS.px)
        InternSubExperience()
    }
}