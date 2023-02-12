fun main()
{
    val phone= arrayOf( "vivo","one pluse","oppo","relme")
    println(phone[3])
    println(phone.size)
    for ( i in phone)
    {
        println(i)
    }
    for ( i in 0..3)
    {
        println(phone[i])
    }
    var a= IntArray(7)
    for (i in 0..6)
    {
        println("enter your number $i")
        a[i]= readLine()!!.toInt()
        println(a[i])
    }
}