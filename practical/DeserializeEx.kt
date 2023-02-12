import java.io.FileInputStream
import java.io.ObjectInputStream

class DeserializeEx
{
    fun n2()
    {
        var u=ObjectInputStream(FileInputStream("E://tasmin.txt"))
        var s : s1 = u.readObject() as s1
        println(s.name)
        println(s.id)
    }

}
fun main()
{
    var h =DeserializeEx()
    h.n2()
}