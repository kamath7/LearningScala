object MyAwesomeObj extends App{
  object Person{
    //staticclass - level functionality
    val N_EYES = 2
    def canFly: Boolean = false
    def apply(mother: Person, father: Person):Person = new Person("Bob") //this is a factory method
  }

  class Person(val name:String){
    //instance level functionality
  }

  // can write object and Class person together. this is called companions
  println(Person.N_EYES)
  println(Person.canFly)

  val harry = Person
  val maguire = Person

  val goat = new Person("Goat")
  val messi = new Person("Messi")

  println(goat == messi) //false
  println(harry == maguire) //true
  val child = Person(goat, messi)
  //Scala application -> scala object with def main(args:Array[String]):Unit
}
//scala doesn't have class level functionality. No STATIC. Equivalent is Object
// Scala object - singleton instance

