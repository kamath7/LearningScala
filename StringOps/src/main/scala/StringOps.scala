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
}
