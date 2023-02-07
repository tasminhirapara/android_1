//Write a program make a summation of given number(E.g. 1523 ans :-11)
class summationnum
{

    fun sum()
    {
        println("enter your number : ")
        var num = readLine()!!.toInt()
        var t=0
        while(num!=0)
        {
            var i = num%10
            num/=10
            t+=i
        }
        println("the reverse number is = $t")
    }
}
 fun main()
 {
     var t=summationnum()
     t.sum()
 }