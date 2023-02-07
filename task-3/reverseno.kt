//Write a program to print the number in reverse order

class reverseno
{
    fun reverse()
    {
        println("enter your number : ")
        var num = readLine()!!.toInt()
         var t=0
        while(num!=0)
        {
            var i = num%10
            t = t*10+i
            num/=10
        }
        println("the reverse number is = $")
    }
}

fun main()
{
    var u=reverseno()
    u.reverse()
}