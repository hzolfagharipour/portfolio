package com.zolfagharipour.resume.models

import com.zolfagharipour.resume.util.AppConstants

enum class RadiusSize(
    val size: Int
) {
    Zero(size = 0),
    Normal(size = AppConstants.Size.Radius.NORMAL),
    Small(size = AppConstants.Size.Radius.SMALL),
    Button(size = AppConstants.Size.Radius.BUTTON),
    Circle(size = AppConstants.Size.Radius.CIRCLE),
}