import com.varabyte.kobweb.gradle.application.util.configAsKobwebApplication
import kotlinx.html.link
import kotlinx.html.script

plugins {
    alias(libs.plugins.kotlin.multiplatform)
    alias(libs.plugins.jetbrains.compose)
    alias(libs.plugins.kobweb.application)
}

group = "com.zolfagharipour.resume"
version = "1.0-SNAPSHOT"

kobweb {
    app {
        index {
            description.set("Hasan Zolfagharipour")

            head.add {
                link {
                    rel = "stylesheet"
                    href = "/portfolio/fonts/faces.css"
                }
            }
        }
    }
}

kotlin {
    configAsKobwebApplication(
        "resume",
    )

    sourceSets {
        val commonMain by getting {
            dependencies {
                implementation(compose.runtime)
            }
        }

        val jsMain by getting {
            dependencies {
                implementation(compose.html.core)
                implementation(libs.kobweb.core)
                implementation(libs.kobweb.silk.core)
                implementation(libs.kobweb.silk.icons.fa)
                implementation(libs.kobweb.silk.icons.mdi)
            }
        }
    }
}
