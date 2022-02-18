package sample

class Dog(
    id: Int,
    name: String,
    breed: String,
    birthdate: String,
    val father: Dog?,
    val mother: Dog?,
    val tame: Boolean
): Animal(id, name, breed, birthdate) {
    fun update(name: String, breed: String, birthdate: String, father: Dog?, mother: Dog?, tame: Boolean): Dog =
        Dog(id = id, name = name, breed = breed, birthdate = birthdate, father = father, mother = mother, tame = tame)
}
