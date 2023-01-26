fun main()

{
    print("enter your subject 1 marks :" )
    var sub1 = readLine()!!.toFloat()
    print("enter your subject 2 marks :" )
    var sub2 = readLine()!!.toFloat()
    print("enter your subject 3 marks :" )
    var sub3 = readLine()!!.toFloat()
    print("enter your subject 4 marks :" )
    var sub4 = readLine()!!.toFloat()
    print("enter your subject 5 marks :" )
    var sub5 = readLine()!!.toFloat()

    var per= (sub1+sub2+sub3+sub4+sub5)*100/500
    println("youe percentage is : $per %")
}
