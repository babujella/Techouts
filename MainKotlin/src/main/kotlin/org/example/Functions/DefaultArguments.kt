package org.example.Functions


fun defaultmethod(id:Int=1839,name:String="Babu_Jella"){
    println("Ur Id is $id and name is $name")
}
fun partialArgumentsPassed(Id:Int=1,Name:String="Babu"){
    println("Ur Id is :$Id and Ur name is :$Name")
}
fun fullyArgumentsPassed(Id:Int=1,Name: String="Babu"){
    println("Ur id is :$Id and Ur Name is :$Name")
}

fun main(args:Array<String>) {
   defaultmethod()    //If we do not specify any parameter while calling the function
                      //Default parameters acts as function Parameters---NO ARGUMENTS PASSED..//

    partialArgumentsPassed(1839)         //Partial arguments passed
    fullyArgumentsPassed(1839,"Jella_Babu")
}