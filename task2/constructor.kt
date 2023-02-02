import kotlin.toString as toString

class `constructor` {
    var name=""
    var email=""

    fun getdata()
    {
        println("enter your name")
        name = readlnOrNull()!!.toString()
        println("enter your email")
        email = readLine()!!.toString()
    }

    fun display()
{
    println("your name is $name")
    println("your email is $email")
}

}


fun main()
{
    var a= constructor()
    a.getdata()
    a.display()


}