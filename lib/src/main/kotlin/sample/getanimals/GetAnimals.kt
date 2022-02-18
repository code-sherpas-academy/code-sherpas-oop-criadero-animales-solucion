package sample.getanimals

import sample.Animal
import sample.AnimalRepository

fun getAnimals(): List<Animal> = AnimalRepository.getAll()