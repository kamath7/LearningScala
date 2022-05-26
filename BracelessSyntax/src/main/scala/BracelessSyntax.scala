object BracelessSyntax extends App {

  //if regular
  val ifExpr = if ( 2 > 3) "awesome" else "not awesome"
  //compact
  val ifExpr2 =
    if (2 > 3) "awesome"
    else "not awesome"

  //braceless
  val ifExpr3 =
    if 2 > 3 then
      "awesome"
    else
      "not awesome"

  val ifExpr4 =
    if 2 > 3 then
      val res = "awesome"
      res
    else
      val res = "not awesome"
      res

  val ifExpr5 = if 2 > 3 then "awesome" else "not awesome"

  val forExpr1 = for {
    n <- List(1,2,3)
    s <- List("awesome","twosome")
  }yield s"$n = $s"

  //braceless
  val forExpr3 =
    for
      n <- List(1,2,3)
      s <- List("awesome", "twosome")
    yield s"$n $s"

  //pattern matching
  val lalle1 = 69
  val pattMatch = lalle1 match {
    case 1 => "one"
    case 2 => "deus"
    case _ => "something else"
  }

  val pattMatch1 =
    lalle1 match
    case 1 => "one"
    case 2 => "deus"
    case _ => "something else"

  //braceless methods
  def showMeTheMeaning(arg: Int): Int = {
    val partialRes = 40
    partialRes + 2
  }
  println(showMeTheMeaning(4))

  def showMeTheMeaning1(arg: Int): Int =
    val partialRes = 40
    partialRes + 2


  println(showMeTheMeaning1(4))

  //classes (applicable to traits, enums, objects etc)
  class Animal {
    def eat(): Unit = println("Currently chomping!")
  }

  class Animal1:
    def eat(): Unit = println("Currently chomping!")
    def run(): Unit = println("Currently running!")

  end Animal1 //use for code with multiple lines

  //Anonymous class
  val specAnimal = new Animal:
    override def eat(): Unit = super.eat()



}



