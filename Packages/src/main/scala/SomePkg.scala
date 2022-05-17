import Lalle.{Fiona, Lallex, hello}

import java.io.Writer
import java.sql
import java.util.Date
import java.sql.Date
import java.util.{UUID => IDGen}
object SomePkg extends App{

  val myLalle = new Lallex.Person("JJ",2000)
  hello //package objects

  val awesome = new Fiona
  //packages ordered hierarchically. match folder structure

  val myDate = new Date() //takes the new one
  val sqlDate = new sql.Date() //takes the sql date but need to mention it fully
  val myId = new IDGen(12,2) //aliasing

  //default imports - java.lang
}
