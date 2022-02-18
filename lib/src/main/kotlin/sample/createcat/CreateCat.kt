package sample.createcat

import sample.AnimalRepository
import sample.Cat
import sample.IdGenerator

data class CreateCatCommand(
    val name: String,
    val breed: String,
    val birthdate: String,
    val fatherId: Int?,
    val motherId: Int?,
    val sociable: Int
)

fun createCat(createCatCommand: CreateCatCommand) {
    with(createCatCommand) {
        val father: Cat? = fatherId?.let { AnimalRepository.get(it) as Cat }
        val mother: Cat? = motherId?.let { AnimalRepository.get(it) as Cat }

        Cat(
            id = IdGenerator.nextId(),
            name = name,
            breed = breed,
            birthdate = birthdate,
            father = father,
            mother = mother,
            sociable = sociable
        ).let { cat -> AnimalRepository.createOrUpdate(cat) }
    }
}
