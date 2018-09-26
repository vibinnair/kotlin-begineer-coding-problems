package kotlinExamples
import java.util.Scanner

fun main(args: Array<String>) {
    println("Enter first number: ")
    val firstNumber = readLine()!!.toInt()

    println("Enter second number: ")
    val secondNumber = readLine()!!.toInt()

    println("Enter the third number: ")
    val thirdNumber = readLine()!!.toInt()

    println("Enter the fourth number: ")
    val fourthNumber = readLine()!!.toInt()

    val sum = firstNumber + secondNumber + thirdNumber + fourthNumber
    println("The product of all numbers is $sum")
    println("The average of all numbers is ${sum / 4}")
}
