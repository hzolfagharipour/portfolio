package com.zolfagharipour.resume.util

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import com.varabyte.kobweb.compose.css.*
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Color
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.silk.theme.colors.ColorMode
import com.zolfagharipour.resume.models.*
import com.zolfagharipour.resume.theme.*
import org.jetbrains.compose.web.css.*
import kotlin.contracts.ExperimentalContracts
import kotlin.contracts.contract


fun Modifier.pointerCursor() = cursor(Cursor.Pointer)
fun Modifier.font(fontFamily: FontFamily = FontFamily.Normal) = fontFamily(fontFamily.font)
fun Modifier.textSize(textSize: TextSize = TextSize.Body) = fontSize(textSize.size.px)
fun Modifier.radiusSize(radiusSize: RadiusSize = RadiusSize.Normal) = borderRadius(radiusSize.size.px)

fun Modifier.heightLine(heightLine: HeightLine = HeightLine.Normal) = lineHeight(heightLine.size)

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
    FGColor.Headline3 -> lightOrDarkColor(
        lightColor = AppColors.LightColorHeadline3,
        darkColor = AppColors.DarkColorHeadline3,
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
        lightColor = AppColors.LightColorHover,
        darkColor = AppColors.DarkColorHover,
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