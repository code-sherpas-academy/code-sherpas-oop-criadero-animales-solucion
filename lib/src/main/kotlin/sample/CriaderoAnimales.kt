package sample

import java.util.Hashtable

private val dogRepository: Hashtable<Int, Dog> = Hashtable()

fun main() {
    var option: Int?
    option = readOption()

    while (option != null) {

        when(option) {
            1 -> createDog()
        }

        option = readOption()
    }
}

fun createDog() {
    //val scanner = Scanner(System.`in`)
    dogRepository[1] = Dog()
}

private fun readOption(): Int? {
    printOptions()
    val nextLine: String? = readLine()
    return nextLine?.split(" ")?.get(0)?.toInt()
}

private fun printOptions() {
    println("Elija una opción:")
    println("\t1 - Crear un perro")
}