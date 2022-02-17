package sample.getdog

fun handleGetDogOption() {
    println("Por favor, introduce el identificador del perro:")
    readLine()?.toInt()?.let { getDog(it) }
        ?.let { dog -> println("Dog: id=${dog.id} name=${dog.name} breed=${dog.breed} birthdate=${dog.birthdate} father=${dog.father?.id ?: ""} mother=${dog.mother?.id ?: ""} tame=${dog.tame}") }
}