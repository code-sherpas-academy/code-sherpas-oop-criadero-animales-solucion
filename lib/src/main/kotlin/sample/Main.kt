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
}