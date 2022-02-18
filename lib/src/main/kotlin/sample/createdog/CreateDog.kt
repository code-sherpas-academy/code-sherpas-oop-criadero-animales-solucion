package sample.createdog

import sample.Dog
import sample.AnimalRepository
import sample.IdGenerator

data class CreateDogCommand(
    val name: String,
    val breed: String,
    val birthdate: String,
    val fatherId: Int?,
    val motherId: Int?,
    val tame: Boolean
)

fun createDog(createDogCommand: CreateDogCommand) {
    with(createDogCommand) {
        val father: Dog? = fatherId?.let { AnimalRepository.get(it) as Dog }
        val mother: Dog? = motherId?.let { AnimalRepository.get(it) as Dog }

        Dog(
            id = IdGenerator.nextId(),
            name = name,
            breed = breed,
            birthdate = birthdate,
            father = father,
            mother = mother,
            tame = tame
        ).let { dog -> AnimalRepository.createOrUpdate(dog) }
    }
}
