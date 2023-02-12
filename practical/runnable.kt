class t1 : Runnable
{
    override fun run()
    {
        for (i in 1..10)
        {
            println("thread a : $i")
        }
    }
}
class t2 : Runnable
{
    override fun run()
    {
        val d = thread()
        synchronized(d)
        {
            for (i in 1..10)
            {
                println("thread b : $i")
            }
        }
    }
}
fun main()
{
    var d = Thread( t1())
    var t= Thread(t2())
    d.start()
    t.start()
}