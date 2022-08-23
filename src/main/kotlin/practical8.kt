import java.util.*

fun main() {
    println("deepToString method: ")
    val arr = arrayOf(intArrayOf(1, 2), intArrayOf(3, 4), intArrayOf(5, 6, 7))
    println(Arrays.deepToString(arr))

    println("contentDeepToString method: ")
    println(arr.contentDeepToString())

    println("jointostring method:")
    val num = arrayOf(1, 2, 3)
    println(num.joinToString(":"))

    println("For loops: Range, downTo and until")
    for (i in 1..5)
        print(" " + i)
    println()
    for (i in 5 downTo 1)
        print(" " + i)
    println()
    for (i in 1 until 5)
        print(" " + i)
    println()
    val a = arrayOf(10, 20, 30)
    for (i in a)
        print(" " + i)
    println()

    println("Sort the array using in-built method and without in-built method:")
    val array1 = arrayOf(2, 0, 90, 12, 43, 11, 4, 1)
    array1.sort()
    print(Arrays.toString(array1))
    println()

    val array2 = arrayOf(10, 9, 8, 7, 6, 5, 4, 3, 2, 1)
    var temp:Int
    for (i in array2.indices) {
        for (j in i+1 until array2.size) {
            if (array2[i] > array2[j]) {
                temp = array2[i]
                array2[i] = array2[j]
                array2[j] = temp
            }
        }
    }
    for (i in array2) {
        print(" " + i)
    }
}