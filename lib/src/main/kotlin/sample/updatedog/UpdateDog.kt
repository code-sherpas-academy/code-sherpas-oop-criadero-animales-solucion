package sample.updatedog

import sample.Dog
import sample.DogRepository

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
        val father: Dog? = fatherId?.let { DogRepository.get(it) }
        val mother: Dog? = motherId?.let { DogRepository.get(it) }

        val dogUpdated = DogRepository.get(id).update(
            name = name,
            breed = breed,
            birthdate = birthdate,
            father = father,
            mother = mother,
            tame = tame
        )

        DogRepository.createOrUpdate(dogUpdated)
    }
}