package com.zolfagharipour.portfolio.util

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import com.varabyte.kobweb.compose.css.Cursor
import com.varabyte.kobweb.compose.css.TextAlign
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Color
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.silk.components.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.theme.breakpoint.rememberBreakpoint
import com.varabyte.kobweb.silk.theme.colors.ColorMode
import com.zolfagharipour.portfolio.models.*
import com.zolfagharipour.portfolio.theme.AppColors
import org.jetbrains.compose.web.css.*
import kotlin.contracts.ExperimentalContracts
import kotlin.contracts.contract


fun Modifier.pointerCursor() = cursor(Cursor.Pointer)
fun Modifier.font(fontFamily: FontFamily = FontFamily.Normal) = fontFamily(fontFamily.font)
fun Modifier.textSize(textSize: TextSize = TextSize.Body) = fontSize(textSize.size.px)
fun Modifier.rounded(radiusSize: RadiusSize = RadiusSize.Normal) = borderRadius(radiusSize.size.px)

fun Modifier.heightLine(heightLine: HeightLine = HeightLine.Normal) = lineHeight(heightLine.size)

@Composable
fun Modifier.fillMaxWidthHandled(): Modifier {
    val breakpoint = rememberBreakpoint()
    return fillMaxWidth(if (breakpoint <= Breakpoint.SM) 100.percent else 80.percent)
}
fun Modifier.textJustify(textAlign: TextAlign = TextAlign.Justify) = textAlign(textAlign)

@Composable
fun Modifier.fgColor(
    fgColor: FGColor
) = when(fgColor) {
    FGColor.Body -> lightOrDarkColor(
        lightColor = AppColors.LightColorBody,
        darkColor = AppColors.DarkColorBody,
    )
    FGColor.Button -> lightOrDarkColor(
        lightColor = AppColors.LightBtnTextColor,
        darkColor = AppColors.DarkBtnTextColor,
    )
    FGColor.Headline1 -> lightOrDarkColor(
        lightColor = AppColors.LightColorHeadline1,
        darkColor = AppColors.DarkColorHeadline1,
    )
    FGColor.Headline2 -> lightOrDarkColor(
        lightColor = AppColors.LightColorHeadline2,
        darkColor = AppColors.DarkColorHeadline2,
    )
}.let { color(it) }

@Composable
fun Modifier.bgColor(
    bgColor: BGColor
) = when(bgColor) {
    BGColor.Image -> lightOrDarkColor(
        lightColor = AppColors.LightImgBackgroundColor,
        darkColor = AppColors.DarkImgBackgroundColor
    )
    BGColor.Button -> lightOrDarkColor(
        lightColor = AppColors.LightBtnBackgroundColor,
        darkColor = AppColors.DarkBtnBackgroundColor,
    )
    BGColor.Card -> lightOrDarkColor(
        lightColor = AppColors.LightCardColor,
        darkColor = AppColors.DarkCardColor,
    )
    BGColor.Card2 -> lightOrDarkColor(
        lightColor = AppColors.LightCardColor2,
        darkColor = AppColors.DarkCardColor2,
    )
    BGColor.Card3 -> lightOrDarkColor(
        lightColor = AppColors.LightCardColor3,
        darkColor = AppColors.DarkCardColor3,
    )
    BGColor.Card4 -> lightOrDarkColor(
        lightColor = AppColors.LightCardColor4,
        darkColor = AppColors.DarkCardColor4,
    )
    BGColor.Card5 -> lightOrDarkColor(
        lightColor = AppColors.LightCardColor5,
        darkColor = AppColors.DarkCardColor5,
    )
    BGColor.Shadow ->
        lightOrDarkColor(
            lightColor = AppColors.LightShadowColor,
            darkColor = AppColors.DarkShadowColor,
        )
}.let { backgroundColor(it) }

@Composable
fun Modifier.defaultLongTextStyle(
    fontFamily: FontFamily = FontFamily.Normal,
    fgColor: FGColor = FGColor.Body,
    textSize: TextSize = TextSize.Body,
    textAlign: TextAlign = TextAlign.Justify,
    heightLine: HeightLine = HeightLine.Normal
    ) =
    font(fontFamily = fontFamily)
        .fgColor(fgColor = fgColor)
        .textSize(textSize = textSize)
        .textJustify(textAlign = textAlign)
        .heightLine(heightLine = heightLine)

@OptIn(ExperimentalContracts::class)
fun <T> T?.isNotNull(): Boolean {
    contract {
        returns(true) implies (this@isNotNull != null)
    }
    return this != null
}

inline fun <T, R> T?.ifNotNull(fn: (T) -> R): R? {
    return if (this != null)
        fn(this)
    else
        null
}

@Composable
fun Modifier.bordered() = border(
    width = 2.px,
    style = LineStyle.Solid,
    color = lightOrDarkColor(
        lightColor = AppColors.LightImgBackgroundColor,
        darkColor = AppColors.DarkImgBackgroundColor,
    )
)

@Composable
fun lightOrDarkColor(lightColor: AppColors, darkColor: AppColors): Color {
    return lightOrDarkWork(
        lightWork = { lightColor.toColor() },
        darkWork = { darkColor.toColor() }
    )
}

@Composable
inline fun <T> lightOrDarkWork(lightWork: () -> T, darkWork: () -> T): T {
    val colorMode by ColorMode.currentState
    return if (colorMode == ColorMode.LIGHT)
        lightWork() else darkWork()
}