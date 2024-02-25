package com.zolfagharipour.portfolio.pages.home.sections.home


private object Links {
    const val MEDIUM = "https://medium.com/@hzolfagharipour"
    const val GITHUB = "https://github.com/hzolfagharipour"
    const val LINKEDIN = "https://www.linkedin.com/in/hasan-zolfagharipour/"
    const val TELEGRAM = "https://t.me/hasan_zlp"
    const val GMAIL = "mailto:hzolfagharipour@gmail.com"
}

internal enum class Social(
    val link: String,
    val socialIconId: String,
) {
    MEDIUM(
        socialIconId = "medium",
        link = Links.MEDIUM
    ),
    GITHUB(
        socialIconId = "github",
        link = Links.GITHUB
    ),
    LINKEDIN(
        socialIconId = "linkedin",
        link = Links.LINKEDIN
    ),
    TELEGRAM(
        socialIconId = "telegram",
        link = Links.TELEGRAM
    ),
    GMAIL(
        socialIconId = "google-plus",
        link = Links.GMAIL
    ),
}