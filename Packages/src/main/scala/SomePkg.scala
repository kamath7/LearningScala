import Lalle.{Fiona, Lallex, hello}

import java.io.Writer

object SomePkg extends App{

  val myLalle = new Lallex.Person("JJ",2000)
  hello //package objects

  val awesome = new Fiona
  //packages ordered hierarchically. match folder structure
}
