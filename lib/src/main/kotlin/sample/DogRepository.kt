package sample

import java.util.Hashtable

object DogRepository {
    private val HASHTABLE: Hashtable<Int, Dog> = Hashtable()

    fun get(id: Int): Dog {
        return HASHTABLE[id] ?: throw DogNotFoundException(id)
    }

    fun create(dog: Dog): Dog? = HASHTABLE.put(dog.id, dog)
    fun getAll(): List<Dog> = HASHTABLE.values.toList()
}