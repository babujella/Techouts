package com.challenges.Challenge

fun main(args:Array<String>) {
    val hello1="Hello"
    val hello2="Hello"

    println(hello1===hello2)
    println(hello1==hello2)
println("---------------------------------")
    val name:String="the any type is the root of kotlin class hierarchy"
        if(name !is String){
            println(name.length)
        }else println(name.uppercase())

println("---------------------------------")
    var num="""   1
            |  11
            | 111
            |1111   
    """.trimMargin()
    println(num)
    }
