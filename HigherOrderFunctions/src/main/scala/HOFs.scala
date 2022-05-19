object HOFs extends App{

  val superFunc: (Int, (String, (Int => Boolean)) => Int) => (Int, Int) = null

  //map, flatMap, filter are all HOFs

  def nTimes(f:Int => Int , n : Int, x: Int ):Int = {
    if (n == 0) x
    else nTimes(f, n-1, f(x))
  }

  val addOne = (x:Int) => x + 1

  print(nTimes(addOne, 10, 1))

  def nTimesNice(f: Int => Int, n:Int): (Int => Int) = {
    if (n <= 0 ) (x: Int) => x
    else (x: Int) => nTimesNice(f,n-1)(f(x))
  }

  val pl10 = nTimesNice(addOne, 10)
  println(pl10(1))

  //curried funcs
  val superAdd = (x: Int) => (y:Int) => x+y
  println(superAdd(3)(10))

  def curryFormatter(c: String)(x:Double): String = c.format(x)

  val standardForm: (Double => String) = curryFormatter("%4.2f")
  val preciseForm: (Double => String) = curryFormatter("%10.8f")

  println(standardForm(Math.PI))
  println(preciseForm(Math.PI))
}
