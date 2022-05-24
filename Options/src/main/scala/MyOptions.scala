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

  def backup():String = "Some Result!"
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
}
