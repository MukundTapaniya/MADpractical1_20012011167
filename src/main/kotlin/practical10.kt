class Car(var typ:String, var model:String, var price: Long, var name: String) {
    init {
        println("All the information adding inside: ")
        println("Type: $typ\nmodel: $model\nname:$name\nprice: $price")
    }
    fun getPrice() {
        println("Car price: $price")
    }
}

fun main() {
    println("Enter the car type: ")
    var typ = readLine()!!.toString()
    println("Enter the car model name: ")
    var model = readLine()!!.toString()
    println("Enter the car price: ")
    var price = readLine()!!.toLong()
    println("Enter the car's owner name: ")
    var name = readLine()!!.toString()
    var c = Car(typ, model, price, name)
    c.getPrice()
}