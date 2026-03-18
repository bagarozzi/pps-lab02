package task3

object FunctionsTask extends App

  def signToString(n: Int): String = n match
    case n if n >= 0 => "positive"
    case _ => "negative"

  // As a Function literal
  val singToStringLit = (n:Int) => n match
    case n if n >= 0 => "positive"
    case _ => "negative"

  // Option 2:
  val singToStringLambda: Int => String = n => n match
    case n if n >= 0 => "positive"
    case _ => "negative"

  // IntelliJ suggest this
  val singToStringLambda2: Int => String = {
    case n if n >= 0 => "positive"
    case _ => "negative"
  }


