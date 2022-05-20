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

  val numbersx = List(1,2,3,4)
  val charsz = List('a','b','c','d','e')
  val colorsz = List("Black", "Blue")

  //iterations
  val pairThem = numbersx.flatMap(n => charsz.map(c => ""+ c + n))
  print(pairThem)

  numbersx.foreach(print) //similar to map

  //for comprehensions
  val forComb = for{
    n <- numbersx if n % 2 == 0
    ch <- charsz
    color <- colorsz
  }yield "" + ch + n + " "+ color

  print(forComb)

  //similar to foreach
  for {
    n <- numbersx
  } println(n)

  //syntax overload

  list.map(x => x * 2)


}
