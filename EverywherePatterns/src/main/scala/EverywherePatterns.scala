object EverywherePatterns extends App {

  try {

  } catch {
    case e: RuntimeException => "runtime"
    case npe: NullPointerException => "npe"
    case _ => "Some other error"
  }

  val list = List(14, 5, 6, 79)
  val evenOnes = for {
    x <- list if x % 2 == 0
  } yield 10 * x
  println(evenOnes)

  val tuples = List((1, 2), (4, 5))
  val filterTuples = for {
    (first, second) <- tuples
  } yield first + second

  val tuple = (1, 2, 3)
  val (a, b, c) = tuple
  println(s"$a, $b, $c")

  val head :: tail = list
  println(s" $head $tail ")

  //partial func

  val mapperList = list.map {
    case v if v % 2 == 0 => v + "is even"
    case 1 => "Number wan"
    case _ => "Lalle"
  } //partial func literal

  val mapperList2 = list.map { x =>
    x match {
      case v if v % 2 == 0 => v + "is even"
      case 1 => "Number wan"
      case _ => "Lalle"
    }
  }
}
