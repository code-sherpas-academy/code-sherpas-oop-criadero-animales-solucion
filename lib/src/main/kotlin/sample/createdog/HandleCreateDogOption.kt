package sample.createdog

import sample.extractBooleanAt
import sample.extractFieldAt
import sample.extractFields
import sample.extractNullableIntAt

fun handleCreateDogOption() {
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