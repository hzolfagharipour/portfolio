package com.zolfagharipour.resume.pages.home.sections.recommendation

import com.zolfagharipour.resume.util.*

enum class Recommendation(
    val title: String,
    val text: String,
    val image: String,
) {
    YAS(
        title = AppConstants.Recommendation.SECOND,
        text = AppConstants.Recommendation.SECOND_TEXT,
        image = AppRes.Image.Person.YAS,
    ),
    KEYVAN(
        title = AppConstants.Recommendation.THIRD,
        text = AppConstants.Recommendation.THIRD_TEXT,
        image = AppRes.Image.Person.KEYVAN,
    ),
    MANAGER(
        title = AppConstants.Recommendation.FIRST,
        text = AppConstants.Recommendation.FIRST_TEXT,
        image = AppRes.Image.Person.SHAFEIAN,
    ),
}