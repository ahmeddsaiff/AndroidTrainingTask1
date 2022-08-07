import java.util.Scanner

fun main(args: Array<String>) {
    val sc=Scanner(System.`in`)
    println("Adding two numbers")
    println("enter the first number")
    val x=sc.nextFloat()
    println("enter the second number")
    val y=sc.nextFloat()
    val sum = x+y
    println("the sum is $sum")
}