package com.sample

actual class Printer {

    actual fun print(message: String) {
        println(message)
    }
}