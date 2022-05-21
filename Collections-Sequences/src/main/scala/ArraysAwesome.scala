object ArraysAwesome extends App{

var nums = Array (1,2,3,4)
val treeElems = Array.ofDim[Int](3)
treeElems.foreach(println) //0 for primitves, null for others

//mutations
nums(2) = 88 //syntatic sugar for nums.update(2,88)
println(nums.mkString(" "))

val numSeq: Seq[Int] = nums //implicit conversions
println(numSeq)
}
