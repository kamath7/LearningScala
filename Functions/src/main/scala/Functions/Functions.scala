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
}
