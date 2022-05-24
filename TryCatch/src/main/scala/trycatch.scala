import scala.util.{Failure, Success, Try}

object trycatch extends  App {

  val success  = Success(3)
  val aFailure = Failure(new RuntimeException("Fail!"))
  println(success)
  println(aFailure)

  def unsafeMethod(): String = throw new RuntimeException("String failure!")

  val potFailure = Try(unsafeMethod())
  println(potFailure)

  val anotherOne = Try{

  }

  println(potFailure.isSuccess)

  //orElse
  def backupMethod () : String = "A valid result"
  val fallback = Try(unsafeMethod()).orElse(Try(backupMethod()))
  println(fallback) //trycatch- promises similar

  def betterUnsafeMethod(): Try[String] = Failure(new RuntimeException)
  def betterBackUpMethod(): Try[String] = Success("Success!!")
  val betterFallback = betterUnsafeMethod() orElse betterBackUpMethod()

  //map, filter and flatMap

  println(success.map(_ * 2))
  println(success.flatMap(x => Success(x * 10)))
  println(success.filter(_ > 10))


}
