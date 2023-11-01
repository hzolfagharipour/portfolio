package com.zolfagharipour.resume.pages.home.sections.experience

import androidx.compose.runtime.*
import com.varabyte.kobweb.compose.foundation.layout.*
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.zolfagharipour.resume.components.*
import com.zolfagharipour.resume.models.*
import com.zolfagharipour.resume.pages.home.sections.experience.appStore.AppStoreExperience
import com.zolfagharipour.resume.pages.home.sections.experience.intern.InternExperience
import com.zolfagharipour.resume.pages.home.sections.experience.wallet.WalletExperience
import com.zolfagharipour.resume.util.*
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
        WalletExperience(onDialog = onWalletDialog)
        Spacing(height = AppConstants.Size.Margin.BETWEEN_SECTIONS.px)
        AppStoreExperience(onDialog = onAppStoreDialog)
        Spacing(height = AppConstants.Size.Margin.BETWEEN_SECTIONS.px)
        InternExperience()
    }
}