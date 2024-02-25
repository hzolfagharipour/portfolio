package com.zolfagharipour.portfolio.pages.home.sections.experience.wallet

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxSize
import com.zolfagharipour.portfolio.components.*
import com.zolfagharipour.portfolio.util.AppConstants
import org.jetbrains.compose.web.css.px

@Composable
fun WalletDialogContent() {
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        Spacing(height = 5.px)
        Descriptions(desList = AppConstants.Experience.Wallet.INTRO_DES1)
        Spacing(height = 10.px)
        Bullets(bullets = AppConstants.Experience.Wallet.INTRO_FEA1)
        Spacing(height = 10.px)
        Descriptions(desList = AppConstants.Experience.Wallet.INTRO_DES2)
        Spacing(height = 10.px)
        Bullets(bullets = AppConstants.Experience.Wallet.INTRO_FEA2)
    }
}