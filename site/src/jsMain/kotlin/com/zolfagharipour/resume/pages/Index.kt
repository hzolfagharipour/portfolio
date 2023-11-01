package com.zolfagharipour.resume.pages

import androidx.compose.runtime.*
import com.varabyte.kobweb.compose.foundation.layout.*
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.core.Page
import com.zolfagharipour.resume.components.DialogComponent
import com.zolfagharipour.resume.components.ToTopButton
import com.zolfagharipour.resume.pages.home.sections.about.AboutSection
import com.zolfagharipour.resume.pages.home.sections.experience.ExperienceSection
import com.zolfagharipour.resume.pages.home.sections.experience.appStore.AppStoreDialogContent
import com.zolfagharipour.resume.pages.home.sections.experience.wallet.WalletDialogContent
import com.zolfagharipour.resume.pages.home.sections.footer.FooterSection
import com.zolfagharipour.resume.pages.home.sections.home.HomeSection
import com.zolfagharipour.resume.pages.home.sections.home.NavigationDrawer
import com.zolfagharipour.resume.pages.home.sections.project.ProjectSection
import com.zolfagharipour.resume.pages.home.sections.recommendation.RecommendationSection
import com.zolfagharipour.resume.util.AppConstants
import org.jetbrains.compose.web.css.px


/**
 *
 * Routing notes:
 * * Define `Page` annotation for your composable function
 * * Override your own path by adding constructor to Page like this: `Page(routeOverride = )`
 * * Keep in mind, the defined route should not be a constant, It should be defined literally like this: Page(routeOverride = "some_route")``
 * * Place your page file in root of pages directory
 * * Navigate to it
 * * If you place the file in subdirectory of pages, consider to add the path to navigating function like this:
 */
@Page
@Composable
fun HomePage() {
    var overflowMenu by remember { mutableStateOf(false) }
    var walletDialog by remember { mutableStateOf(false) }
    var appStoreDialog by remember { mutableStateOf(false) }
    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(leftRight = 30.px),
        contentAlignment = Alignment.TopCenter
    ) {
        Column(
            modifier = Modifier
                .maxWidth(AppConstants.Size.Screen.MAX_WIDTH.px)
                .fillMaxSize(),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            HomeSection { overflowMenu = true }
            ProjectSection()
            ExperienceSection(
                onWalletDialog = { walletDialog = true },
                onAppStoreDialog = { appStoreDialog = true }
            )
            RecommendationSection()
            AboutSection()
            FooterSection()
        }

        ToTopButton()

        if (overflowMenu) NavigationDrawer { overflowMenu = false }

        if (appStoreDialog || walletDialog)
            DialogComponent(
                title = if (walletDialog)
                    AppConstants.Experience.Wallet.DIALOG_TITLE_KEY_FEATURES
                else AppConstants.Experience.AppStore.DIALOG_TITLE_KEY_FEATURES,
                onClose = {
                    appStoreDialog = false
                    walletDialog = false
                },
                content = {
                    if (walletDialog)
                        WalletDialogContent()
                    else if (appStoreDialog)
                        AppStoreDialogContent()
                }
            )
    }
}