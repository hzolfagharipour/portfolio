package com.zolfagharipour.resume.theme

import com.varabyte.kobweb.silk.init.InitSilkContext
import com.varabyte.kobweb.silk.theme.colors.MutableSilkPalette

fun lightMode(ctx: InitSilkContext): MutableSilkPalette {
    val lightPalette = ctx.theme.palettes.light
    return lightPalette.apply {
        background = AppColors.LightColorBackground.toColor()
        link.default = AppColors.LightColorLink.toColor()
        link.visited = AppColors.LightColorLink.toColor()
    }
}

fun darkMode(ctx: InitSilkContext): MutableSilkPalette {
    val lightPalette = ctx.theme.palettes.dark
    return lightPalette.apply {
        background = AppColors.DarkColorBackground.toColor()
        link.default = AppColors.DarkColorLink.toColor()
        link.visited = AppColors.DarkColorLink.toColor()
    }
}