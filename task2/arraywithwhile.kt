class arraywithwhile
{
     var a = IntArray(7)
     var i =0
    var j=0
  fun getdata() {
      while (i<=6) {
          println("enter your data $i")
          a[i] = readLine()!!.toInt()
          i++
      }
  }
    fun display() {
        while (j<=6)
        {
            println(" your data $j :" )
            print(a[j])
            j++
        }
    }
}

 fun main()
 {
     var g = arraywithwhile()
         g.getdata()
         g.display()
 }