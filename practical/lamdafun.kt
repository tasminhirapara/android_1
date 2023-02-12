class lamdafun
{
    fun lamda( a: Int, b:Int,tasmin : (Int) -> Unit)
    {
        var c = a + b
        tasmin(c)
    }
}
fun main()
{
    var t=lamdafun()
//    var my : (Int) -> Unit ={s : Int -> println(s)}
//      t.lamda(5,6,my)
    var add= {a:Int,b:Int -> a+b}
    println(add(6,7))
}