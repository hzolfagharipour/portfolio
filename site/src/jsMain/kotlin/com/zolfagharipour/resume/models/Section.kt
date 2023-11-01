package com.zolfagharipour.resume.models

import com.zolfagharipour.resume.util.AppConstants

enum class Section(
    val id: String,
    val title: String,
    val path: String,
    val icon: String,
) {
    PROJECT(
        id = "project",
        title = AppConstants.SectionTitle.PROJECT,
        path = "#project",
        icon = "laptop-code"
    ),
    EXPERIENCE(
        id = "experience",
        title = AppConstants.SectionTitle.EXPERIENCE,
        path = "#experience",
        icon = "briefcase"
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
    CONTACT(
        id = "contact",
        title = AppConstants.SectionTitle.CONTACT,
        path = "#contact",
        icon = "phone"
    ),
}