package task4

import scala.annotation.tailrec

object Expressions:

    enum Expr:
        case Literal(value: Int)
        case Add(e1: Expr, e2: Expr)
        case Multiply(e1: Expr, e2: Expr)
        
    def evaluate(e: Expr): Int = e match
        case Expr.Literal(v) => v
        case Expr.Add(e1, e2) => evaluate(e1) + evaluate(e2)
        case Expr.Multiply(e1, e2) => evaluate(e1) * evaluate(e2)

    def show(e: Expr): String = e match
        case Expr.Literal(v) => v.toString
        case Expr.Add(e1, e2) => "(" + show(e1) + " + " + show(e2) + ")"
        case Expr.Multiply(e1, e2) => "(" + show(e1) + " * " + show(e2) + ")"