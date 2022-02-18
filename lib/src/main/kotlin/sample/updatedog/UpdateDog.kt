package sample.updatedog

import sample.Dog
import sample.AnimalRepository

data class UpdateDogCommand(
    val id: Int,
    val name: String,
    val breed: String,
    val birthdate: String,
    val fatherId: Int?,
    val motherId: Int?,
    val tame: Boolean
)

fun updateDog(updateDogCommand: UpdateDogCommand) {
    with(updateDogCommand) {
        val father: Dog? = fatherId?.let { AnimalRepository.get(it) as Dog }
        val mother: Dog? = motherId?.let { AnimalRepository.get(it) as Dog }

        val dog = (AnimalRepository.get(id) as Dog)
        dog.update(
            name = name,
            breed = breed,
            birthdate = birthdate,
            father = father,
            mother = mother,
            tame = tame
        )

        AnimalRepository.createOrUpdate(dog)
    }
}