fun main(args: Array<String>) {
    val number = 6
    val factorial = fact(number)
    println("Factorial of $number is: $factorial")
}

tailrec fun fact(n: Int, temp: Int = 1): Int {
    return if (n == 1){
        temp
    } else {
        fact(n-1, temp*n)
    }
}