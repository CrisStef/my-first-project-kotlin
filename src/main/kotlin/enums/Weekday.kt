package enums

fun main() {
    val day = Weekday.MONDAY

    println(day.next().next().next())

    println(day.next().next().next().next().next().next().next())
    println(
        Weekday.getEnumDayOfWeek(5)
    )
}

enum class Weekday(val day: Int) {
    MONDAY(1),
    TUESDAY(2),
    WEDNESDAY(3),
    THURSDAY(4),
    FRIDAY(5),
    SATURDAY(6),
    SUNDAY(7);

    fun next(): Weekday {
        return Weekday
            .values()
            .find { it.day == day + 1 }
            ?: MONDAY
    }

    companion object {
        fun getEnumDayOfWeek(day: Int): Weekday {
            return Weekday
                .values()
                .first { it.day == day }
        }
    }
}