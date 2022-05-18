object AnonFuncstions extends App{
   val doubler  = new Function1[Int, Int]{
     override def apply(v1: Int): Int = v1 * 2
   }
   val betteroudbler: Int => Int = x => x * 2 //anonymous func or lambda

}
