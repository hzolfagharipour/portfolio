package com.zolfagharipour.portfolio.theme

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.css.CSSTransition
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.silk.components.style.*
import com.zolfagharipour.portfolio.util.lightOrDarkWork
import com.zolfagharipour.portfolio.util.pointerCursor
import org.jetbrains.compose.web.css.*

val LightHoverIconStyle by ComponentStyle {
    base {
        Modifier
            .color(AppColors.LightColorTint())
            .transition(CSSTransition(property = "color", duration = 200.ms))
    }

    hover {
        Modifier
            .color(AppColors.LightColorHover())
            .pointerCursor()
    }
}

val DarkHoverIconStyle by ComponentStyle {
    base {
        Modifier
            .color(AppColors.DarkColorDeactivateTint())
            .transition(CSSTransition(property = "color", duration = 200.ms))
    }

    hover {
        Modifier
            .color(AppColors.DarkColorHover())
            .pointerCursor()
    }
}

val HoverResizeStyle by ComponentStyle {
    base {
        Modifier
            .size(35.px)
            .transition(CSSTransition(property = "all", duration = 200.ms))
    }

    hover {
        Modifier
            .size(45.px)
            .pointerCursor()
    }
}

val LightRecommendationCardStyle by ComponentStyle {
    base {
        Modifier
            .border(
                width = 2.px,
                style = LineStyle.Solid,
                color = Colors.Transparent
            )
            .transition(
                CSSTransition(property = "border", duration = 200.ms),
            )
    }
    hover {
        Modifier
            .border(
                width = 2.px,
                style = LineStyle.Solid,
                color = AppColors.LightColorHover()
            )
    }
}

val DarkRecommendationCardStyle by ComponentStyle {
    base {
        Modifier
            .border(
                width = 2.px,
                style = LineStyle.Solid,
                color = Colors.Transparent
            )
            .transition(
                CSSTransition(property = "border", duration = 200.ms),
            )
    }
    hover {
        Modifier
            .border(
                width = 2.px,
                style = LineStyle.Solid,
                color = AppColors.DarkColorHover()
            )
    }
}

@Composable
fun hoverIconStyle() = lightOrDarkWork(
    lightWork = { LightHoverIconStyle },
    darkWork = { DarkHoverIconStyle },
).toModifier()

@Composable
fun HoverBorderCardStyle() = lightOrDarkWork(
    lightWork = { LightRecommendationCardStyle },
    darkWork = { DarkRecommendationCardStyle },
).toModifier()