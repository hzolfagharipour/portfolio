package com.zolfagharipour.portfolio.models

import com.zolfagharipour.portfolio.util.AppConstants

enum class HeightLine(
    val size: Double
) {
    Normal(size = AppConstants.Size.HeightLine.NORMAL),
    Small(size = AppConstants.Size.HeightLine.SMALL),
}