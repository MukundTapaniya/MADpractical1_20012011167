fun main() {
    println("Enter the number of month: ")
    val x = readLine()!!.toInt()

    when (x) {
        1->{
            print("January")
        }
        2->{
            print("February")
        }
        3->{
            print("March")
        }
        4->{
            print("April")
        }
        5->{
            print("May")
        }
        6->{
            print("June")
        }
        7->{
            print("July")
        }
        8->{
            print("August")
        }
        9->{
            print("September")
        }
        10->{
            print("Octomber")
        }
        11->{
            print("November")
        }
        12->{
            print("December")
        }
        else->{
            print("Invalid value")
        }
    }
}