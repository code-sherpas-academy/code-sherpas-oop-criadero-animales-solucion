package sample

fun List<String>.extractNullableIntAt(position: Int): Int? = extractNullableFieldAt(position)?.toInt()

fun List<String>.extractFieldAt(position: Int): String = this[position].split("=")[1]

private fun List<String>.extractNullableFieldAt(position: Int): String? =
    this.extractFieldAt(position).let { it.ifEmpty { null } }

fun extractFields(): List<String>? = readLine()?.split(" ")

fun List<String>.extractBooleanAt(position: Int): Boolean = this.extractFieldAt(position).toBoolean()