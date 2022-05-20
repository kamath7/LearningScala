object HOFSFilterMapFlatMap extends App {

  val list = List(69, 70, 71)

  println(list)

  println(list.head)
  println(list.tail)
  print(list.map(_ + 1)) //adds 1

  print(list.filter(_ % 2 == 0)) //only even nos

  //flatMap
  val toPair = (x: Int) => List(x, x + 1)
  println(list.flatMap(toPair))

  val numbersx = List(1, 2, 3, 4)
  val charsz = List('a', 'b', 'c', 'd', 'e')
  val colorsz = List("Black", "Blue")

  //iterations
  val pairThem = numbersx.flatMap(n => charsz.map(c => "" + c + n))
  print(pairThem)

  numbersx.foreach(print) //similar to map

  //for comprehensions
  val forComb = for {
    n <- numbersx if n % 2 == 0
    ch <- charsz
    color <- colorsz
  } yield "" + ch + n + " " + color

  print(forComb)

  //similar to foreach
  for {
    n <- numbersx
  } println(n)

  //syntax overload

  list.map(x => x * 2)

  val jusse = Just(4)
  print(jusse)
  println(jusse.map(_ * 2))
  println(jusse.flatMap(x => Just(x % 2 == 0)))
  println(jusse.filter(_ % 2 == 0))
}

abstract class Maybe[+T] {
  def map[B](f: T => B): Maybe[B]

  def flatMap[B](f: T => Maybe[B]): Maybe[B]

  def filter(p: T => Boolean): Maybe[T]

}

case object MaybeNot extends Maybe[Nothing] {
  def map[B](f: Nothing => B): Maybe[B] = MaybeNot

  override def flatMap[B](f: Nothing => Maybe[B]): Maybe[B] = MaybeNot

  override def filter(p: Nothing => Boolean): Maybe[Nothing] = MaybeNot

}

case class Just[+T](value: T) extends Maybe[T] {
  override def map[B](f: T => B): Maybe[B] = Just(f(value))

  override def flatMap[B](f: T => Maybe[B]): Maybe[B] = f(value)

  override def filter(p: T => Boolean): Maybe[T] = {
    if (p(value)) this
    else MaybeNot
  }
}

