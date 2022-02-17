package sample

class Dog(
    val id: Int,
    val name: String,
    val breed: String,
    val birthdate: String,
    val father: Dog?,
    val mother: Dog?,
    val tame: Boolean
) {
    fun update(name: String, breed: String, birthdate: String, father: Dog?, mother: Dog?, tame: Boolean): Dog =
        Dog(id = id, name = name, breed = breed, birthdate = birthdate, father = father, mother = mother, tame = tame)
}
