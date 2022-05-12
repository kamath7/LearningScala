import scala.language.postfixOps

object MethodNotations extends App {

  class Person(val name:String, favMovie: String){
    def likes(movie:String):Boolean = movie == favMovie
    def dancingWith(person:Person): String = s"${this.name} hangs out with ${person.name}"
    def +(person:Person): String = s"${this.name} paired with ${person.name}"
    def unary_! : String = s"$name has passed away 🤣"
    def isStupid : Boolean = true
  }
  val alex = new Person("Alex","Dead")
  print(alex.likes("Dead"))
  print(alex likes "Dead") //infix notation or operator notation. only works for single parameter. syntax object methodname parameter

  val alan = new Person("Alan","Hot Fuzz")
  println(alex dancingWith alan)//dancingwith acts like an operator here
  println(alex + alan)

  //prefix notation
  val x = -1
  val y = 1.unary_- //same as above
  //unary_prefix only works with -, + , ~ and !
  println(!alan)
  println(alan.unary_!)

  //postfix notation
  println(alex.isStupid) //with no parameters you can subject to postfix
  println(alan isStupid)
}
