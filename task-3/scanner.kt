class scanner
{
    var a= IntArray(10)
    fun data()
    {
        for(i in 0..9)
        {
            println("enter your data element  of index $i")
            a[i]= readLine()!!.toInt()
            if (a[i]<=10000 || a[i]>=40000 )
            {
                println("your value is not valid ")
            }
            else
            {
                println("element is : " + a[i])
            }
        }

    }

}
fun main ()
{
    var y = scanner()
    y.data()
}