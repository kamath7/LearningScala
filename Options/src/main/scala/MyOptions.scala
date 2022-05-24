import scala.util.Random

object MyOptions extends App {

  //option is a wrapper for a value that might be present or not
  val myfirstOption: Option[Int] = Some(4)
  val noOptions: Option[Int] = None

  println(myfirstOption)
  println(noOptions)

  //options were due to unsafe apis

  def unsafeOpts(): String = null
  // val res = Some(null) -> Unsafe

  val res = Option(unsafeOpts())
  print(res)

  //chained mthods

  def backup(): String = "Some Result!"

  val chainedRes = Option(unsafeOpts()).orElse(Option(backup())) //like promise chaining

  //Design Unsafe APIs
  def betterUnsafe(): Option[String] = None

  def betterBackup(): Option[String] = Some("Valid Result")

  val betterRes = betterUnsafe() orElse betterBackup()

  //Option functions
  println(myfirstOption.isEmpty)
  println(myfirstOption.get) //unsafe - not meant for use

  //map, flatmap, filter

  println(myfirstOption.map(_ * 69))
  println(myfirstOption.filter(x => x > 10))
  println(myfirstOption.flatMap(x => Option(x * 10)))

  //Exercise

  val config: Map[String, String] = Map("host" -> "192.168.1.1", "Port" -> "8000")

  class Connection {
    def connect = "Connected!!"
  }
  object Connection{
    var random = new Random(System.nanoTime())
    def apply(host:String, port: String): Option[Connection] = {
      if (random.nextBoolean()) Some(new Connection)
      else None
    }
  }

  val host = config.get("host")
  val port = config.get("port")
  val connection = host.flatMap(h => port.flatMap(p => Connection.apply(h, p)))
  val connectionStatus = connection.map (c => c.connect)
  println(connectionStatus)
  connectionStatus.foreach(println)
}
