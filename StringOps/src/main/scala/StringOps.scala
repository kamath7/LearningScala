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
}
