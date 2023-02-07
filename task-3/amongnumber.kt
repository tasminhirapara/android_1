
//Write a program to find the Max number from the given three number using Nested If


class amongnumber {

    var a=0
    var b=0
    var c=0
    fun getdata()
    {
        println("enter data of a :")
        a= readLine()!!.toInt()
        println("enter data of b :")
        b= readLine()!!.toInt()
        println("enter data of c :")
        c= readLine()!!.toInt()


        if(a>b) {
            if (a > c) {
                println(" $a is bigger")
            }
        }
        else if (b>a)
            {
                if (b>c)
                {
                    println("$b is bigger")
                }
                else
                    {
                        println("$c is bigger")
                    }

            }

    }
}

fun main()
{
    var d=amongnumber()
    d.getdata()


}