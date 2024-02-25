package com.zolfagharipour.portfolio.pages.home.sections.experience.appStore

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxSize
import com.zolfagharipour.portfolio.components.*
import com.zolfagharipour.portfolio.util.AppConstants
import org.jetbrains.compose.web.css.px

@Composable
fun AppStoreDialogContent() {
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        Spacing(height = 5.px)
        Descriptions(desList = AppConstants.Experience.AppStore.INTRO_DES)
        Spacing(height = 10.px)
        Bullets(bullets = AppConstants.Experience.AppStore.INTRO_FEA)
    }
}