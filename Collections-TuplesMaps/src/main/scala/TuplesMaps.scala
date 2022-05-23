object TuplesMaps extends App {

  //Tuple
  //finite ordered lists

  val myTUp = new Tuple2(2,"Die Hard")

  println(myTUp)
  println(myTUp._1) //prints first elem
  println(myTUp.copy(_2 = "Lalle"))
  println(myTUp.swap)

  //Maps - keys -> Values
  val myMap: Map[String, Int] = Map()//string is key , int - value

  val myContacts = Map(("Andy",888291), ("Robert California",2991002), "Michael Scott"->7812992).withDefaultValue(-1) //michael scott one is similar but synctatic sugar
  println(myContacts)

  println(myContacts.contains("Andy"))
  println(myContacts("Lalle")) //exception generated. To avoid use withdefaultValue

  //pairing
  val newContact = "Pam" -> 8829100
  val newContacts = myContacts + newContact //maps are immutable hence new contacts
  println(newContacts)

  //map, filter

  println(myContacts.map(pair => pair._1.toLowerCase -> pair._2))
  println(myContacts.view.filterKeys(x => x.startsWith("M")).toMap) //contacts only with M

  //MapValues
  println(myContacts.view.mapValues(number => "+91" + number).toMap) // adds a 0 to the INT value whcih is Phone No

  //Maps to List
  println(myContacts.toList)
  print(List(("John Doe" -> 12333, "Jane Doe" -> 128831)).toMap)

  val myNames = List("Prakash","Bajaj","Maharaja","Simon")
  println(myNames.groupBy(name => name.charAt(0)))
}
