package sample

fun createDog(
    name: String,
    breed: String,
    birthdate: String,
    fatherId: Int?,
    motherId: Int?
) {
    val father: Dog? = fatherId?.let { DogRepository.get(it) }
    val mother: Dog? = motherId?.let { DogRepository.get(it) }

    Dog(
        id = IdGenerator.nextId(),
        name = name,
        breed = breed,
        birthdate = birthdate,
        father = father,
        mother = mother
    ).let { dog -> DogRepository.create(dog) }
}
