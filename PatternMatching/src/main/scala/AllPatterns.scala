object AllPatterns extends App {

  //constants

  val x: Any = "Lalle"
  val constant = x match {
    case 1 => "a number"
    case "Lalle" => "Ulti Lalle"
    case true => "Awesome"
    case AllPatterns => "Singleton Obj"
  }

  //match-anything

  val matchAnything = x match {
    case _ =>
  }

  //using variable

  val matchVar = x match {
    case something => s"found $something"
  }


}
