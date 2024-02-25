package com.zolfagharipour.portfolio.components

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.foundation.layout.*
import com.varabyte.kobweb.compose.ui.*
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.zolfagharipour.portfolio.models.*
import com.zolfagharipour.portfolio.theme.AppColors
import com.zolfagharipour.portfolio.util.*
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.dom.P
import org.jetbrains.compose.web.dom.Text


@Composable
fun HeadlineDesBulletTag(
    id: String? = null,
    title: String,
    textInputs: List<TextInput>,
    tags: List<String>? = null,
) {
    Column(
        modifier = Modifier.fillMaxWidthHandled(),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.Start
    ) {
        // Title
        Headline2(text = title, id = id)

        textInputs.forEach { (title, desList, bullets) ->

            title?.ifNotNull {
                Spacing(height = 10.px)
                BodyTextBold(text = it)
            }

            desList?.ifNotNull {
                Descriptions(desList = desList)
            }

            bullets?.ifNotNull {
                Spacing(height = 5.px)
                Bullets(it)
            }
        }

        // Tags
        tags.ifNotNull {
            Spacing(height = 10.px)
            Tags(it)
        }
    }
}

@Composable
fun Tags(tags: List<String>) {
    Row(
        modifier = Modifier.flexFlow(FlexDirection.Row, FlexWrap.Wrap).fillMaxWidth()
    ) {
        tags.forEach {
            P(
                attrs = Modifier.margin(leftRight = 4.px, top = 8.px).padding(leftRight = 4.px, topBottom = 2.px)
                    .font(fontFamily = FontFamily.Bold).heightLine(HeightLine.Small)
                    .rounded(radiusSize = RadiusSize.Small).textSize().fgColor(FGColor.Body).border(
                        width = 2.px, color = lightOrDarkColor(
                            lightColor = AppColors.LightColorBody,
                            darkColor = AppColors.DarkColorBody,
                        ), style = LineStyle.Dotted
                    ).toAttrs()
            ) { Text(it) }
        }
    }
}

@Composable
fun Bullets(bullets: List<String>) {
    Column(
        verticalArrangement = Arrangement.Top, horizontalAlignment = Alignment.Start, modifier = Modifier.fillMaxWidth()
    ) {
        bullets.forEachIndexed { index, text ->
            Row(
                modifier = Modifier.margin(top = if (index == 0) 0.px else 10.px)
            ) {
                BulletTextComponent(
                    text = "\u2022",
                    modifier = Modifier.margin(0.px).padding(0.px),
                )
                BulletTextComponent(text = text, modifier = Modifier.margin(left = 10.px))
            }
        }
    }
}

@Composable
private fun BulletTextComponent(
    modifier: Modifier = Modifier,
    text: String,
) {
    P(
        attrs = modifier.font().fgColor(FGColor.Body).textSize().heightLine(heightLine = HeightLine.Small).toAttrs()
    ) { Text(text) }
}

@Composable
fun Descriptions(
    desList: List<String>,
    allowedLength: Int = 0,
) {
    desList.forEach {
        P(
            attrs = Modifier.defaultLongTextStyle().fillMaxWidth().margin(0.px).padding(0.px).toAttrs()
        ) { Text(if (allowedLength > it.length) it.substring(0, allowedLength) else it) }
    }
}