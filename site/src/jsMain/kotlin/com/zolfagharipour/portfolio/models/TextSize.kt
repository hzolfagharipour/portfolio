package com.zolfagharipour.portfolio.models

import com.zolfagharipour.portfolio.util.AppConstants

enum class TextSize(
    val size: Int
) {
    Body(size = AppConstants.Size.Text.BODY),
    LARGE(size = AppConstants.Size.Text.LARGE),
    Headline1(size = AppConstants.Size.Text.HEADLINE1),
    Headline1SM(size = AppConstants.Size.Text.HEADLINE1_SMALL_SCREEN),
    Headline2(size = AppConstants.Size.Text.HEADLINE2),
    Headline2SM(size = AppConstants.Size.Text.HEADLINE2_SMALL_SCREEN),
    Button(size = AppConstants.Size.Text.BUTTON),
}