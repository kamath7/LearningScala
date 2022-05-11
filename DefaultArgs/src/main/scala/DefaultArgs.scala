object DefaultArgs extends App {
  //setting default arg of accumulator to 1
  def factorial(n: Int, accumulator: Int = 1 ): Int = {
    if (n<=1) accumulator
    else factorial(n-1, n * accumulator)
  }

  var factor10 = factorial(10, 1)
  println(factor10)

  print(factorial(11))
  print(factorial(10))
}
