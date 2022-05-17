object MyEnum extends App{
  enum Perms{
    case READ, WRITE, EXECUTE, NONE
  }

  val somePerms:Perms = Perms.READ


}
