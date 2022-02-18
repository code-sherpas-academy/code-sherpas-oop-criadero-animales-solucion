package sample.getanimals

import sample.Animal
import sample.Cat
import sample.Dog

fun handleGetAnimalsOption() {
    getAnimals().forEach { animal: Animal ->
        when(animal) {
            is Dog -> println("Dog: id=${animal.id} name=${animal.name} father=${animal.father?.id ?: ""} mother=${animal.mother?.id ?: ""}")
            is Cat -> println("Cat: id=${animal.id} name=${animal.name} father=${animal.father?.id ?: ""} mother=${animal.mother?.id ?: ""}")
        }
    }
}