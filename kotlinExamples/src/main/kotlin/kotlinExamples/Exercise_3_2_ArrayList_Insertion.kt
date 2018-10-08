package kotlinExamples

fun main(args: Array<String>) {
    var colors = mutableListOf("Red", "Green", "Blue", "Black")

    for (color in colors) {
        print("$color ")
    }

    println("")

    colors[0] = "White"

    for (color in colors) {
        print("$color ")
    }
}