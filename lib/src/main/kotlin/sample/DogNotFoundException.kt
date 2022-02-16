package sample

class DogNotFoundException(id: Int) : RuntimeException("Dog with id=$id not found")
