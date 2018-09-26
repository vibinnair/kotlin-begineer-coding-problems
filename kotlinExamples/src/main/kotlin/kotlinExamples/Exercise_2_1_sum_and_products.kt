package kotlinExamples
import java.util.Scanner

fun main(args: Array<String>) {
    println("Enter first number: ")
    val firstNumber = readLine()!!.toInt()
    println("Enter second number: ")
    val secondNumber = readLine()!!.toInt()

    println("The sum of two numbers are: ${firstNumber + secondNumber}")
    println("The product of two numbers are: ${firstNumber * secondNumber}")
}