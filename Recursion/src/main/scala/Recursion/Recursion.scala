package Recursion

object Recursion extends App{

  def factorial(n:Int):Int={
    if(n <=1 )1
    else n * factorial(n-1)
  }

  def someMoreRecursion(n:Int):Int = {
    if(n <=1) 1
    else {
     println("n->"+n+" n-1->"+(n-1))
     val res = n * factorial(n-1)
     println(n)
      res
    }
  }

  println(someMoreRecursion(10))


  def betterFactorial(n: Int):BigInt ={
    def factHelper(x: Int, accumulator: BigInt):BigInt ={
      if ( x <= 1) accumulator
      else factHelper(x-1, x * accumulator)
    }
    factHelper(n,1)
  }

  println(betterFactorial(500))
}
//every call uses the stack frame