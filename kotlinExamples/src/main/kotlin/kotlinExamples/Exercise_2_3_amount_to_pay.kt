package kotlinExamples

fun main(args: Array<String>) {
    println("Enter the price of the item: ")
    val itemPrice = readLine()!!.toFloat()

    println("How much quantity do you want: ")
    val quantity = readLine()!!.toInt()

    println("You need to pay ${itemPrice * quantity}")
}