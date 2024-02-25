package com.zolfagharipour.portfolio.pages.home.sections.recommendation

import com.zolfagharipour.portfolio.models.BGColor
import com.zolfagharipour.portfolio.util.AppConstants
import com.zolfagharipour.portfolio.util.AppRes

enum class Recommendation(
    val title: String,
    val text: String,
    val image: String,
    val bgColor: BGColor,
) {
    YAS(
        title = AppConstants.Recommendation.SECOND,
        text = AppConstants.Recommendation.SECOND_TEXT,
        image = AppRes.Image.Person.YAS,
        bgColor = BGColor.Card2
    ),
    KEYVAN(
        title = AppConstants.Recommendation.THIRD,
        text = AppConstants.Recommendation.THIRD_TEXT,
        image = AppRes.Image.Person.KEYVAN,
        bgColor = BGColor.Card
    ),
    MANAGER(
        title = AppConstants.Recommendation.FIRST,
        text = AppConstants.Recommendation.FIRST_TEXT,
        image = AppRes.Image.Person.SHAFEIAN,
        bgColor = BGColor.Card4
    ),
}