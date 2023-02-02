class newvalue {

    var n = IntArray(10)
    fun getdata() {

        for (i in 0..9) {
            println("enter your array element $i :")
            n[i] = readLine()!!.toInt()
        }
    }

    fun new() {
        println("your array size is :" + n.size)
        println("enter position for add new value :")
        var j = readLine()!!.toInt()
        println("enter new value :")
        n[j] = readLine()!!.toInt()
        println("in array updated value is :" + n[j])
    }

    fun putdata() {

        for (i in 0..9) {
            println(" your array element $i :" + n[i])
        }
    }
}
fun main()
    {
        var t= newvalue()
        t.getdata()
        t.new()
        t.putdata()
    }



