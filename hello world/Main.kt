import kotlin.random.Random

fun main(args: Array<String>) {
    val calculator = Calculator(
        a = 10,
        b = 2
    )

    val sum =calculator.sum()
    val subs = calculator.subtraction()
    val multiplication = calculator.multiplication()
    val division = calculator.division()

    println(multiplication)
    println(subs)
    println(division)
    println(sum)

    val personList = arrayListOf<Person>()
    repeat(100){
        personList.add(
            Person(
                name = "Person - $it",
                age = Random.nextInt(100),
                city = "Almaty"
            )
        )
    }
    personList.filter{it.age > 95}
    print(personList)
}