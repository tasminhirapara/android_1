import java.io.Serializable
 class s1(var name : String, var id : Int) : Serializable
{
    fun data ()
    {
        println("your name is : $name")
        println("your id is : $id")

    }
}
