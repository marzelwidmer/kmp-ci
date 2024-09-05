package ch.keepcalm

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform