object Sequences extends App{

val someSeq = Seq(1,5,3,2)
println(someSeq)
println(someSeq.reverse)
println(someSeq(2))
println(someSeq ++ Seq(69,70,711)) //to concatenate
println(someSeq.sorted)

val genRnage: Seq[Int] = 1 until 10
genRnage.foreach(println)

  (1 to 69).foreach(x => println("Ola Amigos!")) //prints ola amigos 69 times
}
