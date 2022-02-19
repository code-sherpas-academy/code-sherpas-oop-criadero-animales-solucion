package sample

abstract class Animal(
    val id: Int,
    var name: String,
    var breed: String,
    var birthdate: String
) {
    protected fun update(name: String, breed: String, birthdate: String) {
        this.name = name
        this.breed = breed
        this.birthdate = birthdate
    }
}
