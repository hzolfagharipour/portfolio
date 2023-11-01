package com.zolfagharipour.resume.pages.home.sections.experience.wallet

import androidx.compose.runtime.Composable
import com.zolfagharipour.resume.components.InfoLine
import com.zolfagharipour.resume.models.TextInput
import com.zolfagharipour.resume.pages.home.sections.experience.ExperienceComponent
import com.zolfagharipour.resume.util.AppConstants
import com.zolfagharipour.resume.util.AppRes

@Composable
internal fun WalletExperience(onDialog: () -> Unit) {
    ExperienceComponent(
        id = AppConstants.ID.WALLET,
        headline = AppConstants.Experience.Wallet.TITLE,
        image = AppRes.Image.Experience.WALLET,
        textInputs = listOf(
            TextInput(
                desList = AppConstants.Experience.Wallet.TECH_DESC,
                bullets = AppConstants.Experience.Wallet.TECH_FEA,
            )
        ),
        tags = AppConstants.Experience.Wallet.SKILLS,
        reverse = false
    ) {
        InfoLine(text = AppConstants.Experience.Wallet.READ_MORE, onClick = onDialog)
    }
}