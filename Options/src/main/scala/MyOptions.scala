object MyOptions extends App {

  //option is a wrapper for a value that might be present or not
  val myfirstOption: Option[Int] = Some(4)
  val noOptions: Option[Int] = None

  println(myfirstOption)
  println(noOptions)

  //options were due to unsafe apis

}
