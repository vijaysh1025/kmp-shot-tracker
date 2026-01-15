package com.vijay.shottracker

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform