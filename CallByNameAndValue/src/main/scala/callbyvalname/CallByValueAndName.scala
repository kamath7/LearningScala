package callbyvalname

object CallByValueAndName extends App{

  def calledByValue(x: Long): Unit ={
    println("by value "+x)
    println("by value "+x)

  }
  def calledByName(x: => Long):Unit={
    println("by name "+x)
    println("by name "+x)

  }

  calledByValue(System.nanoTime())
  calledByName(System.nanoTime())// expression evaluated everytime

  def infiniteRecursive():Int = 1 + infiniteRecursive()
  def printFirst(x:Int, y: => Int) = println(x)

  println(infiniteRecursive(), 69)
}
//call by value - regular call
//value is computed before call
//same value used everywhere

//call by name
// expression passed literally
//expression evaluated every line

