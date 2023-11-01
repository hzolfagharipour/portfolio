package com.zolfagharipour.resume.pages.home.sections.project.coroutine

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.css.ObjectFit
import com.varabyte.kobweb.compose.foundation.layout.*
import com.varabyte.kobweb.compose.ui.*
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.silk.components.graphics.Image
import com.varabyte.kobweb.silk.components.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.theme.breakpoint.rememberBreakpoint
import com.zolfagharipour.resume.components.*
import com.zolfagharipour.resume.util.*
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.*
import org.w3c.files.FileReader

@Composable
internal fun CoroutineFlowProject() {
    val breakpoint = rememberBreakpoint()
    Column(
        modifier = Modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.Start,
        verticalArrangement = Arrangement.Top
    ) {
        Headline2(
            id = AppConstants.ID.COROUTINE_FLOW,
            text = AppConstants.Project.Coroutine.TITLE,
        )
        Spacing(height = 10.px)
        if (breakpoint >= Breakpoint.MD) {
            Row(
                verticalAlignment = Alignment.Top,
                horizontalArrangement = Arrangement.Start,
                modifier = Modifier.fillMaxWidth()
            ) {
                BookImage(modifier = Modifier.maxWidth(150.px))
                Spacing(width = 30.px)
                Descriptions(desList = AppConstants.Project.Coroutine.DESCRIPTIONS)
            }
        } else {
            Descriptions(desList = AppConstants.Project.Coroutine.DESCRIPTIONS)
            Spacing(height = 10.px)
            BookImage(modifier = Modifier.fillMaxWidth(50.percent))
        }
        Spacing(height = 10.px)
        BodyTextBold(text = AppConstants.Project.Coroutine.DEMO_TITLE)
        Spacing(height = 5.px)
        Descriptions(desList = listOf(AppConstants.Project.Coroutine.DEMO_DES))
        Spacing(height = 10.px)
        ButtonLink(
            text = AppConstants.Project.Coroutine.DOWNLOAD,
            path = AppConstants.Project.Coroutine.DEMO_DOWNLOAD_LINK
        )
        Spacing(height = 10.px)
        BodyTextBold(text = AppConstants.Project.Coroutine.BUY_TITLE)
        Spacing(height = 5.px)
        Descriptions(desList = listOf(AppConstants.Project.Coroutine.BUY_DES))
    }
}

@Composable
private fun BookImage(modifier: Modifier = Modifier) {
    Image(
        modifier = modifier
            .radiusSize()
            .objectFit(ObjectFit.Fill),
        src = AppRes.Image.Project.COROUTINE,
    )
}