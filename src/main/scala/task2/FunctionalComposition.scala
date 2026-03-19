package task2

object FunctionalComposition extends App:
  def compose(f: Int => Int, g: Int => Int): Int => Int = x => f(g(x))

  // alternative, using a function literal
  val compose2: (Int => Int, Int => Int) => Int => Int = (f, g) => x => f(g(x))
  val compose3 = (f: Int => Int, g: Int => Int) => (x: Int) => f(g(x))
  val compose4: (Int => Int) => (Int => Int) => (Int => Int) = f => g => x => f(g(x))

  // testing
  println(compose(_ - 1, _ * 2)(5)) // 9
  println(compose2(_ - 1, _ * 2)(5)) // 9
  println(compose3(_ - 1, _ * 2)(5)) // 9
  println(compose4(_ - 1)(_ * 2)(5)) // 9