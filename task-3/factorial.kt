//.write a program you have to find the factorial of given number.

class factorial
{
  fun factorial()
  {
      println("enter number =")
      var num = readLine()!!.toInt()
      var fact=1
      for ( i in 1..num)
      {
          fact =fact *i
      }
      println("factorial of $num = $fact")
  }

}
fun main()
{
    var u =factorial()
     u.factorial()
}