package com.sample

class Computer(private val printer: Printer) {

    fun printMsg(msg: String) {
        printer.print(msg)
    }
}