//.Write a program to find out the max from given number(E.g. No: -1562 Max number is 6 )

class maximum
{
    fun max()
    {
        println("enter your number : ")
        var num = readLine()!!.toInt()
        var t=0
        while(num!=0)
        {
            var i = num%10
            num/=10
            if(i>t)
            {
                t=i
            }
        }
        println("the reverse number is = $t")
    }

}
fun main()
{
    var r=maximum()
    r.max()
}