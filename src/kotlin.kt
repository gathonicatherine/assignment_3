import java.util.*

fun main() {
name("Cate", "Talia", "Momma", "Fiona")
    cities()

    number()

    names("Wanjiku", "Gathoni", "Kethie")

}
fun name(name1: String, name2:String, name3:String, name4:String):Array<String>{
    var x = arrayOf(name1,name2,name3,name4)
    println(Arrays.toString(x))
    return x
}
fun cities(){
    var citiesArray= arrayOf("harare", "mumbai", "dodoma", "jakarta")
    var sortedNames = citiesArray.sortedArray()
    println(Arrays.toString(sortedNames))
}
fun number() {
var numbersArray = arrayOf(32,17,4,213,78,43,90,31,3,73,11,158,62)
     var total = numbersArray[1] + numbersArray[4]
println(total)

    var index = numbersArray.indexOf(158)
    println(index)

    var sortedNumbers = numbersArray.sortedArray()
    println(Arrays.toString(sortedNumbers))
}
fun names(nam1:String, nam2:String, nam3:String):Array<String>{
var a = arrayOf(nam1,nam2,nam3)
    println(Arrays.toString(a))
    return a
}