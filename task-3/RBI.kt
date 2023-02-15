
class cusotmer
{
     fun cusotmer(name : String, id :Int, age: Int,acc_no : String) {
        println("your name : $name")
         println("your account no is: $acc_no")
        println("your id is  : $id")
        println("ypur age : $age")

    }
}
class account
{
     fun account(type: String,branch :String)
    {
        println("ypur account type is : $type")
        println("your account no is: $branch")

    }
}
var balance= 0.00
 open class RBI() {

     fun printinfo() {
         println("enter your balance :")
         balance = readLine()!!.toDouble()
     }
 }

class SBI : RBI()
{
    fun sbi()
    {
        println("according your balance SBI receive yor application")
        println("according to RBI , SBI bank interest rate : 5%")
        println("accordig 4% interest yor balance : " )
        var d=(balance*5)/100
        balance= balance+d
        print(balance)
    }

}
class icici :RBI()
{
    fun icici()
    {
        println("according your balance ICICI receive yor application")
        println("according to RBI , ICICI bank interest rate : 8%")
        println("accordig 8% interest yor balance : " )
        var d=(balance*8)/100
        balance= balance+d
        print(balance)

    }
}
class pnb:RBI()
{
    fun pnb()
    {
        println("according your balance PNB receive yor application")
        println("according to RBI , PNB bank interest rate : 9%")
        println("accordig 9% interest yor balance : " )
        var d=(balance*9)/100
        balance= balance+d
        print(balance)

    }
}




fun main()
{
    var c = cusotmer()
    var a = account()
    var r = RBI()
    c.cusotmer("tasmin",1,18,"421452gh653")
    a.account("saviing","17272728")
    r.printinfo()

   if (10000<=balance && balance>=30000)
   {
    r =SBI()
    r.sbi()
   }
    else if (31000<=balance && balance>=75000)
   {
       r =icici()
       r.icici()

   }
   else if (76000<=balance && balance>=100000)
   {
       r =pnb()
       r.pnb()
   }
}