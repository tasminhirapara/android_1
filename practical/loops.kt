



fun main()
{
    println("down to up")
    for(i in  10 downTo 1)
    {
        println(i)
    }
   println(" 1 to 10 print")
    for(i in  1..10)
    {
        println(i)
    }
    println(" 1 to 4 and 5 not include")
    for(i in  1 until 5)
    {
        println(i)
    }
    println("while loop")
    var i=0
    while( i<10)
    {
        i++
        println(i)
    }
    println(" do while loop")
    do{

        i++
        println(i)
    }while(i<5)



}