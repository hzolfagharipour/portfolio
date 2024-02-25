package com.zolfagharipour.portfolio.components

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.css.TextAlign
import com.varabyte.kobweb.compose.css.TextDecorationLine
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.*
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.silk.components.icons.fa.FaCircleInfo
import com.varabyte.kobweb.silk.components.icons.fa.IconSize
import com.varabyte.kobweb.silk.components.navigation.Link
import com.varabyte.kobweb.silk.components.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.theme.breakpoint.rememberBreakpoint
import com.zolfagharipour.portfolio.models.*
import com.zolfagharipour.portfolio.util.*
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.dom.*


@Composable
fun BodyTextBold(
    text: String,
    modifier: Modifier = Modifier,
    fontFamily: FontFamily = FontFamily.Bold,
    fgColor: FGColor = FGColor.Headline2,
    textSize: TextSize = TextSize.Body,
    textAlign: TextAlign = TextAlign.Start,
    heightLine: HeightLine = HeightLine.Normal,
) {
    B(
        attrs = modifier
            .textSize(textSize)
            .font(fontFamily = fontFamily)
            .fgColor(fgColor = fgColor)
            .textAlign(textAlign)
            .heightLine(heightLine)
            .padding(0.px)
            .margin(0.px)
            .toAttrs()
    ) { Text(text) }
}

@Composable
fun BodyText(
    text: String,
    modifier: Modifier = Modifier,
    fontFamily: FontFamily = FontFamily.Normal,
    fgColor: FGColor = FGColor.Body,
    textSize: TextSize = TextSize.Body,
    textAlign: TextAlign = TextAlign.Justify,
    heightLine: HeightLine = HeightLine.Normal,
) {
    P(
        attrs = modifier
            .padding(0.px)
            .margin(0.px)
            .defaultLongTextStyle(
                fontFamily = fontFamily,
                fgColor = fgColor,
                textSize = textSize,
                textAlign = textAlign,
                heightLine = heightLine
            )
            .toAttrs()
    ) {
        Text(text)
    }
}

@Composable
fun Headline1(
    id: String?,
    text: String,
    textAlign: TextAlign = TextAlign.Center,
    marginTop: CSSSizeValue<CSSUnit.px> = AppConstants.Size.Margin.BETWEEN_SECTIONS.px,
) {
    val breakpoint = rememberBreakpoint()
    B(
        attrs = Modifier
            .run {
                if (id.isNotNull())
                    id(id)
                else
                    this
            }
            .fillMaxWidth()
            .textAlign(textAlign)
            .margin(top = marginTop)
            .font(fontFamily = FontFamily.Bold)
            .fgColor(fgColor = FGColor.Headline1)
            .textSize(
                if (breakpoint >= Breakpoint.LG)
                    TextSize.Headline1
                else
                    TextSize.Headline1SM
            )
            .toAttrs()
    ) { Text(text) }
}

@Composable
fun Headline2(
    text: String,
    id: String? = null,
    textAlign: TextAlign = TextAlign.Start,
) {
    val breakpoint = rememberBreakpoint()

    B(
        attrs = Modifier
            .run { if (id.isNotNull()) id(id) else this }
            .font(fontFamily = FontFamily.Bold)
            .fillMaxWidth()
            .textAlign(textAlign)
            .fgColor(FGColor.Headline2)
            .margin(0.px)
            .padding(0.px)
            .textSize(
                if (breakpoint >= Breakpoint.LG)
                    TextSize.Headline2
                else
                    TextSize.Headline2SM
            )
            .toAttrs()
    ) { Text(text) }
}

@Composable
fun InfoLine(
    text: String,
    onClick: () -> Unit,
) {
    Row(
        modifier = Modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Start
    ) {
        FaCircleInfo(size = IconSize.SM, modifier = Modifier.fgColor(FGColor.Headline2))
        Spacing(width = 4.px)
        BodyTextBold(
            text = text,
            modifier = Modifier
                .onClick { onClick() }
                .pointerCursor()
                .textDecorationLine(TextDecorationLine.Underline)
        )
    }
}

@Composable
fun LinkText(linkModel: LinkModel) {
    Row(
        modifier = Modifier.fillMaxWidth().flexFlow(FlexDirection.Row, flexWrap = FlexWrap.Wrap),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Start
    ) {
        BodyText(text = linkModel.des)
        Spacing(width = 4.px)
        Link(
            path = linkModel.link
        ) { BodyTextBold(text = linkModel.linkTitle, modifier = Modifier.pointerCursor()
            .textDecorationLine(TextDecorationLine.Underline)) }
    }
}