package org.example.Functions

import java.util.*

var reader=Scanner(System.`in`)
fun adding(){
    println("Enter your first number :")
    var number1= reader.nextInt()
    println("Enter your second number :")
    var number2= reader.nextInt()

    println("Adding of two numbers is :${number1+number2}")
}

fun main(args:Array<String>) {
    adding()
    println("Succesfully Finished...")
}