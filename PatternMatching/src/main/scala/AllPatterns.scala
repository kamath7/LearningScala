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

  //List patterns

  val myList = List(1,2,69,70)
  val standardListMathc = myList match {
    case List(1, _ , _ , _) => //extractor
    case List(1, _*) => //list of arbitrary length
    case 1 :: List(_) => //infix pattern
    case List(1,2,3) :+ 42 => //infix pattern
  }

  //type specifiers

  val unknown: Any = 2
  val unknownMatch = unknown match {
    case list: List[Int] => //explicit type specifier
    case _ =>
  }
  //name binding
//  val myList1 = List(1,2,69,70)
//  val nameBindingMatch = myList1 match {
//
//    case nonEmptyList @ Cons(_, _) => //name binding
//    case Cons(1, rest @ Cons(2, _)) => //name binding inside nesting patterns
//  }

  //multi pattern

//  val multiPattern = myList match {
//    case Empty | Cons(0, _) => //comppound Pattern
//  }

  //if guard
//  val secondElement = myList match {
//    case Cons(_, Cons(specialElement, _)) if specialElement % 2 == 0 =>
//  }
}
