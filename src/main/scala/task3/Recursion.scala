package task3

import scala.annotation.tailrec

object Recursion extends App:
  def power(base: Double, exponent: Int): Double = exponent match
      case 0 => 1.0
      case 1 => base
      case n if n > 1 => base * power(base, exponent - 1)

  println(power(2.0, 0)) // 1
  println(power(2.0, 1)) // 2
  println(power(2.0, 3)) // 8
  println(power(3.0, 2)) // 2

  def tailPower(base: Double, exponent: Int): Double =
    @tailrec
    def recursivePower(base: Double, exponent: Int, result: Double): Double = exponent match
      case 0 => result
      case n if n > 0 => recursivePower(base, exponent - 1, result * base)
    recursivePower(base, exponent, 1.0)

  println("Tail recursion: ")
  println(tailPower(2.0, 0)) // 1
  println(tailPower(2.0, 1)) // 2
  println(tailPower(2.0, 3)) // 8
  println(tailPower(3.0, 2)) // 9

  //def digitReverse(number: Int): Int = number match
  //  case