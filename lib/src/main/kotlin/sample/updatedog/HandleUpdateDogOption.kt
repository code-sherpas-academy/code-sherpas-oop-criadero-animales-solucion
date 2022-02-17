package sample.updatedog

import sample.extractBooleanAt
import sample.extractFieldAt
import sample.extractFields
import sample.extractNullableIntAt

fun handleUpdateDogOption() {
    println("Por favor, introduce el identificador del perro:")
    val id: Int = readLine()?.toInt() ?: return
    println("Por favor, introduce los nuevos datos del perro, Por ejemplo:")
    println("\tname=Teddy breed=Yorkshire birthdate=2020-03-05 father=23 mother= tame=true")
    buildUpdateDogCommand(id)?.let { updateDog(it) }
}

private fun buildUpdateDogCommand(id: Int): UpdateDogCommand? {
    val fields: List<String> = extractFields() ?: return null

    val name: String = fields.extractFieldAt(0)
    val breed: String = fields.extractFieldAt(1)
    val birthdate: String = fields.extractFieldAt(2)
    val fatherId: Int? = fields.extractNullableIntAt(3)
    val motherId: Int? = fields.extractNullableIntAt(4)
    val tame: Boolean = fields.extractBooleanAt(5)

    return UpdateDogCommand(id, name, breed, birthdate, fatherId, motherId, tame)
}