import java.util.Scanner

fun main()
{
    val scanner = Scanner(System.`in`)

    val a = scanner.nextInt()
    val b = scanner.nextInt()

    val c = a + b
    println("Sum of two number is $c")

    val numbersArray = Array(5) { i -> i * 2 }

    numbersArray.forEach {
        println(it)
    }

}