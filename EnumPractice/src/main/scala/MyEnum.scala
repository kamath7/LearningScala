object MyEnum extends App{
  enum Perms{
    case READ, WRITE, EXECUTE, NONE
    def openDoc() : Unit =
      if (this == READ) println("READING!!")
      else println("READING DENIED!")
  }



  val somePerms:Perms = Perms.READ

  //constructor

  enum  PermissionsWithBits(bits: Int){
    case READ extends PermissionsWithBits(4)
    case WRITE extends  PermissionsWithBits(69)
    case EXECUTE extends PermissionsWithBits(50)
    case NONE extends PermissionsWithBits(22)

  }
  somePerms.openDoc()

  object PermissionsWithbits {
    def fromBits(bit: Int) : PermissionsWithBits = PermissionsWithBits.WRITE
  }

  val somePermOrdinal = somePerms.ordinal
  println(somePermOrdinal)

  val allPerms = PermissionsWithBits.values
  print(allPerms)
  val readPerm: Perms = Perms.valueOf("READ")
  println(readPerm)
}
