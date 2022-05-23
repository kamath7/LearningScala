import TuplesMaps.myContacts

object ExercisesTuples extends App {

  val someContacts = Map(("Jim" -> 1234), ("Jim" -> 9000))

  println(someContacts.map(pair => pair._1.toLowerCase -> pair._2)) //use unique keys


  def add(network: Map[String, Set[String]], person: String): Map[String, Set[String]] = {
    network + (person -> Set())
  }

  def friend(network: Map[String, Set[String]], a: String, b: String): Map[String, Set[String]] = {
    val friendsA = network(a)
    val friendsB = network(b)

    network + (a -> (friendsA + b)) + (b -> (friendsB + a))
  }

  def unfriend(network: Map[String, Set[String]], a: String, b: String): Map[String, Set[String]] = {
    val friendsA = network(a)
    val friendsB = network(b)
    network + (a -> (friendsA - b)) + (b -> (friendsB - a))
  }

  def remove(network: Map[String, Set[String]], person: String): Map[String, Set[String]] = {
    def removeAux(friends: Set[String], networkAcc: Map[String, Set[String]]): Map[String, Set[String]] = {
      if (friends.isEmpty) networkAcc
      else removeAux(friends.tail, unfriend(networkAcc, person, friends.head))
    }

    val unfriended = removeAux(network(person), network)
    unfriended - person
  }

  val empty: Map[String, Set[String]] = Map()
  val network = add(add(empty, "Janes"), "Janus")
  println(network)
  println(friend(network, "Janes", "Janus"))

  println(unfriend(friend(network, "Janes", "Janus"), "Janes", "Janus"))
  print(remove(friend(network, "Janes", "Janus"), "Janes"))

  val people = add(add(add(empty, "Luke"), "Darth"), "Kylo")
  val lukeDarth = friend(people, "Luke", "Darth")
  val test1 = friend(people, "Luke", "Kylo")

  println(test1)

  def noOfFriends(network: Map[String, Set[String]], person: String): Int = {
    if (!network.contains(person)) 0
    else (network(person).size)
  }

  println(noOfFriends(test1, "Kylo"))

  def maxFriends(network: Map[String, Set[String]]): String = {
    network.maxBy(pair => pair._2.size)._1
  }

  println(maxFriends(network))

  def noFriends(network: Map[String, Set[String]]): Int = {
    network.view.filterKeys(k => network(k).isEmpty).size
  }

  println(noFriends(test1))
}
