fun main()
{
    tasmin() //calling function name and parentheses
    println(" main function")
    var total=add()
    println(total)
    var min = sub(x=4,y=5)
    println(min)
}

fun tasmin()
{
    println("function tasmin")
}
fun add() : Int {

     var a=5
     var b=6
    return (a+b)
}
fun sub( x: Int,y : Int) : Int {
    return (x-y)

}