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
}
