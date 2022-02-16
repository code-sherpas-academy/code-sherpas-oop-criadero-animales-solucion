package sample

object IdGenerator {
    private var nextId: Int = 0
    fun nextId(): Int = nextId.also { nextId++ }
}