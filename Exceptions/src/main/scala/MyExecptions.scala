object MyExecptions extends App {

  // will crash -> val x:String = null


  val weirdVal = throw new NullPointerException("Null") //doesn't hold a val but can be assigned to others
  //throwable classes extend Throwable. Exception and Error are major Throwable

  //catching exceptions

  def getInt(nExceptionParam: Boolean): Int =
    if(nExceptionParam) throw  new RuntimeException("No cookie for you ")
    else 69



}
