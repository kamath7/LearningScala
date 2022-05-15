object InheriExercise extends App {

  abstract class MyList[+A] {

    def head:A
    def tail: MyList[A]
    def isEmpty: Boolean
    def add[ B >: A](element: B):MyList[B]
    def printElements:String

    override def toString: String = "{"+printElements+"}"

  }

  object Empty extends MyList[Nothing] {
    ///??? - means return nothing
    override def head: Nothing = throw new NoSuchElementException()

    override def tail: MyList[Nothing] = throw new NoSuchElementException()

    override def isEmpty: Boolean = true

    override def add[ B >: Nothing](element: B): MyList[B] = new Cons(element, Empty)

    def printElements:String = ""
  }

  class Cons[+A](h: A, t:MyList[A]) extends MyList[A]{
    override def head: A = h

    override def tail: MyList[A] = t

    override def isEmpty: Boolean = false

    override def add[B >: A](element: B): MyList[B] = new Cons(element, this)

    def printElements: String =
      if (t.isEmpty) ""+h
      else s"$h ${t.printElements}"

  }



//    val list = new Cons(1, new Cons(3, Empty))
//    print(list.tail.head)
//    print(list.add(5).head)
//    print(list.toString)

}
