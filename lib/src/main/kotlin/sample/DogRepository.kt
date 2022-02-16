package sample

import java.util.Hashtable

object DogRepository {
    private val HASHTABLE: Hashtable<Int, Dog> = Hashtable()

    fun getOrNull(id: Int): Dog? {
        return HASHTABLE[id]
    }

    fun create(dog: Dog): Dog? = HASHTABLE.put(dog.id, dog)
}