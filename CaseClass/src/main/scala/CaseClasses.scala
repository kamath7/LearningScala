object CaseClasses extends App{

  case class Person(name: String, age:Int)

  //what case does -> class paramaters are fields, better toString, eqals and and hascode implemented, copy method, companion objs, serialisable

  val andy = new Person("Andy",34)
  println(andy.name)
  println(andy.toString)
  println(andy) //synctatic sugar for object.tostring

  val andy2 = new Person("Andy",34)
  println(andy == andy2)

  val andy3 = andy.copy(age= 69) //new instance with age = 45

  var person = Person
  val mary = Person("Mary",23) //is really Person.apply("Mary", 23)

  //case can be used in pattern matches

  case object Lalle {
    def name: String = "Lalle is my name, lalle is my game"
  }
}
