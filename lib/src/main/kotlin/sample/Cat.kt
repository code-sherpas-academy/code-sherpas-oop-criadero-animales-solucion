package sample

class Cat(
    id: Int,
    name: String,
    breed: String,
    birthdate: String,
    val father: Cat?,
    val mother: Cat?,
    val sociable: Int
): Animal(id, name, breed, birthdate)