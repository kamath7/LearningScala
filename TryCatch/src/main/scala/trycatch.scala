import scala.util.{Failure, Random, Success, Try}

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

  //Exercise code

  val hostName = "micasa"
  val port = "8080"

  def renderPage (page: String) = println(page)

  class Connection {
    def get (url: String): String = {
      val random = new Random(System.nanoTime())
      if (random.nextBoolean()) "Some HTML content"
      else throw new RuntimeException("Connection gone")
    }
  }

  object httpService {
    val random = new Random(System.nanoTime())

    def getConnection(host: String, port: String): Connection = {
      if (random.nextBoolean()) new Connection
      else throw new RuntimeException("PORT in use")
    }
  }



}
