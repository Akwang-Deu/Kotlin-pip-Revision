fun main() {
    println(greeting("Akwang"))
    println(areaOfCircle(3.13,14))
    println(printDetails("Joy", 40, "Kenya"))
    println(addition(50,100))
}
fun greeting(name:String):String{
    var message="Hello $name, I hope you are doing well"
    return message

}
fun areaOfCircle(pi:Double,radius:Int):Double{
    var area=(pi*radius*radius)
    return area
}
fun printDetails(name:String, age:Int,city:String){
    println("name:$name")
    println("age:$age")
    println("city:$city")
}
fun addition(num1:Int,num2:Int):Int{
    var sum = num1 + num2
    return sum
}
