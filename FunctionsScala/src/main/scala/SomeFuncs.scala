object SomeFuncs extends App{
  //use functions like first class elems
  val someFunc = new MyFunc[Int, Int]{
    override def apply(element: Int): Int = element * 2
  }
  println(someFunc(2))

  val StringToIntCov = new Function[String, Int]{
    override def apply(v1: String): Int = v1.toInt
  }
  println(StringToIntCov("2"))

  val adder: ((Int, Int) => Int)  = new Function2[Int, Int , Int] {
    override def apply(a: Int, b:Int): Int = a+b
  }
}
trait  MyFunc [A,B] {
  def apply(element: A):B
}