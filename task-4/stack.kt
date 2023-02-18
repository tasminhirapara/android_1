import java.util.Stack

class mystack {

    fun push(s:Stack<Int>,n : Int)
    {
        s.push(n)
        println(s)

    }
    fun pop(s:Stack<Int>)
    {
        var i :Int =s.pop()
        println(i)
        println(s)
    }
}
fun main ()
{
    var s=Stack<Int>()
    var s1 =mystack()
    s1.push(s,1)
    s1.push(s,2)
    s1.push(s,3)
    s1.push(s,4)
    s1.push(s,5)
    try {
         s1.pop(s)
        s1.pop(s)
        s1.pop(s)
        s1.pop(s)
        s1.pop(s)
        s1.pop(s)
    }
    catch (e:Exception)
    {
        println("empty stack")
    }
}
