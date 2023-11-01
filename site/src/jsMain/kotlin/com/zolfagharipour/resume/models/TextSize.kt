package com.zolfagharipour.resume.models

import com.zolfagharipour.resume.util.AppConstants

enum class TextSize(
    val size: Int
) {
    Body(size = AppConstants.Size.Text.BODY),
    Headline1(size = AppConstants.Size.Text.HEADLINE1),
    Headline1SM(size = AppConstants.Size.Text.HEADLINE1_SMALL_SCREEN),
    Headline2(size = AppConstants.Size.Text.HEADLINE2),
    Headline2SM(size = AppConstants.Size.Text.HEADLINE2_SMALL_SCREEN),
    Headline3(size = AppConstants.Size.Text.HEADLINE3),
    Button(size = AppConstants.Size.Text.BUTTON),
}