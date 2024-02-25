package com.zolfagharipour.portfolio.models

import com.zolfagharipour.portfolio.util.AppConstants

enum class RadiusSize(
    val size: Int
) {
    Normal(size = AppConstants.Size.Radius.NORMAL),
    Small(size = AppConstants.Size.Radius.SMALL),
    Button(size = AppConstants.Size.Radius.BUTTON),
    Circle(size = AppConstants.Size.Radius.CIRCLE),
}