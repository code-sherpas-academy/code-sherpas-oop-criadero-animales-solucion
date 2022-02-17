package sample

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
        val father: Dog? = fatherId?.let { DogRepository.get(it) }
        val mother: Dog? = motherId?.let { DogRepository.get(it) }

        Dog(
            id = IdGenerator.nextId(),
            name = name,
            breed = breed,
            birthdate = birthdate,
            father = father,
            mother = mother,
            tame = tame
        ).let { dog -> DogRepository.createOrUpdate(dog) }
    }
}
