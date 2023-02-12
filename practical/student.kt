class student {
    var sub = IntArray(5)
    var b=0
    var c=0
    fun getdata()
    {
         for( i in 0..4)
         {
             println("enter your number $i")
             sub[i] = readLine()!!.toInt()

             // sub[i]=b
             c+=sub[i]
         }
    }
    fun sum()
    {
        var per = c/5
        println("your total is : $c and your persantage is : $per %")
    }
}
fun main()
{
    var a=student()
    a.getdata()
    a.sum()
}