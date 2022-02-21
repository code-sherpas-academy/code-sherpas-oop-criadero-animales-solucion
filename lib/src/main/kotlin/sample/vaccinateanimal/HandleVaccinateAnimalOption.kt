package sample.vaccinateanimal

fun handleVaccinateAnimalOption() {
    println("Por favor, introduce el identificador del animal:")
    readLine()?.toInt()?.let { vaccinateAnimal(it) }
}