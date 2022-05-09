package Recursion

import scala.annotation.tailrec

object Recursion extends App {

  def factorial(n: Int): Int = {
    if (n <= 1) 1
    else n * factorial(n - 1)
  }

  def someMoreRecursion(n: Int): Int = {
    if (n <= 1) 1
    else {
      println("n->" + n + " n-1->" + (n - 1))
      val res = n * factorial(n - 1)
      println(n)
      res
    }
  }

  println(someMoreRecursion(10))


  def betterFactorial(n: Int): BigInt = {
    @tailrec
    def factHelper(x: Int, accumulator: BigInt): BigInt = {
      if (x <= 1) accumulator
      else factHelper(x - 1, x * accumulator) //tail recursion  .use recursive call as last expression
    }

    factHelper(n, 1)
  }

  println(betterFactorial(500))

  //use tail rec for loops

  def printNTimes(myString: String, n: Int, accumulator: String): String =

    if (n <= 0) accumulator
    else printNTimes(myString, n - 1, myString + accumulator)


  println(printNTimes("Nice", 5, ""))

  def isPrime(n: Int): Boolean ={
    def isPrimeTailRec(t: Int, isStillPrime: Boolean): Boolean = {
      if (!isStillPrime) false
      else if (t <= 1) true
      else isPrimeTailRec(t - 1, n % t != 0 && isStillPrime)
    }

      isPrimeTailRec(n / 2, true)
  }

  println(isPrime(19))
  println(isPrime(69))

  def fibonacci (n: Int):Int = {
    def fibonTailRec(i: Int, last: Int, nextToLast:Int):Int = {
      if( i >= n) last
      else fibonTailRec(i+1, last + nextToLast, last)
    }
    if ( n <= 2)1
    else fibonTailRec(2, 1,1)
  }
  println(fibonacci(8))
}
//every call uses the stack frame