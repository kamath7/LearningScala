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
}
