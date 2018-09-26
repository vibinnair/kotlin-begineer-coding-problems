package kotlinExamples
import java.util.Scanner

fun main(args: Array<String>) {
    println("Enter the length of the square: ")
    val length = readLine()!!.toInt()

    println("The perimeter of the square is: ${4 * length}")
}