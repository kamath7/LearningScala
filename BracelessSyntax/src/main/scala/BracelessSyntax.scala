object BracelessSyntax extends App {

  //if regular
  val ifExpr = if ( 2 > 3) "awesome" else "not awesome"
  //compact
  val ifExpr2 =
    if (2 > 3) "awesome"
    else "not awesome"

  //braceless
  val ifExpr3 =
    if 2 > 3 then
      "awesome"
    else
      "not awesome"

}
