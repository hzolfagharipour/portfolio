package com.zolfagharipour.portfolio.pages.home.sections.about

import com.zolfagharipour.portfolio.util.AppRes
import org.jetbrains.compose.web.css.CSSColorValue
import org.jetbrains.compose.web.css.rgba

private const val FRAMEWORK_ALPHA = 0.20

internal enum class Framework(internal val  src: String, internal val  color: CSSColorValue) {
    ANDROID_STUDIO(color = rgba(61, 220, 132, a = FRAMEWORK_ALPHA), src = AppRes.Icons.Framework.ANDROID_STUDIO),
    INTELLIJ(color = rgba(r = 13, g = 135, b = 225, a = FRAMEWORK_ALPHA), src = AppRes.Icons.Framework.INTELLIJ),
    KOTLIN(color = rgba(r = 232, g = 127, b = 61, a = FRAMEWORK_ALPHA), src = AppRes.Icons.Framework.KOTLIN),
    JAVA(color = rgba(r = 244, g = 67, b = 54, a = FRAMEWORK_ALPHA), src = AppRes.Icons.Framework.JAVA),
    FLUTTER(color = rgba(r = 64, g = 196, b = 255, a = FRAMEWORK_ALPHA), src = AppRes.Icons.Framework.FLUTTER),
    DART(color = rgba(r = 66, g = 165, b = 245, a = FRAMEWORK_ALPHA), src = AppRes.Icons.Framework.DART),
    VISUAL_STUDIO(color = rgba(r = 41, g = 176, b = 237, a = FRAMEWORK_ALPHA), src = AppRes.Icons.Framework.VISUAL_STUDIO),
    GIT(color = rgba(r = 244, g = 81, b = 30, a = FRAMEWORK_ALPHA), src = AppRes.Icons.Framework.GIT),
    FIREBASE(color = rgba(r = 255, g = 196, b = 0, a = FRAMEWORK_ALPHA), src = AppRes.Icons.Framework.FIREBASE)
}