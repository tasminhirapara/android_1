
//14. Write a program to find the Max number from the given three number using Ternary Operator

class maxnumber {


    var a = 0
    var b = 0
    var c = 0
    var max = 0
    fun getdata() {
        println("enter data of a :")
        a = readLine()!!.toInt()
        println("enter data of b :")
        b = readLine()!!.toInt()
        println("enter data of c :")
        c = readLine()!!.toInt()

         max = if (a > b) (if (a > c) a else c) else if (b > c) b else c

        println("max number is : " + max)
    }
}

fun main()
{
    var t= maxnumber()
    t.getdata()

}