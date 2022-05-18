object CurriedAdder extends App{
  val curAdd = (x:Int) => (y:Int) => x + y

  print(curAdd(68)(1))
}
