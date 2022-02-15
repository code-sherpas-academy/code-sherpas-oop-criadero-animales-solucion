package sample

import java.util.Hashtable

private val dogRepository: Hashtable<Int, Dog> = Hashtable()

fun main() {
    var option: String?
    option = chooseOption()

    while (option != null) {

        when(recognizeOption(option)) {
            1 -> createDog()
        }

        option = chooseOption()
    }
}

fun createDog() {
    //val scanner = Scanner(System.`in`)
    dogRepository[1] = Dog()
}

private fun recognizeOption(nextLine: String): Int {
    val words: List<String> = nextLine.split(" ")
    return words[0].toInt()
}

private fun chooseOption(): String? {
    printOptions()
    return readLine()
}

private fun printOptions() {
    println("Elija una opción:")
    println("\t1 - Crear un perro")
}