object InheriExercise extends App {

  abstract class MyList {

    def head:Int
    def tail: MyList
    def isEmpty: Boolean
    def add(element: Int):MyList
    protected def printElements:String

    override def toString: String = "{"+printElements+"}"

  }

  object Empty extends MyList {
    ///??? - means return nothing
    override def head: Int = throw new NoSuchElementException()

    override def tail: MyList = throw new NoSuchElementException()

    override def isEmpty: Boolean = true

    override def add(element: Int): MyList = new Cons(element, Empty)
  }

  class Cons(h: Int, t:MyList) extends MyList{
    override def head: Int = h

    override def tail: MyList = t

    override def isEmpty: Boolean = false

    override def add(element: Int): MyList = new Cons(element, this)
  }



    val list = new Cons(1, new Cons(3, Empty))
    print(list.tail.head)
    print(list.add(5).head)

}
