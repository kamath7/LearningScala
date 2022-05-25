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



}
