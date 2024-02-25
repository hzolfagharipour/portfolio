package com.zolfagharipour.portfolio.pages.home.sections.home

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.css.*
import com.varabyte.kobweb.compose.css.functions.LinearGradient
import com.varabyte.kobweb.compose.css.functions.linearGradient
import com.varabyte.kobweb.compose.foundation.layout.*
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.navigation.OpenLinkStrategy
import com.varabyte.kobweb.silk.components.graphics.Image
import com.varabyte.kobweb.silk.components.icons.fa.*
import com.varabyte.kobweb.silk.components.navigation.Link
import com.zolfagharipour.portfolio.components.*
import com.zolfagharipour.portfolio.models.BGColor
import com.zolfagharipour.portfolio.models.RadiusSize
import com.zolfagharipour.portfolio.theme.AppColors
import com.zolfagharipour.portfolio.theme.hoverIconStyle
import com.zolfagharipour.portfolio.util.*
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px


@Composable
internal fun ImageAndContent(
    image: String,
    reverse: Boolean,
    content: @Composable () -> Unit,
) {
    LeftRight(
        modifier = Modifier,
        reverse = reverse,
        leftSide = content,
        rightSide = {
            ImageComponent(
                src = image,
                imageFillPercent = 80,
            )
        }
    )
}

@Composable
private fun ImageComponent(
    src: String,
    imageFillPercent: Int,
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top,
        modifier = Modifier.bgColor(BGColor.Card).padding(20.px).rounded()
    ) {


        Image(
            modifier = Modifier
                .maxHeight(MaxHeight.FitContent)
                .backgroundImage(
                    linearGradient(
                        LinearGradient.Direction.ToTop,
                        AppColors.LightCardColor5.toColor(),
                        AppColors.LightCardColor5(a = 0.01f)
                    )
                )
                .padding(top = 20.px)
                .aspectRatio(1)
                .fillMaxWidth(imageFillPercent.percent)
                .rounded(RadiusSize.Circle)
                .objectFit(ObjectFit.Fill),
            src = src,
        )
        Spacing(height = 30.px)


        Headline2(
            text = AppConstants.Home.CONTACT_ME,
            textAlign = TextAlign.Center
        )

        Spacing(height = 30.px)

        SocialBar()
        Spacing(height = 20.px)

    }
}

@Composable
private fun SocialBar() {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center
    ) {
        Social.entries.forEach {
            Link(
                modifier = Modifier.margin(right = 16.px),
                path = it.link,
                openExternalLinksStrategy = OpenLinkStrategy.IN_NEW_TAB
            ) {
                FaIcon(
                    name = it.socialIconId,
                    modifier = hoverIconStyle()
                        .padding(0.px)
                        .margin(0.px),
                    style = IconCategory.BRAND,
                    size = IconSize.XXL
                )
            }
        }
    }
}