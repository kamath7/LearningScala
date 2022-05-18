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

  def concatt: (String, String) => String = new Function2[String, String, String]{
    override def apply(v1: String, v2: String): String = v1 + v2
  }

  println(concatt("Hello","Kams"))
  //curried functions
  val specAdder: Function[Int, Function[Int, Int]] = new Function1[Int, Function1[Int, Int]]{
    override def apply(v1: Int): Function1[Int, Int]  = new Function1[Int, Int]{
      override def apply(v2: Int): Int = v1 + v2
    }
  }

  val adder3 = specAdder(3)
  print(adder3(4))
  print(specAdder(68)(1))
}
trait  MyFunc [A,B] {
  def apply(element: A):B
}