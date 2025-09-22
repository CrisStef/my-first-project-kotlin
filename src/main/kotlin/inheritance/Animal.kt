package inheritance

abstract class Animal(
    val color: String
) {
}

class Dog(color: String): Animal(color) {

}

class Cat(color: String): Animal(color) {

}