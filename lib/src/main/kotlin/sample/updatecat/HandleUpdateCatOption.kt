package sample.updatecat

import sample.extractFieldAt
import sample.extractFields
import sample.extractIntAt
import sample.extractNullableIntAt

fun handleUpdateCatOption() {
    println("Por favor, introduce el identificador del gato:")
    val id: Int = readLine()?.toInt() ?: return
    println("Por favor, introduce los nuevos datos del gato, Por ejemplo:")
    println("\tname=Garfield breed=Siamese birthdate=2020-03-05 father= mother= sociable=3")
    buildUpdateCatCommand(id)?.let { updateCat(it) }
}

private fun buildUpdateCatCommand(id: Int): UpdateCatCommand? {
    val fields: List<String> = extractFields() ?: return null

    val name: String = fields.extractFieldAt(0)
    val breed: String = fields.extractFieldAt(1)
    val birthdate: String = fields.extractFieldAt(2)
    val fatherId: Int? = fields.extractNullableIntAt(3)
    val motherId: Int? = fields.extractNullableIntAt(4)
    val sociable: Int = fields.extractIntAt(5)

    return UpdateCatCommand(id, name, breed, birthdate, fatherId, motherId, sociable)
}