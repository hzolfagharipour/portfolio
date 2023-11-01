package com.zolfagharipour.resume.pages.home.sections.footer


private object Links {
    const val LINKEDIN = "https://www.linkedin.com/in/hasan-zolfagharipour/"
    const val GITHUB = "https://github.com/hzolfagharipour"
    const val TELEGRAM = "https://t.me/hasan_zlp"
    const val GMAIL = "mailto:hzolfagharipour@gmail.com"
}

internal enum class Social(
    val link: String,
    val socialIconId: String,
) {
    GITHUB(
        socialIconId = "github",
        link = Links.GITHUB
    ),
    TELEGRAM(
        socialIconId = "telegram",
        link = Links.TELEGRAM
    ),
    LINKEDIN(
        socialIconId = "linkedin",
        link = Links.LINKEDIN
    ),
    GMAIL(
        socialIconId = "google",
        link = Links.GMAIL
    )
}