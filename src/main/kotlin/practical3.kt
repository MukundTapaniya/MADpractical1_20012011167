fun main() {
    print("Enter student Enrollment Number: ")
    val x = readLine()!!.toLong()


    print("Student Name: ")
    val s1 = readLine()!!.toString()


    print("Student class: ")
    val s2 = readLine()!!


    print("Student branch: ")
    val s3 = readLine()!!

    print("Student college name: ")
    val s4 = readLine()!!

    print("Student University Name: ")
    var s5 = readLine()!!

    print("Student Age: ")
    var age = readLine()!!.toInt()

    println("**************************************\n")

    println("Student Information\n")
    println("Enrollment Number:$x")
    println("Name:$s1")
    println("Class:$s2")
    println("Branch:$s3")
    println("college Namea:$s4")
    println("University name:$s5")
    println("Age:$age")
}