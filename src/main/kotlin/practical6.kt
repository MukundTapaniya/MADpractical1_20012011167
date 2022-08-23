fun arithmetic(a:Int, b:Int, c:Int) {
    when(c) {
        1->{
            println("Answer: " + (a+b))
        }
        2->{
            println("Answer: " + (a - b))
        }
        3->{
            println("Answer: " + (a * b))
        }
        4->{
            println("Answer: " + (a / b))
        }
    }
}

fun main() {
    println("Enter the two values: ")
    var a = readLine()!!.toInt()
    var b = readLine()!!.toInt()
    println("1. Sum\n2. Sub\n3. Mul\n4. Div")
    var c = readLine()!!.toInt()
    arithmetic(a, b, c)
}