package sample

import java.util.Hashtable
import java.util.UUID

private val dogRepository: Hashtable<UUID, Dog> = Hashtable()

fun main() {
    var nextLine: String?
    nextLine = chooseOption()

    while (nextLine != null) {

        when(recognizeOption(nextLine)) {
            1 -> createDog()
        }

        nextLine = chooseOption()
    }
}

fun createDog() {
    //val scanner = Scanner(System.`in`)
    dogRepository[UUID.randomUUID()] = Dog()
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
    println("\t1 - Dar de alta un perro")
}