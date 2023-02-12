fun main()
{
    println("enter your choice : ")
    var a= readLine()!!.toInt()

    when(a)
    {
        1 -> println("one")
        2 -> println("two")
        3 -> println("three")
        4 -> println("four")
        5 -> println("five")
        6 -> println("six")
    }
}