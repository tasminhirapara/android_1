fun main()
{
    println("enter your year : ")
    var y = readLine()!!.toInt()

    if(y%4==0)
    {
        println(" this year is leap year")
    }
    else
    {
        println("this year is not leap year")
    }
}