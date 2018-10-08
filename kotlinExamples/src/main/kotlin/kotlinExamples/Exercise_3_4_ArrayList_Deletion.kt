package kotlinExamples

fun main(args: Array<String>) {
    var colors = mutableListOf("White", "Red", "Green", "Blue")

    for (color in colors) {
        print("$color ")
    }

    println()

    colors.removeAt(2)

    for (color in colors) {
        print("$color ")
    }
}