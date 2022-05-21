import scala.util.Random

object ArraysAwesome extends App {

  var nums = Array(1, 2, 3, 4)
  val treeElems = Array.ofDim[Int](3)
  treeElems.foreach(println) //0 for primitves, null for others

  //mutations
  nums(2) = 88 //syntatic sugar for nums.update(2,88)
  println(nums.mkString(" "))

  val numSeq: Seq[Int] = nums //implicit conversions
  println(numSeq)

  //Vectors (Immutable sequences)

  val vector: Vector[Int] = Vector(1, 2, 3)
  println(vector)

  //vec v List

  val maxRuns = 1000
  val maxCapacity = 10000000

  def getWriteTime(collection: Seq[Int]): Double = {
    var r = new Random
    val times = for {
      it <- 1 to maxRuns
    } yield {
      val currentTime = System.nanoTime()
      collection.updated(r.nextInt(maxCapacity), r.nextInt()) //performs operation
      System.nanoTime() - currentTime
    }
    times.sum * 1.0 / maxRuns //avg time
  }

  val numsList = (1 to maxCapacity).toList
  val numsVector = (1 to maxCapacity).toVector

  //list keeps reference to tails. For vectors, depth of tree is small. Updating a elem in the middle for list takes a long time.

  println(getWriteTime(numsList))
  println(getWriteTime(numsVector))
}
