import kotlin.String
import kotlin.jvm.internal.Intrinsics.Kotlin
import kotlin.String as String1

class mylist
{

    fun list()
    {

        var a= ArrayList<String1>()
         a.add("tasmin")
         a.add("smit")
         a.add("jay")
         a.add("meet")
        var b=ArrayList<String1>()
        b.add("nirav")
        b.add("devam")
        b.add("dhaval")
        b.add("devanshu")
        b.add("devang")
        var c = readLine()!!.toInt()
        if (c==1)
        {
            a.addAll(b)
        }
        else if (c==2)
        {
            a.removeAll(b)
          //  a.removeAt(2)
        }
        else if(c==3)
        {
            a.retainAll(b)
        }
        var f:Iterator<String1> =a.iterator()
        while(f.hasNext())
        {
            println(f.next())
        }
        var m = mutableListOf(1,2)
        m.add(1)
        println(m)
        var l1= listOf(1,2,34)

        println(l1)

    }
}
class  myset
{
    fun set()
    {
        var s= setOf(1,2,"tasmin")
        println(s)
        var s1= mutableSetOf(1,2,3)
        s1.add(4)
        s1.add(5)
        println(s1)
        var s8= HashSet<kotlin.String>(5,50.00F)
        s8.add("tasmin")
    }

}

class myhashmap
{
    fun put()
    {
        var h = HashMap<kotlin.String,Int>()
        h.put("a",101)
        h.put("b",102)
        for(m:Map.Entry<kotlin.String,Int> in h.entries)
        {
            println(m.key)
            println((m.value))
        }
    }
}
class mymap
{
    fun map()
    {
        var d = mapOf<kotlin.String,Int>("a" to 1)
        var m  =  mutableMapOf("a" to 1)
        m.put("b",2)
        println(m.get("b"))


    }
}

fun  main()
{
    var l=mylist()
    l.list()
    var d =myset()
        d.set()
    var b = myhashmap()
    b.put()
  var m = mymap()
    m.map()

}
