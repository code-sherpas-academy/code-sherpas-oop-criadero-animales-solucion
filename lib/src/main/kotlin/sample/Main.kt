package sample

import sample.createdog.handleCreateDogOption
import sample.getdog.handleGetDogOption
import sample.getdogs.handleGetDogsOption
import sample.updatedog.handleUpdateDogOption

fun main() {
    var option: Int?
    option = readOption()

    while (option != null) {

        when (option) {
            1 -> handleCreateDogOption()
            2 -> handleGetDogsOption()
            3 -> handleGetDogOption()
            4 -> handleUpdateDogOption()
        }

        option = readOption()
    }
}

private fun readOption(): Int? {
    printOptions()
    val nextLine: String? = readLine()
    return nextLine?.split(" ")?.get(0)?.toInt()
}

private fun printOptions() {
    println("Elija una opción:")
    println("\t1 - Crear un perro")
    println("\t2 - Ver todos los perros")
    println("\t3 - Ver los datos de un perro")
    println("\t4 - Modificar los datos de un perro")
}
