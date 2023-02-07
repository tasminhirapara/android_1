
//write a program you have to print the table of given number.

class table
{
    fun table()
    {
        println("enter your table number :")
        var num= readLine()!!.toInt()
        println("your table :")
        var t=1
        for(i in 1..10)
        {
            t=num*i
            println( " $num *"  +  i + "=" + t)
        }
    }
}

fun main()
{
    var f=table()
    f.table()
}