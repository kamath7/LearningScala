object AbstractDataTypes extends App {
  //classes which contain umimplemented methods

  abstract class Animal {
    val creatureType: String

    def eat: Unit
  }

  class Dog extends Animal {
    override val creatureType: String = "German Shepherd"

    override def eat: Unit = println("Crunch Licky Crunch")
  }
  //cant create objects with Abstract clals

  //traits . Similar to abstract class. Unlike abstract class, they can be inherited along classes. traits can also have non abstract types
  trait Carnivore {
    def eat(animal: Animal):Unit
    val preferredMeal: String = "Fish"
  }
  trait hasFur{}

  class Crocodile extends Animal with Carnivore with hasFur {
    override val creatureType: String = "Gharial"
    override def eat(animal: Animal): Unit = print(s"I am a $creatureType. Currently eating ${animal.creatureType}")

    override def eat: Unit = print("Chomp Chomp")
  }

  val croc = new Crocodile
  croc.eat(new Dog)

}
//Traits cannot have constructor params
//multiple traits can be inherited by the same class
//traits display behavior but abstract class is a type of thing
