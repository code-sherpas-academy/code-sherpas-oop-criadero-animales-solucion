package sample.getdog

import sample.Dog
import sample.DogRepository

fun getDog(id: Int): Dog = DogRepository.get(id)