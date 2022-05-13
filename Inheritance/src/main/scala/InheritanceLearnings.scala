object InheritanceLearnings extends App{

 sealed class Animal{
    val creatureType = "wild"
     def eat = print("Nom Nom chompy") // prevents from overriding
  }

  class Dog extends  Animal{
    def Crunch = {
      eat
      print("Crunchy!!")
    }
  }

  //overriding

  class Cat (override val creatureType:String) extends Animal {
    override def eat = println("Licky licky")
  }

  class Bird (val birdBreed:String) extends  Animal {
    override  val creatureType = birdBreed

    override def eat = {
      super.eat
      println("chirp chirp")
    }
  }
  val dog = new Dog
  val cat = new Cat("Domesticated")

  val bird = new Bird("Peking Parrot")

  print(bird.creatureType)
  dog.Crunch
  cat.eat
  print(cat.creatureType)

  val unknownAnimal:Animal = new Bird("Dragon")//polymorphism
  unknownAnimal.eat //goes to dog's eat method instead of aniamls
}
class Person(name: String, age:Int) {
  //using aux constructors
  def this(name:String) = this(name, 0)
}
class Adult (name:String, age:Int, idDetails: String) extends Person(name,age) //similar to super



//single class inheritance
//can use final to prevent overriding. if used for class it prevents extending.

//cna use sealed. it only allows to inherit in this file but not other files