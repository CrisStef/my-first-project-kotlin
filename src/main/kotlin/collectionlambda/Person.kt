package collectionlambda

data class Person(val name: String, val age: Int) {

    companion object {
        fun data() : List<Person> {
            return listOf(
                Person("Pedro", 25),
                Person("Manuel", 17),
                Person("Lucas", 26),
                Person("Cris", 30),
                Person("Katniss", 38),
                Person("Maria", 35),
            )
        }
    }
}