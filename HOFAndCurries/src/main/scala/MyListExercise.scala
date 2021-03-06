object MyListExercise {

  abstract class MyList[+A] {

    def head: A

    def tail: MyList[A]

    def isEmpty: Boolean

    def add[B >: A](element: B): MyList[B]

    def printElements: String

    override def toString: String = "[" + printElements + "]"

    //higher order funcs
    def map[B](transformer: A => B): MyList[B]

    def flatMap[B](transformer: A => MyList[B]): MyList[B]

    def filter(predicate: A => Boolean): MyList[A]

    def ++[B >: A](list: MyList[B]): MyList[B]

    //adding Hofs
    def forEach(f: A => Unit): Unit

    def sort(compare: (A,A) => Int): MyList[A]

    def zipWith[B,C] (list: MyList[B], zip: (A, B) => C):MyList[C]

    def fold[B] (start: B)(operator: (B,A) => B): B
  }

  case object Empty extends MyList[Nothing] {
    ///??? - means return nothing
    override def head: Nothing = throw new NoSuchElementException()

    override def tail: MyList[Nothing] = throw new NoSuchElementException()

    override def isEmpty: Boolean = true

    override def add[B >: Nothing](element: B): MyList[B] = new Cons(element, Empty)

    def printElements: String = ""

    override def map[B](transformer: Nothing => B): MyList[B] = Empty

    override def flatMap[B](transformer: Nothing => MyList[B]): MyList[B] = Empty

    override def filter(predicate: Nothing => Boolean): MyList[Nothing] = Empty

    def ++[B >: Nothing](list: MyList[B]): MyList[B] = list

    override def forEach(f: Nothing => Unit): Unit = ()

    override def sort(compare: (Nothing, Nothing) => Int) = Empty

    override def zipWith[B, C](list: MyList[B], zip: (Nothing, B) => C): MyList[C] = {
      if (!list.isEmpty) throw new RuntimeException("Lists do not have sam elength")
      else Empty
    }

    override def fold[B](start: B)(operator: (B, Nothing) => B): B = start
  }

  case class Cons[+A](h: A, t: MyList[A]) extends MyList[A] {
    override def head: A = h

    override def tail: MyList[A] = t

    override def isEmpty: Boolean = false

    override def add[B >: A](element: B): MyList[B] = new Cons(element, this)

    def printElements: String =
      if (t.isEmpty) "" + h
      else s"$h ${t.printElements}"

    override def map[B](transformer: A => B): MyList[B] = new Cons(transformer(h), t.map(transformer))

    override def flatMap[B](transformer: A => MyList[B]): MyList[B] = {
      transformer(h) ++ t.flatMap(transformer)
    }


    override def filter(predicate: A => Boolean): MyList[A] =
      if (predicate(h)) new Cons(h, t.filter(predicate))
      else t.filter(predicate) //head not in result

    def ++[B >: A](list: MyList[B]): MyList[B] = new Cons(h, t ++ list)

    override def forEach(f: A => Unit): Unit =  {
      f(h)
      t.forEach(f)
    }

    override def sort(compare: (A, A) => Int): MyList[A] = {
      def insert(x: A, sortedList: MyList[A]): MyList[A] = {
        if (sortedList.isEmpty) new Cons(x, Empty)
        else if (compare(x, sortedList.head) <= 0) new Cons(x, sortedList) //x is the smallest elem
        else new Cons(sortedList.head, insert(x, sortedList.tail))
      }

      val sortedTail = t.sort(compare)
      insert(h, sortedTail)
    }

    override def zipWith[B, C](list: MyList[B], zip: (A, B) => C): MyList[C] = {
      if (list.isEmpty) throw new RuntimeException("Lists do not have sam elength")
      else new Cons(zip(h, list.head), t.zipWith(list.tail,zip))
    }

    override def fold[B](start: B)(operator: (B, A) => B): B = {
      val newStart = operator(start, h)
      t.fold(newStart)(operator)
    }
  }


}
