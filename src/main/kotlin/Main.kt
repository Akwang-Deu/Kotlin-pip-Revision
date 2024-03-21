fun main() {
    println(greeting("Akwang"))
    println(areaOfCircle(3.13,14))
    println(printDetails("Joy", 40, "Kenya"))
    println(addition(50,100))
    println(myAge(20))
    println(sentence("Akwang", 21))
    nameArray("Akwang","Nataly","Ivy", "Mercy")
    cities(arrayOf("harare","mumbai","dodoma","jakarta"))
    names("Akwang","Null","Hope")
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
// How old will you be next year if you are now 20yrs//
fun myAge(age:Int) {
    var a = 20
    a++
    println("a:$a")
}
//correction//
fun sentence(x:String,y:Int):String{
    return "Hi, my name is $x and I am $y years old"

}
//Arrays//
fun nameArray(name1:String,name2:String,name3:String,name4:String){
    println(arrayOf(name1,name2,name3,name4).contentToString())
}
fun cities(cities:Array<String>){
    cities.forEachIndexed{index , a->
        if (index in arrayOf(0,1,2,3))
            println(a.capitalize())
    }
}
fun names(nam1:String,nam2:String,nam3:String):Array<String>{
    var y = arrayOf(nam1,nam2,nam3)
    return y
}


