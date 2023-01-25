fun main()
{
    print("enter your P  : ")
    var P= readLine()!!.toFloat()
    print("enter your N  : ")
    var N= readLine()!!.toFloat()
    print("enter your R  : ")
    var R= readLine()!!.toFloat()
    var I=P * N * R/100
    println("simple interest is : $I ")
}