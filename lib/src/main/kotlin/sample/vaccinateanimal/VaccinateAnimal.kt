package sample.vaccinateanimal

import sample.AnimalRepository

fun vaccinateAnimal(id: Int) {
    val animal = AnimalRepository.get(id)

    animal.vaccinate()

    AnimalRepository.createOrUpdate(animal)
}