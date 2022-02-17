package sample.getdogs

import sample.Dog
import sample.DogRepository

fun getDogs(): List<Dog> = DogRepository.getAll()