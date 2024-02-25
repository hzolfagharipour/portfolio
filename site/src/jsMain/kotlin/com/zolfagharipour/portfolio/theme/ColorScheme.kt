package com.zolfagharipour.portfolio.theme

import com.varabyte.kobweb.silk.init.InitSilkContext
import com.varabyte.kobweb.silk.theme.colors.palette.background
import com.varabyte.kobweb.silk.theme.colors.palette.link

fun setAppTheme(ctx: InitSilkContext) {

    ctx.theme.palettes.light.apply {
        background = AppColors.LightColorBackground.toColor()
        link.default = AppColors.LightColorLink.toColor()
        link.visited = AppColors.LightColorLink.toColor()
    }

    ctx.theme.palettes.dark.apply {
            background = AppColors.DarkColorBackground.toColor()
            link.default = AppColors.DarkColorLink.toColor()
            link.visited = AppColors.DarkColorLink.toColor()
        }
}