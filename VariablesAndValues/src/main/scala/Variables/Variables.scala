package Variables

object Variables extends App {
  //Extends App required for IDE

  val x: Int = 42
  println(x)

  //x = 43  - cant use this since val is immutable

  val y = 33
  //types for val are optional. compiler knows it is an int


  // val z: String = 33  - won't work

  val someVar: String = "My String!"
  println(someVar)

  val anotherString: String = "Good Morning!"

  //Other basic types
  val isLegalAge: Boolean = true
  val somePercent: Double = 3.45
  val aChar: Char = 'a'

  val myShort: Short = 2


  //Vars. Also they are mutable
  var myFloat: Float = 6.9
  var myLong: Long = 3300303L

  myFloat = 7.0
  print(myFloat)



}
