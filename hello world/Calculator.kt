class Calculator(
    val a: Int,
    val b: Int
) {
    fun sum() = a + b
    fun subtraction() = a - b
    fun multiplication() = a * b
    fun division(): Double {
        if(b == 0){
            throw Exception("division by zero")
        }
        return a.toDouble() / b;
    }
    fun power() = Math.pow(a.toDouble(), b.toDouble())
}