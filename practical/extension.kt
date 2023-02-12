class extension
{
    fun add(a:Int,b:Int) : Int
    {
        return  a+b
    }
}

fun main()
{
    var h=extension()
    println("your addition is:" + h.add(4,5))
    println("your substrection :" + h.substrec(7,8))

}

fun extension.substrec(a:Int,b:Int) :Int
{
    return a-b
}