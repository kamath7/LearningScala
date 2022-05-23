object TuplesMaps extends App {

  //Tuple
  //finite ordered lists

  val myTUp = new Tuple2(2,"Die Hard")

  println(myTUp)
  println(myTUp._1) //prints first elem
  println(myTUp.copy(_2 = "Lalle"))
  println(myTUp.swap)

  //Maps - keys -> Values
  val myMap: Map[String, Int] = Map()//string is key , int - value

  val myContacts = Map(("Andy",888291), ("Robert California",2991002), "Michael Scott"->7812992) //michael scott one is similar but synctatic sugar
  println(myContacts)

}
