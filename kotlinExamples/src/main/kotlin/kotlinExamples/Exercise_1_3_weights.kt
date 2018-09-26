package kotlinExamples

fun main(args: Array<String>) {
    val weightOfFirstPerson = 45.70f
    val weightOfSecondPerson = 59.60f
    val weightOfThirdPerson = 39.20f

    val averageWeight = (weightOfFirstPerson + weightOfSecondPerson + weightOfThirdPerson) / 3
    println("average weight of all is $averageWeight")
}