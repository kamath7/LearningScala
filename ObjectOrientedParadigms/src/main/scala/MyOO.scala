object MyOO extends App {

  val doctor = new Person("SomeDude",25)

  println(doctor)
  println(doctor.name)
  //println(doctor.age) - invalid since not a field
  println(doctor.x)
  println(doctor.greets("Val"))
}

class Person(val name: String, age: Int){ //defining a constructor
  //before instantion whole code block gets executed
  val x = 2

  println(x+1)

  def greets(name:String):Unit = println(s"${this.name} says hello to $name!")
}

//class parameters cannot be accessed with . since they are not fields. to use add val to make them fieldss