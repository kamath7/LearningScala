import scala.util.Random

object PatternM extends App{
  val random = new Random
  val x = random.nextInt(5)

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
    case Person(n,a) if a < 21 => s"My name is $n and I'm $a years old and I'm not an adult"
    case Person(n,a) if a > 21 => s"My name is $n and I'm $a years old and I'm an adult"
    case _ => "This is John Doe and I'm 69 years old"
  }

  //cases are matched in order. no case match => match error
  println(greeting)

  sealed class Animal
  case class Dog(breed: String) extends Animal
  case class Parrot (greeting: String) extends Animal

  val animal: Animal = Dog("German Shepherd")

  animal match {
    case Dog(someBreed) => println(s"You are a dog of $someBreed! Woof Woof!")
  }
  //pattern matching works very well with case classes
  //match-everything
  val isEven = x match {
    case n if n % 2 == 0 => true
    case _ => false
  }

  //Exercise

  trait expr
  case class Number(n: Int) extends expr
  case class Sum(e1: expr, e2: expr) extends expr
  case class Prod(e1: expr, e2: expr) extends expr

}
