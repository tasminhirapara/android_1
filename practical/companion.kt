class companion
{
    companion object
    {
        fun n1(a: Int,b:Int) :Int
        {
            return a+b

        }
        fun n2(c:Double,d:Double) : Double
        {
            return c-d
        }
    }
}
fun main()
{
    println(companion.n1(2,3))
    println(companion.n2(2.00,4.00))

}