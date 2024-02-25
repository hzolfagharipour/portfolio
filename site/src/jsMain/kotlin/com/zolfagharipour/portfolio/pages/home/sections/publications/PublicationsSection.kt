package com.zolfagharipour.portfolio.pages.home.sections.publications

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxWidth
import com.zolfagharipour.portfolio.components.*
import com.zolfagharipour.portfolio.models.BGColor
import com.zolfagharipour.portfolio.models.Section
import com.zolfagharipour.portfolio.util.AppConstants
import com.zolfagharipour.portfolio.util.AppRes
import org.jetbrains.compose.web.css.px

@Composable
fun PublicationsSection() {
    Column(
        modifier = Modifier.fillMaxWidth(),
    ) {
        Headline1(
            id = Section.PUBLICATION.id,
            text = Section.PUBLICATION.title
        )
        // Articles
        Spacing(height = AppConstants.Size.Margin.BETWEEN_TITLE_AND_CONTENT.px)
        Headline2(
            id = AppConstants.Publications.Articles.ID,
            text = AppConstants.Publications.Articles.TITLE,
        )
        Spacing(height = AppConstants.Size.Margin.BETWEEN_TITLE_AND_CONTENT.px)
        PublicationComponent(
            id = AppConstants.Publications.Articles.ContextReceiver.ID,
            title = AppConstants.Publications.Articles.ContextReceiver.TITLE,
            description = AppConstants.Publications.Articles.ContextReceiver.DESCRIPTIONS,
            image = AppRes.Image.Publication.CONTEXT_RECEIVER,
            linkModels = AppConstants.Publications.Articles.ContextReceiver.LINKS,
            bgColor = BGColor.Card2
        )

        // Books
        Spacing(height = AppConstants.Size.Margin.BETWEEN_TITLE_AND_CONTENT.px)
        Headline2(
            id = AppConstants.Publications.Book.ID,
            text = AppConstants.Publications.Book.TITLE,
        )
        Spacing(height = AppConstants.Size.Margin.BETWEEN_TITLE_AND_CONTENT.px)
        PublicationComponent(
            id = AppConstants.Publications.Book.Coroutine.ID,
            title = AppConstants.Publications.Book.Coroutine.TITLE,
            description = AppConstants.Publications.Book.Coroutine.DESCRIPTIONS,
            image = AppRes.Image.Publication.COROUTINE,
            linkModels = AppConstants.Publications.Book.Coroutine.LINKS,
            bgColor = BGColor.Card3
            )
    }
}