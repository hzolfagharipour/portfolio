package com.zolfagharipour.resume

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.ui.modifiers.minHeight
import com.varabyte.kobweb.core.App
import com.varabyte.kobweb.silk.SilkApp
import com.varabyte.kobweb.silk.components.layout.Surface
import com.varabyte.kobweb.silk.components.style.common.SmoothColorStyle
import com.varabyte.kobweb.silk.components.style.toModifier
import com.varabyte.kobweb.silk.init.InitSilk
import com.varabyte.kobweb.silk.init.InitSilkContext
import com.varabyte.kobweb.silk.theme.colors.MutableSilkPalettes
import com.zolfagharipour.resume.theme.darkMode
import com.zolfagharipour.resume.theme.lightMode
import org.jetbrains.compose.web.css.vh

@InitSilk
fun initSilk(ctx: InitSilkContext) {

    ctx.theme.palettes = MutableSilkPalettes(
        light = lightMode(ctx),
        dark = darkMode(ctx)
    )
}

@App
@Composable
fun MyApp(content: @Composable () -> Unit) {
    SilkApp {
        Surface(SmoothColorStyle.toModifier().minHeight(100.vh)) {
            content()
        }
    }
}
