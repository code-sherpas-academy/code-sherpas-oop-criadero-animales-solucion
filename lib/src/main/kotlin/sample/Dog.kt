package sample

class Dog(
    id: Int,
    name: String,
    breed: String,
    birthdate: String,
    var father: Dog?,
    var mother: Dog?,
    var tame: Boolean
) : Animal(id, name, breed, birthdate) {
    fun update(name: String, breed: String, birthdate: String, father: Dog?, mother: Dog?, tame: Boolean) {
        super.update(name = name, breed = breed, birthdate = birthdate)
        this.father = father
        this.mother = mother
        this.tame = tame
    }

    override fun vaccinate() {
        if (breed == "Yorkshire") vaccinated = true
    }
}
