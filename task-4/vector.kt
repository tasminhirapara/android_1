import java.util.Vector

class vector
{
    fun vec() {
        var v = Vector<String>(5)
        v.add("a")
        v.add("a")
        v.add("a")
        v.add("a")
        v.add("a")
        v.add("a")
        v.add("a")
        println("capacity : " + v.capacity())
        println("size :" + v.size)
        if (v.contains("a")) {
            println("yes")
        } else {
            println("no")

        }
       println(v.firstElement())
        println(v.lastElement())
    }
}


fun main()
{
    var v1 = vector()
    v1.vec()
}