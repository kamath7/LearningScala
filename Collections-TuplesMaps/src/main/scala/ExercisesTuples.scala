import TuplesMaps.myContacts

object ExercisesTuples extends App{

  val someContacts = Map(("Jim" -> 1234), ("Jim"-> 9000))

  println(someContacts.map(pair => pair._1.toLowerCase -> pair._2)) //use unique keys


  def add(network: Map[String, Set[String]], person:String) : Map[String, Set[String]] = {
    network + (person -> Set())
  }

  def friend(network: Map[String, Set[String]], a: String, b:String ):Map[String, Set[String]] = {
    val friendsA = network(a)
    val friendsB = network(b)

    network + (a -> (friendsA + b)) + (b -> (friendsB + a))
  }

  def unfriend (network: Map[String, Set[String]], a: String, b: String): Map[String, Set[String]] = {
    val friendsA = network(a)
    val friendsB = network(b)
    network + (a -> (friendsA - b) + (b -> (friendsB - a)))
  }

  def remove(network: Map[String, Set[String]] ,person: String): Map[String, Set[String]] = {
    def removeAux (friends: Set[String], networkAcc: Map[String, Set[String]]): Map[String, Set[String]] ={
      if (friends.isEmpty) networkAcc
      else removeAux(friends.tail, unfriend(networkAcc, person, friends.head))
    }
    val unfriended = removeAux(network(person), network)
    unfriended - person
  }

}
