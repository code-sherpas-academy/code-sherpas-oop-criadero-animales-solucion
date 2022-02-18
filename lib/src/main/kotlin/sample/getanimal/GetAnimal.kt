package sample.getanimal

import sample.Animal
import sample.AnimalRepository

fun getAnimal(id: Int): Animal = AnimalRepository.get(id)