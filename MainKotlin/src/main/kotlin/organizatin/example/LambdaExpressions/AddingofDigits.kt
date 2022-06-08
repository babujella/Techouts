package organizatin.example.LambdaExpressions

fun main(args:Array<String>) {
    var result={num1:Int,num2:Int-> println(num1+num2)}
    result(3,4)

    var Result:(Int,Int)->Unit={number1,number2-> println(number1/number2)}
    Result(10,9)

}