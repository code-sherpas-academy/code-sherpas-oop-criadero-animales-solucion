package sample

class Dog(
    val id: Int,
    val name: String,
    val breed: String,
    val birthdate: String,
    val father: Dog?,
    val mother: Dog?,
    val tame: Boolean
)
