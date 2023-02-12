class thread : Thread()
{

    override fun run()
    {

            for (i in 1..10)
            {
                println("thread a : $i")
     }


    }

}
class thread2 : Thread()
{

    override fun run() {
        val d = thread()
        synchronized(d)
       {
           for (i in 1..10) {
               println("thread b : $i")
           }
       }
    }

}
fun main()
{
    var d = thread()
    var t= thread2()
    d.start()
    t.start()
}