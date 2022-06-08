package org.example.Functions

import java.util.*

fun main(args:Array<String>) {
    var reader=Scanner(System.`in`)
    var b:Boolean=true
    while (b) {
        println("Enter your number :")
        var number = reader.nextInt()
        var result = Math.sqrt(number.toDouble())
        println("The square root of $number is $result")
    }
}