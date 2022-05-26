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

  val tuples = List((1,2), (4,5))
  val filterTuples = for {
    (first, second) <- tuples
  } yield first + second


}
