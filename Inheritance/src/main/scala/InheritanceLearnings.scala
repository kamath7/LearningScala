object InheritanceLearnings extends App{

  class Animal{
    protected  def eat = print("Nom Nom chompy")
  }

  class Dog extends  Animal{
    def Crunch = {
      eat
      print("Crunchy!!")
    }
  }

  //overriding

  class Cat extends Animal {
    override def eat = println("Licky licky")
  }
  val dog = new Dog
  val cat = new Cat
  dog.Crunch
  cat.eat
}
class Person(name: String, age:Int) {
  //using aux constructors
  def this(name:String) = this(name, 0)
}
class Adult (name:String, age:Int, idDetails: String) extends Person(name,age) //similar to super



//single class inheritance
