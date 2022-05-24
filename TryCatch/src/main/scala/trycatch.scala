import scala.util.{Failure, Success, Try}

object trycatch extends  App {

  val success  = Success(3)
  val aFailure = Failure(new RuntimeException("Fail!"))
  println(success)
  println(aFailure)

  def unsafeMethod(): String = throw new RuntimeException("String failure!")

  val potFailure = Try(unsafeMethod())
  println(potFailure)

}
