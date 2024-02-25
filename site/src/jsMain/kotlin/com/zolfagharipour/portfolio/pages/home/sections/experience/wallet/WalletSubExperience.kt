package com.zolfagharipour.portfolio.pages.home.sections.experience.wallet

import androidx.compose.runtime.Composable
import com.zolfagharipour.portfolio.components.InfoLine
import com.zolfagharipour.portfolio.models.TextInput
import com.zolfagharipour.portfolio.pages.home.sections.experience.ExperienceComponent
import com.zolfagharipour.portfolio.util.AppConstants
import com.zolfagharipour.portfolio.util.AppRes

@Composable
internal fun WalletSubExperience(onDialog: () -> Unit) {
    ExperienceComponent(
        id = AppConstants.Experience.Wallet.ID,
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