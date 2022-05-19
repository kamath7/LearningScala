object MuyCurry extends App {

  def toCurry(f: (Int, Int) => Int): (Int => Int => Int) = {
    x => y => f(x, y)
  }

  def fromCurry(f: (Int => Int => Int)): (Int, Int) => Int = {
    (x, y) => f(x)(y)
  }

  def compose[A, B, T](f: A => B, g: T => A): T => B = {
    x => f(g(x))
  }

  def andThen[A, B, C](f: A => B, g: B => C): A => C = {
    x => g(f(x))
  }

  def supAdder2: (Int => Int => Int) = toCurry(_ + _ )
  val add5 = supAdder2(5)
  println(add5(17))

  val simpleAdder = fromCurry(supAdder2)
  println(simpleAdder(2,3))

  val add17 = (x: Int) => x + 2
  val times69 = (x: Int) => x * 69

  val composee = compose(add17, times69)
  val order = andThen (add17, times69)

  println(composee(5))
  println(order(4))

}
