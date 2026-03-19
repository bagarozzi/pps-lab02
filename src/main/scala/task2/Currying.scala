package task2

object Currying extends App:

  // Using val, curried and non-curried
  val p1: Int => Int => Int => Boolean = x => y => z => (x <= y) && (y == z)
  val p2: (Int, Int, Int) => Boolean = (x,y,z) => (x <= y) && (y == z)

  // Using def, curried and non-curried
  def p3(x: Int)(y: Int)(z: Int): Boolean = (x <= y) && (y == z)
  def p4(x: Int, y: Int, z: Int): Boolean = (x <= y) && (y == z)

  // Testing p1-p4
  println(p1(10)(20)(20)) // true
  println(p2(10, 20, 20)) // true
  println(p3(10)(20)(20)) // true
  println(p4(10, 20, 20)) // true

