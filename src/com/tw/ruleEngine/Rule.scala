package com.tw.ruleEngine

import java.util.function.Predicate

trait Rule[T] extends Predicate[T]

object Rule {

  implicit def convertToRule[T](f: T => Boolean): Rule[T] = {
    new Rule[T] {
      override def test(t: T): Boolean = f(t)
    }
  }
}