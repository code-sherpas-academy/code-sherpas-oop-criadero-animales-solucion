package sample.updatecat

import sample.AnimalRepository
import sample.Cat

data class UpdateCatCommand(
    val id: Int,
    val name: String,
    val breed: String,
    val birthdate: String,
    val fatherId: Int?,
    val motherId: Int?,
    val sociable: Int
)

fun updateCat(updateCatCommand: UpdateCatCommand) {
    with(updateCatCommand) {
        val father: Cat? = fatherId?.let { AnimalRepository.get(it) as Cat }
        val mother: Cat? = motherId?.let { AnimalRepository.get(it) as Cat }

        val cat = (AnimalRepository.get(id) as Cat)
        cat.update(
            name = name,
            breed = breed,
            birthdate = birthdate,
            father = father,
            mother = mother,
            sociable = sociable
        )

        AnimalRepository.createOrUpdate(cat)
    }
}