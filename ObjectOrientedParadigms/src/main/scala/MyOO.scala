object MyOO extends App {

  val doctor = new Person("SomeDude",25)

  println(doctor)
  println(doctor.name)
  //println(doctor.age) - invalid since not a field

}

class Person(val name: String, age: Int){ //defining a constructor

}

//class parameters cannot be accessed with . since they are not fields. to use add val to make them fieldss