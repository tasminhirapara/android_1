//Write a Program to check the given number is prime or not prime.
fun main(){

    println(" enter your number : ")
    var a= readLine()!!.toInt()
    var prime=0
    for(i in 2 until a)
    {
         if( a % i == 0)
         {
             prime=1
             break
         }
    }
  if(prime==1)
  {
      println("your number is not prime")
  }
    else
  {
      println("your number is prime : $a")
  }

}