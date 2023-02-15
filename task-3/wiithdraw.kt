class wiithdraw
{
    fun amount()
    {
        var account = 2000
        println("enter your withdraw amount :")
        var a = readLine()!!.toInt()
        if (a>account)
        {
            throw ArithmeticException("Sorry, insufficient balance, you need more 500 Rs.")
        }
        else
        {
            account = account-a
            println("your account balance is : $account")
        }
    }
}
fun main()
{
    var t =wiithdraw()
    t.amount()
}