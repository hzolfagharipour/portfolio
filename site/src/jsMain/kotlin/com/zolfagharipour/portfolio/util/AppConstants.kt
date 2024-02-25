package com.zolfagharipour.portfolio.util

import com.zolfagharipour.portfolio.models.LinkModel

object AppConstants {

    object Size {

        object Radius {

            const val NORMAL = 20
            const val SMALL = 10
            const val BUTTON = 10
            const val CIRCLE = 190
        }

        object Text {

            const val BODY = 14
            const val LARGE = 18
            const val HEADLINE1 = 50
            const val HEADLINE1_SMALL_SCREEN = 36
            const val HEADLINE2 = 30
            const val HEADLINE2_SMALL_SCREEN = 24
            const val BUTTON = 13
        }

        object Margin {

            const val BETWEEN_TITLE_AND_CONTENT = 30
            const val BETWEEN_SECTIONS = 50
        }

        object Screen {
            const val MAX_WIDTH = 1920
        }

        object HeightLine {

            const val NORMAL = 1.6
            const val SMALL = 1.2
        }
    }

    object SectionTitle {

        const val ABOUT_ME = "About Me"
        const val EXPERIENCE = "Experience"
        const val ENDEAVOR = "Personal Endeavors"
        const val PUBLICATIONS = "Publications"
        const val RECOMMENDATION = "Recommendation"
    }

    object Home {

        const val CONTACT_ME = "Contact Me"
        const val ID = "home"
        const val HELLO = "Hello I'm"
        const val FULL_NAME = "Hasan Zolfagharipour"
        const val NAME = "Hasan"
        const val JOB_TITLE = "Android Developer"
        const val DEVELOPER_SHORT_INFO =
            "With more than 3 years of hands-on experience in developing cutting-edge Android applications using Kotlin and Java. I’ve demonstrated my expertise in asynchronous programming by authoring the book \"Kotlin Coroutine-Flow In Use\" set to be published soon. Moreover, I've authored insightful Android articles on Medium. I also built the current modern portfolio website using the \"Kotlin Compose for web\" framework."
    }

    object Experience {

        object Wallet {
            const val ID = "wallet"
            const val TITLE = "Daya Pay"

            val INTRO_DES1 = listOf("This multifunctional app, custom-built for a private institution focuses on banking and financial services. Offering a wide range of features using digital wallet or bank gateway, including:")
            val INTRO_FEA1 = listOf(
                "Purchasing mobile credit & internet top-ups",
                "Effortless bill payment by scanning barcodes or pasting sms-based bills",
                "Exploring transaction history, categorizing, and sharing reports",
                "Convenient contributions to charities",
                "Gift QR-Code with custom amount",
                "In-Store payments via QR-Code scanning",
                "Engaging customer support through in-app messaging",
                "Storing bill ids for easy access and payments"
            )
            val INTRO_DES2 = listOf("Furthermore, the app incorporates a personal digital wallet, seamlessly linked to the bank account. The digital wallet offers versatile features such as:")
            val INTRO_FEA2 = listOf(
                "Top-up and withdraw",
                "Peer-to-Peer Transfers by sending funds between digital wallets"
            )

            val TECH_DESC = listOf("This app, built using Kotlin and the MVVM architecture, leverages Android's recommended practices and Android Jetpack components for robust development. Key highlights of this project include:")
            val TECH_FEA = listOf(
                "Designed with the single-activity pattern",
                        "Implemented asynchronous programming with Coroutines",
                        "Streamlined streams with various Flows, such as StateFlow and SharedFlow",
                        "Crafted a custom date and time picker dialog from scratch, tailored to the overall app UI without relying on external libraries",
                        "Integrated Firebase and AppMetrica services for FCM, Crashlytics, and Analytics functionalities",
                        "Safely retrieved OTP verification codes without requiring specific permissions",
                        "Offered user-friendly dark and light modes",
                        "Collaborated with other developers, designers, and product owners"
            )

            val SKILLS = listOf(
                "Navigation Component",
                "ViewBinding",
                "Coroutine",
                "Flow",
                "Room",
                "Retrofit",
                "Hilt",
                "Google Play Services",
                "Firebase",
                "AppMetrica",
                "QR-Code",
                "WebView",
                "Lottie",
            )
            const val READ_MORE = "Read more about the Wallet"
            const val DIALOG_TITLE_KEY_FEATURES = "Key features of the Wallet"
        }

        object AppStore {
            const val ID = "app-store"
            const val TITLE = "App Sore"
            val INTRO_DES = listOf("This comprehensive application is built for a private organization to manage all in-house apps. Offering a diverse array of functionalities, discover its rich feature set, which includes:")
            val INTRO_FEA = listOf(
                "Download android apps with in-app download service",
                "Install and uninstall apps within the application",
                "Leaving comments and feedback for every installed app",
                "Supporting a wide range of categories, including finance, tools, sports, and more",
                "Ensuring applications are kept up-to-date",
                "The ability to back up downloaded apps",
                "Guiding users with an in-app tour for a smooth experience",
            )

            val TECH_DESC = listOf("This Kotlin-based application is constructed using the MVVM architecture, following Android's best practices and making the most of Android Jetpack. Key features include:")
            val TECH_FEA = listOf(
                "Downloaded Apps in concurrent or sequential",
                        "Integrated Biometrics for enhanced app security",
                        "Improved user experience with bilingual app interface",
                        "Enhanced user experience with dark and light modes",
                        "Optimized data retrieval with custom JsonDeserializer",
                        "Created efficient extensions via Kotlin's contract feature",
                        "Implemented asynchronous programming with Coroutines",
                        "Streamlined streams with various Flows, such as StateFlow and SharedFlow"
                )
            val SKILLS = listOf(
                "Single Activity",
                "ViewBinding",
                "Kotlin DSL",
                "Biometrics",
                "Encryption",
                "Package Manager",
                "PhotoView",
                "Downloading Service",
                "Coroutine",
                "Flow",
                "Retrofit",
                "Room",
                "Hilt",
                "Navigation Component",
            )
            const val READ_MORE = "Read more about the App Store"
            const val DIALOG_TITLE_KEY_FEATURES = "Key features of the App Store"
        }

        object Mentor {
            const val ID = "mentor"

            const val TITLE = "Android Mentor"
            val INTRO_DES = listOf(
                "My passion lies in educating and sharing knowledge, and I consistently endeavor to place all that I've learned at the disposal of others for helping and empowering anyone seeking guidance.",
                "With this enthusiasm, I quickly ventured into the role of an active Android mentor at Maktab Sharif, alongside my primary career. It's a place where essential market-ready skills are delivered through practical, hands-on experience. Here are my key activities in this role encompass:"
            )
            val INTRO_FEA = listOf(
                "Guided and mentored passionate interns eager to dive into Android app development",
                "Collaborated closely with the educational team to create and refine Android development course materials, enhancing learning experiences",
                "Taught essential topics: Hilt, Room, Architecture, and Coroutine Flow",
                "Performed live coding and built Android apps from scratch to release, providing a holistic grasp of the development process",
                "Continuously assessed weekly and final projects to monitor interns' progress",
                "Provided support through troubleshooting, continuous code reviews, and constructive feedback during the internship"
            )
        }

        object Intern {
            const val ID = "intern"

            const val TITLE = "Internship"

            const val TECH_TITLE_MUSIC_PLAYER = "Music Player App:"
            val TECH_DES_MUSIC_PLAYER = listOf("Developed a feature-rich music player app closely resembling the intuitive functionality and design of Samsung's renowned music player using Java for Android. Key accomplishments include:")
            val TECH_FEA_MUSIC_PLAYER = listOf(
                "Designed a user-friendly interface with seamless navigation, ensuring an engaging music playback experience",
                "Implemented features such as playlist management and favorite",
                "Received positive feedback for the user interface and design"
            )

            const val TECH_TITLE_MARKET = "Market App (DGKala-like):"
            val TECH_DES_MARKET = listOf("Created a dynamic e-commerce market app akin to DGKala, offering a comprehensive shopping experience, utilizing Kotlin for Android. Key achievements include:")
            val TECH_FEA_MARKET = listOf(
                    "Designed and developed a visually appealing and user-friendly marketplace app with features comparable to DGKala",
                    "Implemented functionalities for product search, product listings, user accounts, and more",
                    "Ensured a responsive and smooth shopping experience through optimized performance and intuitive navigation"
                )

            val SKILLS = listOf(
                "Kotlin",
                "Java",
                "Media",
                "Service",
                "ViewBinding",
                "Navigation Component",
                "Coroutine",
                "Retrofit",
                "Room",
                "Coil",
                "Glide"
            )
        }
    }

    object Endeavor {
        object Portfolio {
            const val ID = "portfolio"
            const val TITLE = "Portfolio Website Using Kotlin & Compose"
            val INTRO_DES = listOf("The idea of having a personal website can be fascinating for anyone. It's a place where you can tell your career story and showcase your work samples. For Android programmers like us, learning web development might not sound very exciting initially, but with the arrival of Compose, it has become quite convenient to build your own personal website using Kotlin. A website with the following key features:")
            val TECH_FEA = listOf(
                "Crafted in Intellij Idea",
                "Developed using pure Kotlin",
                "Built with Compose",
                "Enhanced by Coroutine",
                "Powered by Kobweb framework",
                "Multi-Page support",
                "Fully responsive design (Mobile and Desktop)",
                "Light and dark themes",
            )

            const val KOBWEB_INTRO = "While it may seem challenging, this is where Kobweb comes into play, simplifying the use of 'Compose for web' for developers by offering useful features. Kobweb is an opinionated Kotlin framework built on top of Compose HTML for creating websites and web apps. It includes everything you need to build rich, dynamic websites, as well as web applications, while being able to leverage the greater Kotlin ecosystem."

            const val KOBWEB_OFFICIAL_LINK = "https://kobweb.varabyte.com/"
            const val COMPOSE_OFFICIAL_LINK = "https://developer.android.com/jetpack/compose"
            const val KOTLIN_OFFICIAL_LINK = "https://kotlinlang.org/docs/multiplatform.html"
        }
    }

    object Publications {

        object Book {
            const val ID = "books"
            const val TITLE = "Books"
            object Coroutine {
                const val ID = "coroutine-flow"

                const val TITLE = "Coroutine-Flow In Use Book"
                val DESCRIPTIONS = listOf("This is a comprehensive guide that takes you on an immersive journey into the world of Android development and Kotlin programming. With over 350 pages of carefully crafted content, this book is your ultimate companion for mastering of asynchronous programming using Coroutine and Flow. ")
                val LINKS = listOf(
                    LinkModel(
                        linkTitle = "Download",
                        link = "https://raw.githubusercontent.com/hzolfagharipour/portfolio/master/docs/Coroutine-Flow.pdf",
                        des = "Here is a portion of the book:"
                    )
                )
            }
        }

        object Articles {
            const val ID = "articles"
            const val TITLE = "Articles"
            object ContextReceiver {
                const val ID = "context-receiver"
                const val TITLE = "Comprehensive Guide To Kotlin Context Receiver"
                val DESCRIPTIONS = listOf(
                    "In Kotlin, context receivers provide a powerful mechanism to access and manipulate objects within a specific scope. This article aims to provide a comprehensive overview of context receivers, covering their benefits, usage, and limitations.",
                )

                val LINKS = listOf(
                    LinkModel(
                        link = "https://medium.com/@hzolfagharipour/comprehensive-guide-to-kotlin-context-receiver-f5478eea6b42",
                        linkTitle = "Medium",
                        des = "Read the full article on"
                    ),
                )
            }
        }
    }

    object Recommendation {

        // Shafeian
        const val FIRST = "Mostafa Shafeian"
        const val FIRST_TEXT =
            "Hasan has been working as an Android developer at our company for two years now." +
                    " From Java and Kotlin to Dart, His work is always top-notch, and he is always welcoming to feedback and making improvements. He has been a great resource to my company, making timely deliveries and helping me nurture long-term relationships with my clients. As a manager, overall, Hasan was a pleasure to work with, and I have no qualms recommending him to anybody looking for an excellent Android developer."

        // Yas
        const val SECOND = "Faezeh Yas"
        const val SECOND_TEXT =
            "Hasan is an exceptional developer who possesses all the skills one would want in an excellent Android developer. His work is always outstanding, and he always goes the extra mile to ensure the coding standards and client requirements are met. He is a highly-skilled, experienced, and helpful professional with a positive attitude. Working with Hasan has been a great experience for me as I learned hard and soft skills from him. If anyone needs a great Android developer with professional experience or a clean coding lover in their team, I recommend him."

        // Keyvan
        const val THIRD = "Keyvan Akbarpour"
        const val THIRD_TEXT =
            "Hasan and I worked together on several projects, and I was lucky to call him my coworker. He is a highly-skilled and experienced with a positive attitude and is willing to put that extra help whenever you need him. Hasan is able to quickly learn and adapt to new technologies. He consistently gave 100 percent effort to the team and played a significant role in ensuring that we completed assignments on time. I’ve loved my experience working with Hasan, and I know that anyone looking to hire or work with him will, too."

        const val RECOMMENDATION_LINK = "https://www.linkedin.com/in/hasan-zolfagharipour/details/recommendations/"
    }

    object About {

        const val CONTENT_TITLE = "My Passage to Progress"

        val INTRO_DES = listOf(
            "All Android developers are aware that the world of Android has undergone significant and fundamental changes in recent years. This means staying up-to-date is crucial. As an Android programmer, I've always striven to learn new technologies in this field through continuous study, driven by my passion and dedication. I worked with various technologies and frameworks without bias.",
            "In this journey, I had a short but fascinating experience with Flutter. However, my motivation, enthusiasm, and determination in Kotlin and Android native programming led me to achieve something significant in my career. This includes the publication of the \"Kotlin Coroutine-Flow In Use\" book in English, with over 350 pages, which will soon be available.",
            "In addition to my professional career, I also worked as a mentor alongside dear friends who were just beginning their journey. Live coding, project and code reviews, assessing interns, and teaching the key topics such as Hilt, Room, Coroutine and Flow were valuable experiences I gained at MaktabSharif.",
            "With the stability of Jetpack Compose, my work became even more enjoyable. The combination of Kotlin and Compose can attract any Android developer towards it. It's a sweet experience that I personally enjoyed. Having a personal website was an idea I had been contemplating for a long time, and finally, with Compose, I was able to bring that idea to life."
        )

        val INTRO_FEA = listOf(
            "Passion for building responsive, fast, high-quality, and attractive Android applications",
            "Advanced knowledge of Java and Kotlin",
            "Proficiency and proven experience in asynchronous programming and multi-threading",
            "Experience with dependency injection frameworks (Hilt, Koin)",
            "Translate designs and wireframes into high quality code",
            "Familiar with agile methodologies and jira Platform",
            "Familiarity working with Flutter",
        )
    }

    object Footer {

        const val MADE_WITH = "Made with"
        const val POWERED_BY = "Powered by Kotlin Compose"
    }
}