import java.io.FileInputStream

fun main()
{
    var r = FileInputStream("E://tasmin1.txt")
    var s : ByteArray = ByteArray(r.available())
    r.read(s)
    var str : String = String(s)
    println(str)
}