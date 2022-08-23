fun main() {
    println("Enter the number")
    val x = readLine()!!.toInt()

    if (x % 2 == 0)
        println("$x is even number")
    else
        println("$x is odd number")
}