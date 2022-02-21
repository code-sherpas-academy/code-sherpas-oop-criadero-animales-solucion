package sample

class Cat(
    id: Int,
    name: String,
    breed: String,
    birthdate: String,
    var father: Cat?,
    var mother: Cat?,
    var sociable: Int
) : Animal(id, name, breed, birthdate) {
    fun update(name: String, breed: String, birthdate: String, father: Cat?, mother: Cat?, sociable: Int) {
        super.update(name = name, breed = breed, birthdate = birthdate)
        this.father = father
        this.mother = mother
        this.sociable = sociable
    }

    override fun vaccinate() {
        if (breed == "Siamese") vaccinated = true
    }
}