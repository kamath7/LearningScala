object OOPExercises extends App {

  //Exercise 1
  val author1 = new Writer("Agatha", "Christie", 1900)
  val novel1 = new Novel("And then there were none", 1945, author1)
  print(novel1.authorAge)
  print(novel1.isWrittenBy(author1))


}

class Writer(firstName: String, lastName: String, val year: Int) {
  def fullName(): String = (s"$firstName $lastName")
}

class Novel(name: String, year: Int, author: Writer) {
  def authorAge = year - author.year

  def isWrittenBy(author: Writer) = author == this.author

  def copy(newYear: Int): Novel = new Novel(name, newYear, author)
}