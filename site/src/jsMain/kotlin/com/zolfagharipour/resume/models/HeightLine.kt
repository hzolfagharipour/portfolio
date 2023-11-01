package com.zolfagharipour.resume.models

import com.zolfagharipour.resume.util.AppConstants

enum class HeightLine(
    val size: Double
) {
    Normal(size = AppConstants.Size.HeightLine.NORMAL),
    Small(size = AppConstants.Size.HeightLine.SMALL),
}