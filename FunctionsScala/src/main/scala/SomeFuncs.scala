object SomeFuncs extends App{
  //use functions like first class elems
  val someFunc = new MyFunc[Int, Int]{
    override def apply(element: Int): Int = element * 2
  }
  println(someFunc(2))
}
trait  MyFunc [A,B] {
  def apply(element: A):B
}