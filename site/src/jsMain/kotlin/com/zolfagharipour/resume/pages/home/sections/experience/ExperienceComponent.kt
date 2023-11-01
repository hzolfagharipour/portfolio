package com.zolfagharipour.resume.pages.home.sections.experience

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.css.MaxHeight
import com.varabyte.kobweb.compose.css.ObjectFit
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.silk.components.graphics.Image
import com.varabyte.kobweb.silk.components.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.theme.breakpoint.rememberBreakpoint
import com.zolfagharipour.resume.components.*
import com.zolfagharipour.resume.models.BGColor
import com.zolfagharipour.resume.models.TextInput
import com.zolfagharipour.resume.util.*
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px

@Composable
internal fun ExperienceComponent(
    id: String?,
    headline: String,
    image: String,
    textInputs: List<TextInput>,
    tags: List<String>?,
    reverse: Boolean,
    content: @Composable () -> Unit,
) {
    LeftRight(
        reverse = reverse,
        leftSide = {
            HeadlineDesBulletTag(
                id = id,
                title = headline,
                textInputs = textInputs
            )
        }
    ) {
        RightSide(
            modifier = Modifier,
            image = image,
            tags = tags,
            content = content
        )
    }
}

@Composable
private fun RightSide(
    modifier: Modifier = Modifier.margin(leftRight = 20.px),
    image: String,
    tags: List<String>?,
    content: @Composable () -> Unit,
) {
    val breakpoint = rememberBreakpoint()
    Column(
        modifier = modifier.fillMaxWidth(),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.Start
    ) {
        Image(
            modifier = Modifier
                .maxHeight(MaxHeight.FitContent)
                .bgColor(BGColor.Image)
                .fillMaxWidth(if (breakpoint <= Breakpoint.SM) 100.percent else 70.percent)
                .radiusSize()
                .objectFit(ObjectFit.Fill),
            src = image,
        )
        if (tags.isNotNull()) {
            Spacing(height = 10.px)
            Tags(tags = tags)
        }

        Spacing(height = 10.px)
        content()
    }
}