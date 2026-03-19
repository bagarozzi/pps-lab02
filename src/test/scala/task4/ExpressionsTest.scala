package task4

import org.junit.*
import org.junit.Assert.*
import Expressions.*
import task4.Expressions.Expr.Literal

class ExpressionsTest:
    @Test def testEvaluateLiteral(): Unit =
        val lit = Expr.Literal(2)
        assertEquals(evaluate(lit), 2)

    @Test def testEvaluateAdd(): Unit =
        val sum = Expr.Add(Expr.Literal(2), Expr.Literal(2))
        assertEquals(evaluate(sum), 4)

    @Test def testEvaluateMultiply(): Unit =
        val mul = Expr.Multiply(Literal(2), Expr.Literal(2))
        assertEquals(evaluate(mul), 4)

    @Test def testShowExpression(): Unit =
        val lit = Expr.Literal(2)
        val expression = Expr.Multiply(Expr.Add(lit, lit), Expr.Add(lit, lit))
        println(show(expression))

