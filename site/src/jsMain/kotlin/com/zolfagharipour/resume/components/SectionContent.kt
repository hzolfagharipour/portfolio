package com.zolfagharipour.resume.components

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.css.MaxHeight
import com.varabyte.kobweb.compose.css.ObjectFit
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.silk.components.graphics.Image
import com.varabyte.kobweb.silk.components.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.theme.breakpoint.rememberBreakpoint
import com.zolfagharipour.resume.models.RadiusSize
import com.zolfagharipour.resume.util.isNotNull
import com.zolfagharipour.resume.util.radiusSize
import org.jetbrains.compose.web.css.*


@Composable
fun ImageAndContent(
    modifier: Modifier = Modifier,
    image: String,
    imageBackgroundColor: CSSColorValue = Colors.Transparent,
    radiusSize: RadiusSize = RadiusSize.Zero,
    imgPercentInLGScreen: Int = 50,
    imgPercentInSMScreen: Int = imgPercentInLGScreen,
    imageMaxWidth: CSSNumeric? = null,
    reverse: Boolean,
    content: @Composable () -> Unit,
) {
    val breakpoint = rememberBreakpoint()
    LeftRight(
        modifier = modifier,
        reverse = reverse,
        leftSide = content
    ) {
        ImageComponent(
            src = image,
            imageFillPercent = if (breakpoint <= Breakpoint.SM) imgPercentInSMScreen else imgPercentInLGScreen,
            imageMaxWidth = imageMaxWidth,
            radiusSize = radiusSize,
            backgroundColor = imageBackgroundColor,
        )
    }
}

@Composable
private fun ImageComponent(
    src: String,
    imageFillPercent: Int,
    imageMaxWidth: CSSNumeric? = null,
    backgroundColor: CSSColorValue,
    radiusSize: RadiusSize = RadiusSize.Zero,
) {
    Image(
        modifier = Modifier
            .maxHeight(MaxHeight.FitContent)
            .margin(leftRight = 30.px)
            .backgroundColor(backgroundColor)
            .fillMaxWidth(imageFillPercent.percent)
            .run {
                if (imageMaxWidth.isNotNull())
                    maxWidth(imageMaxWidth)
                else
                    this
            }
            .radiusSize(radiusSize = radiusSize)
            .objectFit(ObjectFit.Fill),
        src = src,
    )
}