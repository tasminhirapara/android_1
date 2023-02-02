class checkarray
{
    var phone = IntArray(5)

    fun getdata()
    {
        phone[0] = 40
        phone[1] = 50
        phone[2] = 60
        phone[3] = 70
        phone[4] = 0
    }
    fun check()
    {
        println("check for array empty")
        for(i in 0..4)
        {
            if(phone[i] == 0)
            {
                println("array is empty")
            }
            else
            {
                println(phone[i])
            }
        }
    }
}

fun main()
{
    var r = checkarray()
    r.getdata()
    r.check()

}