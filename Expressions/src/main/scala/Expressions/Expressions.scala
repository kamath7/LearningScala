package Expressions

object Expressions extends App{

  val x = 1 + 68 //expression

  println(x)

  println(2 * 34 + 1)

  println(1 == 2)

  println(!(1 == x))

  var myAwesomeVar: Int = 20
  myAwesomeVar +=1
  println(myAwesomeVar)

  val someCond = true
  val condVal = if(someCond) 69 else 50
  print(condVal)


  var myAwesomeLoopVar = 1

  while(myAwesomeLoopVar < 10){
    println(myAwesomeLoopVar)
    myAwesomeLoopVar += 1
  }

  //dont write the above. part of imperative programming
  //write expressions instead

  val aWhile =  while(myAwesomeLoopVar < 10){
    println(myAwesomeLoopVar)
    myAwesomeLoopVar += 1
  }

  val someCodeBlock = {
    val x = 2
    val ss= 22
    if (ss > 2) "Awesome" else "Buzz"
  }

  //println(ss) - > won't work. since scope is limited to someCodeBlock
  println(someCodeBlock)
  println(aWhile)
}
