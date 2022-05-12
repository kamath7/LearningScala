import scala.language.postfixOps

object MethodNotationsExercises extends App {

  class Person(val name: String,val age:Int = 0, favMovie: String = "Die Hard"){

    def +(somethingString:String) : String = s"$name $somethingString"
    def unary_+ : Person = new Person(name, age+1)

    def learns(topic: String):String = s"$name is learning $topic"
    def learnsPython = this learns "Python"

    def apply(watchedTime: Int): String = s"$name watched $favMovie - $watchedTime times"
  }

  val alice = new Person("Alice")
  println(alice + "awesome" )
  println((+alice).age)
  println(alice learnsPython)
}
