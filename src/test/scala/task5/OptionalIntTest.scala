package task5

import org.junit.*
import org.junit.Assert.*
import Optionals.*

class OptionalIntTest:
  @Test def emptyOptionalShouldBeEmpty(): Unit =
    val empty = OptionalInt.Empty()
    assertTrue(OptionalInt.isEmpty(empty))

  @Test def nonEmptyOptionalShouldNotBeEmpty(): Unit =
    val nonEmpty = OptionalInt.Just(0)
    assertFalse(OptionalInt.isEmpty(nonEmpty))

  @Test def orElseShouldReturnDefaultWhenEmpty(): Unit =
    val nonEmpty = OptionalInt.Just(0)
    assertEquals(0, OptionalInt.orElse(nonEmpty, 1))

  @Test def orElseShouldReturnValueWhenNonEmpty(): Unit =
    val empty = OptionalInt.Empty()
    assertEquals(1, OptionalInt.orElse(empty, 1))

  @Test def testEmptyMapInt(): Unit =
    val empty = OptionalInt.Empty()
    assertEquals(OptionalInt.Empty(), OptionalInt.mapInt(empty)(_ + 1))

  @Test def testJustMapInt(): Unit =
    val just = OptionalInt.Just(2)
    assertEquals(OptionalInt.Just(3), OptionalInt.mapInt(just)(_ + 1))

  @Test def testEmptyFilter(): Unit =
    val empty = OptionalInt.Empty()
    assertEquals(OptionalInt.Empty(), OptionalInt.filter(empty)(_ == 2))

  @Test def testJustFilter(): Unit =
    val just = OptionalInt.Just(3)
    assertEquals(OptionalInt.Empty(), OptionalInt.filter(just)(_ > 4))
    assertEquals(OptionalInt.Just(3), OptionalInt.filter(just)(_ > 2))