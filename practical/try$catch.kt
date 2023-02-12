import java.lang.ArithmeticException

fun main(args : Array<String>) {
    try {
        var a: Int = args.size
        println("a : " + a)
        var b: Int = 10 / a
        var c: IntArray = intArrayOf(1)
        c[10] = 100;
    }
    catch (e: Exception) {
        when (e) {
            is ArithmeticException -> println("divide by zeo : " + e)
          is ArrayIndexOutOfBoundsException -> println("Array Index : " + e)
        }
    }
    finally {
        println("Always executed ")
    }
}
