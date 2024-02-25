package com.zolfagharipour.portfolio.theme

import com.varabyte.kobweb.compose.ui.graphics.Color
import org.jetbrains.compose.web.css.rgba


enum class AppColors(
    private val a: Float = 1.0f,
    val r: Int,
    val g: Int,
    val b: Int,
) {

    LightColorBackground(r = 253, g = 247, b = 233),
    DarkColorBackground(r = 0, g = 15, b = 26),

    LightColorBody(r = 70, g = 69, b = 74),
    DarkColorBody(r = 204, g = 204, b = 204),

    LightColorTint(r = 9, g = 95, b = 122),
    DarkColorTint(r = 94, g = 106, b = 184),


    DarkColorDeactivateTint(r = DarkColorBody.r, g = DarkColorBody.g, b = DarkColorBody.b),
    DarkColorActivateTint(r = 231, g = 136, b = 149),

    LightColorHeadline1(r = 11, g = 83, b = 148),
    DarkColorHeadline1(r = 138, g = 188, b = 216),

    LightColorHeadline2(r = LightColorTint.r, g = LightColorTint.g, b = LightColorTint.b),
    DarkColorHeadline2(r = 17, g = 145, b = 158),

    LightColorLink(r = LightColorHeadline2.r, g = LightColorHeadline2.g, b = LightColorHeadline2.b),
    DarkColorLink(r = DarkColorHeadline2.r, g = DarkColorHeadline2.g, b = DarkColorHeadline2.b),

    LightBtnTextColor(r = 255, g = 255, b = 255),
    DarkBtnTextColor(r = 243, g = 243, b = 244),

    LightBtnBackgroundColor(r = LightColorTint.r, g = LightColorTint.g, b = LightColorTint.b),
    DarkBtnBackgroundColor(r = DarkColorTint.r, g = DarkColorTint.g, b = DarkColorTint.b),

    LightShadowColor(a = 0.6f, r = 0, g = 0, b = 0),
    DarkShadowColor(a = 0.15f, r = 255, g = 255, b = 255),

    LightImgBackgroundColor(r = DarkColorActivateTint.r, g = DarkColorActivateTint.g, b = DarkColorActivateTint.b),
    DarkImgBackgroundColor(r = DarkColorActivateTint.r, g = DarkColorActivateTint.g, b = DarkColorActivateTint.b),

    LightColorHover(r = DarkColorActivateTint.r, g = DarkColorActivateTint.g, b = DarkColorActivateTint.b),
    DarkColorHover(r = DarkColorActivateTint.r, g = DarkColorActivateTint.g, b = DarkColorActivateTint.b),

    LightCardColor(r = 243, g = 243, b = 244),
    DarkCardColor(r = 7, g = 24, b = 41),

    LightCardColor2(a = 1.0f, 220, 214, 247),
    DarkCardColor2(a = 1.0f,11, 38, 65),
    LightCardColor3(a = 1.0f, 255, 226, 226),
    DarkCardColor3(a = 1.0f, 53, 55, 75),
    LightCardColor4(a = 1.0f, 187, 226, 236),
    DarkCardColor4(a = 1.0f,12, 45, 87),
    LightCardColor5(a = 1.0f, 154, 208, 194),
    DarkCardColor5(a = 1.0f,11, 38, 65),
    ;

    operator fun invoke(
        a: Float = this.a,
        r: Int = this.r,
        g: Int = this.g,
        b: Int = this.b,
    ) = rgba(r = r, g = g, b = b, a = a)

    fun toColor() = Color.rgba(r = r, g = g, b = b, a = a)
}