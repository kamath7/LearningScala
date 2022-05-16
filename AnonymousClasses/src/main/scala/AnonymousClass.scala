object AnonymousClass extends App{
  abstract class Animal {
    def eat:Unit
  }


  val hahaAnimal: Animal = new Animal {
    override def eat: Unit = println("LMAO ")
  } //creates a class with the extends keyword and implements the abstract class method

  println(hahaAnimal.getClass) //OP - class AnonymousClass$$anon$1

  class Person (name: String){
    def sayHello: Unit = print(s"hi I'm $name. How are you?")
  }

  //cannot create an anonymous class here due to params. alternate

  var pam = new Person("Pam"){
    override def sayHello: Unit = println("PHYLISSS!!!")
  }

  pam.sayHello
}
