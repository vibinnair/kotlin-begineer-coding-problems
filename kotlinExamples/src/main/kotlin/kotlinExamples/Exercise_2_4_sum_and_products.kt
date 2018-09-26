package kotlinExamples
import java.util.Scanner

fun main(args: Array<String>) {
    println("Enter first number: ")
    val firstNumber = readLine()!!.toInt()

    println("Enter second number: ")
    val secondNumber = readLine()!!.toInt()

    println("Enter third number: ")
    val thirdNumber = readLine()!!.toInt()

    println("Enter fourth number: ")
    val fourthNumber = readLine()!!.toInt()

    println("The sum of numbers $firstNumber and $secondNumber is ${firstNumber + secondNumber}")
    println("The product of numbers $thirdNumber and $fourthNumber is ${thirdNumber * fourthNumber}")
}