object StringOps extends App{

  val myStr = "Learning Scala and enjoying it"

  println(myStr)
  print(myStr.charAt(2))
  print(myStr.substring(0,7))
  println(myStr.split(" ").toList)
  println(myStr.startsWith("Learning"))
  println(myStr.replace("Learning","Implementing"))
  println(myStr.toLowerCase())
  print(myStr.length)

  val numString  = "45"
  val stringToInt = numString.toInt

  println('a' +: numString  :+ 'z') //appending and prepending
  println(myStr.reverse)
  println(myStr.take(2))

  //s-interpolator
  val name = "Kams"
  val age = 26
  val greeting = s"Hello you are $name and you are $age years old"

  println(greeting)
  println(s"you were born in ${2022-age}")

  //f - interpolator
  val rate = 9.999f
  val someStatement = f"$name can dance at $rate%2.2f steps per minute"
  print(someStatement)

  //raw interpolator
  print(raw"Newline character \n ss") //ignores escape line
}
