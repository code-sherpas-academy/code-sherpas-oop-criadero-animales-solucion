package sample

import sample.createcat.handleCreateCatOption
import sample.createdog.handleCreateDogOption
import sample.getanimal.handleGetAnimalOption
import sample.getanimals.handleGetAnimalsOption
import sample.updatecat.handleUpdateCatOption
import sample.updatedog.handleUpdateDogOption

fun main() {
    var option: Int?
    option = readOption()

    while (option != null) {

        when (option) {
            1 -> handleCreateDogOption()
            2 -> handleGetAnimalsOption()
            3 -> handleGetAnimalOption()
            4 -> handleUpdateDogOption()
            5 -> handleCreateCatOption()
            6 -> handleUpdateCatOption()
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
    println("\t2 - Ver todos los animales")
    println("\t3 - Ver los datos de un animal")
    println("\t4 - Modificar los datos de un perro")
    println("\t5 - Crear gato")
    println("\t6 - Modificar los datos de un gato")
}
