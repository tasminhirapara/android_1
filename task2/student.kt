class student {
    var sub1=1
    var sub2=1
    var sub3=1
    var sub4=1
    var sub5=1

    fun getdata()
    {
        println("enter your subject 1 marks")
        sub1= readLine()!!.toInt()
        println("enter your subject 2 marks")
        sub2= readLine()!!.toInt()
        println("enter your subject 3 marks")
        sub3= readLine()!!.toInt()
        println("enter your subject 4 marks")
        sub4= readLine()!!.toInt()
        println("enter your subject 5 marks")
        sub5= readLine()!!.toInt()
    }
    fun sum()
    {
        var sub= sub1+sub2+sub3+sub4+sub5
        var per= sub/5
        println("your total is : $sub and your persantage is : $per")



    }

}
fun main()
{
    var a=student()
    a.getdata()
    a.sum()
}