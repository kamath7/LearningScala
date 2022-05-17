object InheriExercise extends App {

  abstract class MyList[+A] {

    def head:A
    def tail: MyList[A]
    def isEmpty: Boolean
    def add[ B >: A](element: B):MyList[B]
    def printElements:String

    override def toString: String = "["+ printElements +"]"

    def map[B] (transformer: MyTransformer[A,B]):MyList[B]
    def flatMap[B] (transformer: MyTransformer[A,MyList[B]]):MyList[B]
    def filter(predicate: MyPredicate[A]): MyList[A]
    def ++[B >: A](list: MyList[B]) : MyList[B]
  }

  object Empty extends MyList[Nothing] {
    ///??? - means return nothing
    override def head: Nothing = throw new NoSuchElementException()

    override def tail: MyList[Nothing] = throw new NoSuchElementException()

    override def isEmpty: Boolean = true

    override def add[ B >: Nothing](element: B): MyList[B] = new Cons(element, Empty)

    def printElements:String = ""

    override def map[B](transformer: MyTransformer[Nothing, B]): MyList[B] = Empty

    override def flatMap[B](transformer: MyTransformer[Nothing, MyList[B]]): MyList[B] = Empty

    override def filter(predicate: MyPredicate[Nothing]): MyList[Nothing] = Empty

    def ++[B >: Nothing] (list: MyList[B]) : MyList[B] = list
  }

  class Cons[+A](h: A, t:MyList[A]) extends MyList[A]{
    override def head: A = h

    override def tail: MyList[A] = t

    override def isEmpty: Boolean = false

    override def add[B >: A](element: B): MyList[B] = new Cons(element, this)

    def printElements: String =
      if (t.isEmpty) ""+h
      else s"$h ${t.printElements}"

    override def map[B](transformer: MyTransformer[A, B]): MyList[B] = new Cons(transformer.transform(h), t.map(transformer))

    override def flatMap[B](transformer: MyTransformer[A, MyList[B]]): MyList[B] = {
      transformer.transform(h) ++ t.flatMap(transformer)
    }


    override def filter(predicate: MyPredicate[A]): MyList[A] =
      if (predicate.test(h)) new Cons(h, t.filter(predicate))
      else t.filter(predicate)//head not in result

    def ++[B >: A] (list: MyList[B]) : MyList[B] = new Cons(h, t ++ list)

  }

  trait MyPredicate[-T] {
    def test (elem: T) : Boolean
  }

  trait MyTransformer[-A,B]{
    def transform(elem: A): B
  }

//    val list = new Cons(1, new Cons(3, Empty))
//    print(list.tail.head)
//    print(list.add(5).head)
//    print(list.toString)

}
