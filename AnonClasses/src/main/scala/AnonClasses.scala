object AnonFuncstions extends App{
   val doubler  = new Function1[Int, Int]{
     override def apply(v1: Int): Int = v1 * 2
   }
   val betteroudbler: Int => Int = x => x * 2 //anonymous func or lambda

  val adder: (Int, Int) => Int = (a : Int, b : Int) => a+b

  //no params
  val noPams:() => Int = ()=> 3

//  print(noPams) //won't work as expected
  print(noPams())

  //using curly bracces

  val StringToInt = {
    (str: String) => str.toInt
  }

  val diInc: Int => Int = _ +1 // similar to x = x+1
  val simplerAdder: (Int, Int) => Int = _ + _ //equi to a + b

}
