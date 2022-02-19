package sample

class Cat(
    id: Int,
    name: String,
    breed: String,
    birthdate: String,
    var father: Cat?,
    var mother: Cat?,
    var sociable: Int
): Animal(id, name, breed, birthdate) {
    fun update(name: String, breed: String, birthdate: String, father: Cat?, mother: Cat?, sociable: Int) {
        this.name = name
        this.breed = breed
        this.birthdate = birthdate
        this.father = father
        this.mother = mother
        this.sociable = sociable
    }
}