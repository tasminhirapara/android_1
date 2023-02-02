class findelement
{
    var a=IntArray(10)
    fun getdata() {

        for (i in 0..9) {
            println("enter your array element $i :")
            a[i] = readLine()!!.toInt()

        }
    }
        fun find()
        {
            println("your array size is : " + a.size)
            println("enter your array position :")
            var j = readLine()!!.toInt()
            println("your data is :" + a[j])
        }
}

fun main()
{
    var c=findelement()
    c.getdata()
    c.find()
}