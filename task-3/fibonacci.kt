
//Write a program you have to print the Fibonacci series up to user givennumber
class fibonacci
{
    fun fibo()
    {
        println("enter your number :")
        var a = readLine()!!.toInt()
        var t1=0
        var t2=1
        var sum=0
        println("your fibonacci series is :")
        for (i in 1..a)
        {
            println(t1)
            sum =t1+t2
            t1=t2
            t2=sum
        }
    }
}
fun main()
{
    var h =fibonacci()
    h.fibo()


}