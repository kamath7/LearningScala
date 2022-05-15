object Generics extends App {

  class MyList[A] { //[A] defines generic type

  }

  trait genericTrait[A] //also works for traits
  class MyMap[Key, Value]

  val listOfInts = new MyList[Int] //Int replaces generic type A
  val listOfStrings = new MyList[String]

  //generic methods

  object lalleObj {
    def empty[A]: MyList[A] = ???
  }

  val emptyListofInts = lalleObj.empty[Int]

  //Variance problem

  class Animal

  class Cat extends Animal
  class Bird extends Animal
  //list of bird will extend list of Animal. This is called covariance.

  class CovariantList[+A]
  var animal:Animal = new Cat
  val animalList:CovariantList[Animal] = new CovariantList[Cat]

  //invariant list
  class InvariantList[A]
  val invariantAnimalList: InvariantList[Animal] = new InvariantList[Animal]

  //contravariant list
  class ContraVariantList[-A]
  val contraVariantList: ContraVariantList[Cat] = new ContraVariantList[Animal]
}
