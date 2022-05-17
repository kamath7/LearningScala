object OOMErr extends App {

  // val arr = Array.ofDim(Int.MaxValue) //to crash JVM

  //StackOverflow err
  def infiniteErr: Int = 1 + infiniteErr
  // val limitless = infiniteErr

  class OverflowException extends RuntimeException

  class UnderflowException extends RuntimeException

 class DivideZeroException extends RuntimeException("Divison by Zero!!")
  class PocketCalc {
    def add(x: Int, y: Int) = {
      val res = x + y
      if (x > 0 && y > 0 && res < 0) throw new OverflowException
      else if (x < 0 && y < 0 && res > 0) throw new UnderflowException
      else res
    }

    def subtract(x: Int, y: Int) = {
      val res = x - y
      if (x > 0 && y > 0 && res < 0) throw new OverflowException
      else if (x < 0 && y < 0 && res > 0) throw new UnderflowException
      else res

    }

    def multiply (x: Int, y: Int)= {
     val res = x * y
     if (x > 0 && y > 0 && res < 0) throw new OverflowException
     else if (x < 0 && y < 0 && res < 0) throw new UnderflowException
     else if (x > 0 && y < 0 && res > 0) throw new UnderflowException
     else if (x < 0 && y > 0 && res > 0) throw new UnderflowException
     else res
    }

   def divide (x: Int, y: Int)= {
    if (y == 0 ) throw new DivideZeroException
    else x / y
   }
  }

  val myPockie = new PocketCalc
  //Success
  print(myPockie.add(68, 1))
  print(myPockie.subtract(5,2))
  print(myPockie.multiply(3, 3))
  print(myPockie.divide(2,1))
 //Fail
 print(myPockie.divide(2,0))

}
