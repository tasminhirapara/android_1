
//Write a program to print the 1 to 10 using For loop.
//b. Write a Program to print the 51 to 60 using while loop
//c. write a program to print the 100 to 81 using do....while loop



class printloops
{
    fun forin()
   {
       println("*********** for in loop **********")
       for(i in 1..10)
       {
           println(i)
       }

   }

    fun  whileloop()
    {
        var j=51
        println("*********** while loop *********")
        while(j<=60)
        {
            println(j)
            j++
        }
    }
    fun  dowhile()
    {
        var t=100
       println("********* do while loop ********** ")
       do {

           println(t)
           t--
       } while(t>=81)

    }
}

fun main()
{
    var h = printloops()
    h.forin()
    h.whileloop()
    h.dowhile()

}