import com.varabyte.kobweb.gradle.application.extensions.AppBlock.LegacyRouteRedirectStrategy
import com.varabyte.kobweb.gradle.application.util.configAsKobwebApplication
import kotlinx.html.link

plugins {
    alias(libs.plugins.kotlin.multiplatform)
    alias(libs.plugins.jetbrains.compose)
    alias(libs.plugins.kobweb.application)
}

group = "com.zolfagharipour.portfolio"
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

        // Only legacy sites need this set. Sites built after 0.16.0 should default to DISALLOW.
        // See https://github.com/varabyte/kobweb#legacy-routes for more information.
        legacyRouteRedirectStrategy.set(LegacyRouteRedirectStrategy.DISALLOW)
    }
}

kotlin {
    configAsKobwebApplication("portfolio")

    sourceSets {
        commonMain.dependencies {
            implementation(compose.runtime)
        }

        jsMain.dependencies {
            implementation(libs.kobweb.core)
            implementation(libs.kobweb.silk)
            implementation(libs.silk.foundation)
            implementation(libs.silk.icons.fa)
            implementation(libs.silk.icons.mdi)
            implementation(compose.html.core)
            
        }
    }
}
