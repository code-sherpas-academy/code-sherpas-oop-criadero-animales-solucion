package sample

fun main() {
    var option: Int?
    option = readOption()

    while (option != null) {

        when (option) {
            1 -> handleCreateDogOption()
            2 -> handleGetDogsOption()
            3 -> handleGetDogOption()
        }

        option = readOption()
    }
}

private fun handleGetDogOption() {
    println("Por favor, introduce el identificador del perro:")
    readLine()?.toInt()?.let { getDog(it) }
        ?.let { dog -> println("Dog: id=${dog.id} name=${dog.name} breed=${dog.breed} birthdate=${dog.birthdate} father=${dog.father?.id ?: ""} mother=${dog.mother?.id ?: ""} tame=${dog.tame}") }
}

private fun handleGetDogsOption() {
    getDogs().forEach { dog: Dog ->
        println("Dog: id=${dog.id} name=${dog.name} father=${dog.father?.id ?: ""} mother=${dog.mother?.id ?: ""}")
    }
}

private fun handleCreateDogOption() {
    println("Introduce los campos del perro. Por ejemplo:")
    println("\tname=Teddy breed=Yorkshire birthdate=2020-03-05 father=23 mother= tame=true")
    buildCreateDogCommand()?.let { createDog(it) }
}

private fun buildCreateDogCommand(): CreateDogCommand? {
    val fields: List<String> = extractFields() ?: return null

    val name: String = fields.extractFieldAt(0)
    val breed: String = fields.extractFieldAt(1)
    val birthdate: String = fields.extractFieldAt(2)
    val fatherId: Int? = fields.extractNullableIntAt(3)
    val motherId: Int? = fields.extractNullableIntAt(4)
    val tame: Boolean = fields.extractBooleanAt(5)

    return CreateDogCommand(name, breed, birthdate, fatherId, motherId, tame)
}

private fun readOption(): Int? {
    printOptions()
    val nextLine: String? = readLine()
    return nextLine?.split(" ")?.get(0)?.toInt()
}

private fun printOptions() {
    println("Elija una opción:")
    println("\t1 - Crear un perro")
    println("\t2 - Ver todos los perros")
    println("\t3 - Ver los datos de un perro")
}

private fun List<String>.extractNullableIntAt(position: Int): Int? = extractNullableFieldAt(position)?.toInt()

private fun List<String>.extractFieldAt(position: Int): String = this[position].split("=")[1]

private fun List<String>.extractNullableFieldAt(position: Int): String? =
    this.extractFieldAt(position).let { it.ifEmpty { null } }

private fun extractFields(): List<String>? = readLine()?.split(" ")

private fun List<String>.extractBooleanAt(position: Int): Boolean = this.extractFieldAt(position).toBoolean()