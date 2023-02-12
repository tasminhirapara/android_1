import java.io.FileOutputStream
import java.io.ObjectInputStream
import java.io.ObjectOutput
import java.io.ObjectOutputStream

class SerializableEx
{
    fun n1()
    {
        var d = s1("tasmin",123)
        var f = FileOutputStream("E://tasmin.txt")
        var w= ObjectOutputStream(f)
        w.writeObject(d)
        println("success")
    }


}
fun main()
{
    var t=SerializableEx()
    t.n1()
}