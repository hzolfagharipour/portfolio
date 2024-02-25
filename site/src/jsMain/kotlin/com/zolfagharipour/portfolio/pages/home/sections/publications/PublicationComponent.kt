package com.zolfagharipour.portfolio.pages.home.sections.publications

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.css.ObjectFit
import com.varabyte.kobweb.compose.foundation.layout.*
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.silk.components.graphics.Image
import com.varabyte.kobweb.silk.components.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.theme.breakpoint.rememberBreakpoint
import com.zolfagharipour.portfolio.components.*
import com.zolfagharipour.portfolio.models.BGColor
import com.zolfagharipour.portfolio.models.LinkModel
import com.zolfagharipour.portfolio.theme.HoverBorderCardStyle
import com.zolfagharipour.portfolio.util.*
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px


@Composable
internal fun PublicationComponent(
    id: String,
    title: String,
    bgColor: BGColor,
    description: List<String>,
    image: String,
    linkModels: List<LinkModel>,
) {


    @Composable
    fun Constants() {
        BodyTextBold(text = title, modifier = Modifier.id(id))
        Spacing(height = 4.px)
        Descriptions(desList = description, allowedLength = 0)
        linkModels.forEach {
            Spacing(height = 6.px)
            LinkText(it)
        }
    }

    val breakpoint = rememberBreakpoint()
    Column(
        modifier = HoverBorderCardStyle().fillMaxWidth().bgColor(bgColor).rounded().padding(12.px).fillMaxWidthHandled(),
        horizontalAlignment = Alignment.Start,
        verticalArrangement = Arrangement.Top
    ) {
        if (breakpoint >= Breakpoint.MD) {
            Row(
                verticalAlignment = Alignment.Top,
                horizontalArrangement = Arrangement.Start,
                modifier = Modifier.fillMaxWidth()
            ) {
                ArticleImage(modifier = Modifier.maxWidth(150.px), image = image)
                Spacing(width = 16.px)
                Column(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalAlignment = Alignment.Start,
                    verticalArrangement = Arrangement.Top
                ){ Constants() }
            }
        } else {
            Constants()
            Spacing(height = 6.px)
            ArticleImage(modifier = Modifier.fillMaxWidth(50.percent), image = image)
        }
    }
}

@Composable
private fun ArticleImage(modifier: Modifier = Modifier, image: String) {
    Image(
        modifier = modifier
            .rounded()
            .aspectRatio(1)
            .objectFit(ObjectFit.Fill),
        src = image,
    )
}