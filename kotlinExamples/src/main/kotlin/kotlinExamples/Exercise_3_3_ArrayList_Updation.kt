package kotlinExamples

fun main(args: Array<String>) {
    var colors = mutableListOf("Black", "White", "Green", "Blue")

    for (color in colors) {
        print("$color ")
    }

    println()

    colors.set(2, "Red")

    for (color in colors) {
        print("$color ")
    }
}