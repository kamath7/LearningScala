object MyOO extends App {

  val doctor = new Person("SomeDude",25)

  println(doctor)
  println(doctor.name)
  //println(doctor.age) - invalid since not a field
  println(doctor.x)
  println(doctor.greets("Val"))
  doctor.greets()
}

class Person(val name: String, age: Int = 0){ //defining a constructor . Default parameters also added
  //before instantion whole code block gets executed
  val x = 2

  println(x+1)

  def greets(name:String):Unit = println(s"${this.name} says hello to $name!")

  //overloading method
  def greets():Unit = println(s"${this.name} greets John Doe!")
  //another constructor

  def this(name:String) = this(name, 0) //same as in JAVA. DO NOT USE THIS!!
}

//class parameters cannot be accessed with . since they are not fields. to use add val to make them fieldss