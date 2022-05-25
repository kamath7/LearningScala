import scala.util.Random

object PatternM extends App{
  val random = new Random
  val x = random.nextInt()

  val descriptor = x match {
    case 1 => "Numero UNO"
    case 2 => "Double Trouble"
    case 3 => "Hattrrick"

    case _ => "Something else"
  }

  println(s" $x -> $descriptor")

  case class Person (name: String, age: Int)
  val jim = Person("Jim", 23)

  val greeting = jim match {
    case Person(n,a) => s"My name is $n and I'm $a years old"

    case _ => "This is John Doe and I'm 69 years old"
  }
  println(greeting)
}
