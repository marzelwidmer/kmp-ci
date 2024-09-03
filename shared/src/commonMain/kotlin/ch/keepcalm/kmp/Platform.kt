package ch.keepcalm.kmp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform