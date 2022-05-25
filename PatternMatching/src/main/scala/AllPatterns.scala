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

  //using tuples

  val typle = (1, 2)
  val matchTuple = typle match {
    case (1,1)  =>
    case (something, 2) => s"found $something"
  }

  //nested tuples
  val nestTuple = (1,(2,3))
  val matchNestTuple = nestTuple match {
    case (_, (2, v)) =>
  }//patten matches can be nested

}
