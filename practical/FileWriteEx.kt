import java.io.FileOutputStream

fun main()
{
    var name ="tasmin"
    var f = FileOutputStream("e://tasmin1.txt")
    f.write(name.toByteArray())
    println("success")

}