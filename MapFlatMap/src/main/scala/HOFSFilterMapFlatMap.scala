object HOFSFilterMapFlatMap extends App{

  val list = List(69,70,71)

  println(list)

  println(list.head)
  println(list.tail)
  print(list.map(_ + 1)) //adds 1

  print(list.filter(_ % 2 ==0)) //only even nos

  //flatMap
  val toPair = (x: Int) => List(x, x+1)
  println(list.flatMap(toPair))



}
