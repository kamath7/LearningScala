package Functions

object Functions extends App{

  def myFunction(a: String, b: Int): String ={
      return  "Hello, my name is "+a+" and my age is "+b
  }
  println(myFunction("Adithya",26))

  def multiplier(): Int ={
    return 4
  }

  def parameterless():Int = 42

  println(parameterless())
  println(multiplier())

  //basically uses recurssion over iterations
  def repeatedFunc (a: String, n: Int): String ={
    if ( n == 1) a
    else a + repeatedFunc(a, n-1)
  }
  println(repeatedFunc("Hello",4))

  def withoutReturnType() = "Hello"
  println(withoutReturnType())

  def funcWithSideEffects(myString: String):Unit = {
    println(myString)
  }

  def someFunction (n: Int):Int = {
    def innerFunc(a: Int, b:Int):Int = a+b

    innerFunc(n, n-1)
  }

  println(someFunction(2))

  def exerciseFunc(name:String, age: Int):String ={
    return "Hello there, "+name+"! Your age is "+age
  }
  println(exerciseFunc("Adithya",69))

  def factorial(n:Int):Long={
    if (n <= 0) 1
    else  n * factorial(n-1)
  }

  def fibonacci(n:Int):Int={
    if(n <= 1) 1
    else fibonacci(n-1) + fibonacci(n-2)
  }

  println(factorial(5))
  println(fibonacci(4))

  def primeChecker(n: Int): Boolean = {
    def primeTill(t: Int): Boolean =
      if (t <= 1) true
      else n % t != 0 && primeTill(t - 1)

    primeTill(n / 2)
  }

  println(primeChecker(19))

}
