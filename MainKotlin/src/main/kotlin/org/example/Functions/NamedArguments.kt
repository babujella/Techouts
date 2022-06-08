package org.example.Functions

fun main(args:Array<String>) {
    fun NamedArguments(Id:Int,Name:String){
        println("$Id    $Name")
    }
    NamedArguments(Name = "Babu", Id = 1839)
}