package inheritance

fun main() {
    val dog = Dog("Preto")
    val cat = Cat("Rajado")
    val animal: Animal = cat

    println(dog is Animal)
    println(cat is Cat)
    println(animal is Cat)
    println(animal is Animal)

    val pet1 = Pet("Katniss", 2)
    val pet2 = pet1.copy(age = 5)

    println(dog.toString())
    println()
    println(pet1)
    println(pet2)
}

data class Pet(
    val name: String,
    val age: Int
)