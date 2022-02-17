package sample

fun createDog() {
    val fields: List<String> = extractFields() ?: return

    val name: String = fields.extractFieldAt(0)
    val breed: String = fields.extractFieldAt(1)
    val birthdate: String = fields.extractFieldAt(2)
    val fatherId: Int? = fields.extractNullableIntAt(3)
    val motherId: Int? = fields.extractNullableIntAt(4)
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

private fun List<String>.extractNullableIntAt(position: Int): Int? = extractNullableFieldAt(position)?.toInt()

private fun List<String>.extractFieldAt(position: Int): String = this[position].split("=")[1]

private fun List<String>.extractNullableFieldAt(position: Int): String? =
    this.extractFieldAt(position).let { it.ifEmpty { null } }

private fun extractFields(): List<String>? = readLine()?.split(" ")