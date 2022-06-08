package org.example.Functions



fun myMethod(number1:Int,number2:Int):Int{
//    return number2+number1
    var sum=number2+number1
    return sum
}

fun main(args:Array<String>) {
    var myMethodObject= myMethod(4,9)
    println(myMethodObject)
}