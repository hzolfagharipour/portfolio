package com.zolfagharipour.portfolio.models

import com.zolfagharipour.portfolio.util.AppConstants

enum class Section(
    val id: String,
    val title: String,
    val path: String,
    val icon: String,
) {
    EXPERIENCE(
        id = "experience",
        title = AppConstants.SectionTitle.EXPERIENCE,
        path = "#experience",
        icon = "briefcase"
    ),
    ENDEAVOR(
        id = "endeavor",
        title = AppConstants.SectionTitle.ENDEAVOR,
        path = "#endeavor",
        icon = "laptop-code"
    ),
    PUBLICATION(
        id = "publications",
        title = AppConstants.SectionTitle.PUBLICATIONS,
        path = "#publications",
        icon = "book"
    ),
    RECOMMENDATION(
        id = "recommendation",
        title = AppConstants.SectionTitle.RECOMMENDATION,
        path = "#recommendation",
        icon = "circle-check"
    ),
    ABOUT(
        id = "about",
        title = AppConstants.SectionTitle.ABOUT_ME,
        path = "#about",
        icon = "user"
    ),
}