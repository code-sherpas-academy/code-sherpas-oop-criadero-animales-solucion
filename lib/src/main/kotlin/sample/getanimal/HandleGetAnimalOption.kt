package sample.getanimal

import sample.Cat
import sample.Dog

fun handleGetAnimalOption() {
    println("Por favor, introduce el identificador del animal:")
    readLine()?.toInt()?.let { getAnimal(it) }
        ?.let { animal ->
            when (animal) {
                is Dog -> println("Dog: id=${animal.id} name=${animal.name} breed=${animal.breed} birthdate=${animal.birthdate} father=${animal.father?.id ?: ""} mother=${animal.mother?.id ?: ""} tame=${animal.tame}")
                is Cat -> println("Cat: id=${animal.id} name=${animal.name} breed=${animal.breed} birthdate=${animal.birthdate} father=${animal.father?.id ?: ""} mother=${animal.mother?.id ?: ""} sociable=${animal.sociable}")
            }
        }
}