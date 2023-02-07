//Write a program you have to make a summation of first and last Digit.(E.g. 1234 ans:-5)


class `sum first&last`
{
    fun first_last()
    {
        println("enter your number")
        var num = readLine()!!.toInt()
        var las = num %10
        var i=0
        while(num!=0)
        {
             i = num %10
            num/=10
        }
        var y= i+las
        println("your first and last digit sum is : $y")
    }
}
fun main()
{
    var t= `sum first&last`()
    t.first_last()
}