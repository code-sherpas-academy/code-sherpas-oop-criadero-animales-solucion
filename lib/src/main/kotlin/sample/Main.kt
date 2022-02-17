package sample

fun main() {
    var option: Int?
    option = readOption()

    while (option != null) {

        when (option) {
            1 -> {
                println("Introduce los campos del perro. Por ejemplo:")
                println("\tname=Teddy breed=Yorkshire birthdate=2020-03-05 father=23 mother=")
                createDog()
            }
            2 -> {
                getDogs().forEach { dog: Dog ->
                    println("Dog: id=${dog.id} name=${dog.name} father=${dog.father?.id ?: ""} mother=${dog.mother?.id ?: ""}")
                }
            }
            3 -> {
                println("Por favor, introduce el identificador del perro:")
                readLine()?.toInt()?.let { getDog(it) }
                    ?.let { dog -> println("Dog: id=${dog.id} name=${dog.name} breed=${dog.breed} birthdate=${dog.birthdate} father=${dog.father?.id ?: ""} mother=${dog.mother?.id ?: ""}") }
            }
        }

        option = readOption()
    }
}

private fun readOption(): Int? {
    printOptions()
    val nextLine: String? = readLine()
    return nextLine?.split(" ")?.get(0)?.toInt()
}

private fun printOptions() {
    println("Elija una opción:")
    println("\t1 - Crear un perro")
    println("\t2 - Ver todos los perros")
    println("\t3 - Ver los datos de un perro")
}