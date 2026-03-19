package task3

object Recursion extends App:
  def power(base: Double, exponent: Int): Double = exponent match
      case 0 => 1.0
      case 1 => base
      case n if n > 1 => base * power(base, exponent - 1)

  println(power(2.0, 0))
  println(power(2.0, 1))
  println(power(2.0, 3)) // 8
  println(power(3.0, 2)) // 2