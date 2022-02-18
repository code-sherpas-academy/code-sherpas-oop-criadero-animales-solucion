package sample

class Dog(
    id: Int,
    name: String,
    breed: String,
    birthdate: String,
    var father: Dog?,
    var mother: Dog?,
    var tame: Boolean
): Animal(id, name, breed, birthdate) {
    fun update(name: String, breed: String, birthdate: String, father: Dog?, mother: Dog?, tame: Boolean) {
        this.name = name
        this.breed = breed
        this.birthdate = birthdate
        this.father = father
        this.mother = mother
        this.tame = tame
    }
}
