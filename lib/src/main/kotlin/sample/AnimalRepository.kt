package sample

import java.util.Hashtable

object AnimalRepository {
    private val HASHTABLE: Hashtable<Int, Animal> = Hashtable()

    fun get(id: Int): Animal {
        return HASHTABLE[id] ?: throw AnimalNotFoundException(id)
    }

    fun createOrUpdate(animal: Animal): Animal? = HASHTABLE.put(animal.id, animal)
    fun getAll(): List<Animal> = HASHTABLE.values.toList()
}