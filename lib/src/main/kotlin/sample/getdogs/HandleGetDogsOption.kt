package sample.getdogs

import sample.Dog

fun handleGetDogsOption() {
    getDogs().forEach { dog: Dog ->
        println("Dog: id=${dog.id} name=${dog.name} father=${dog.father?.id ?: ""} mother=${dog.mother?.id ?: ""}")
    }
}