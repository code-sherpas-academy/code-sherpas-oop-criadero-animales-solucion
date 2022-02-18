package sample.createcat

import sample.extractFieldAt
import sample.extractFields
import sample.extractIntAt
import sample.extractNullableIntAt

fun handleCreateCatOption() {
    println("Introduce los campos del gato. Por ejemplo:")
    println("\tname=Garfield breed=Siamese birthdate=2020-03-05 father= mother=17 sociable=3")
    buildCreateCatCommand()?.let { createCat(it) }
}

private fun buildCreateCatCommand(): CreateCatCommand? {
    val fields: List<String> = extractFields() ?: return null

    val name: String = fields.extractFieldAt(0)
    val breed: String = fields.extractFieldAt(1)
    val birthdate: String = fields.extractFieldAt(2)
    val fatherId: Int? = fields.extractNullableIntAt(3)
    val motherId: Int? = fields.extractNullableIntAt(4)
    val sociable: Int = fields.extractIntAt(5)

    return CreateCatCommand(name, breed, birthdate, fatherId, motherId, sociable)
}