object AwesomeLists extends App{

  val someList = List(1,2,3)
  val prepend = 42 :: someList
  println(prepend)

  val append = 42 +: someList :+ 89
  println(append)

  val apples = List.fill(5)("PineApples") //curried func in action 😎
  println(apples)
  println(apples.mkString("-|-")) //adds separator
}
