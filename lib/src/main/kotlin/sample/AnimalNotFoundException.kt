package sample

class AnimalNotFoundException(id: Int) : RuntimeException("Animal with id=$id not found")
