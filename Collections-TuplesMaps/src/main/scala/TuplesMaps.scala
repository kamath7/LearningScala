object TuplesMaps extends App {

  //Tuple
  //finite ordered lists

  val myTUp = new Tuple2(2,"Die Hard")

  println(myTUp)
  println(myTUp._1) //prints first elem
  println(myTUp.copy(_2 = "Lalle"))
  println(myTUp.swap)


}
