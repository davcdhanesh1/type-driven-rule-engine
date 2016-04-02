package com.tw.numberrange.numberRangeCheckRuleEngine

import com.tw.ruleEngine.{Rule, Rules}

class NumberRangeCheckRules extends Rules[Integer] {

  override def all: Seq[Rule[Integer]] = List(
    numberShouldBeGreaterThan5 _,
    numberShouldBeLessThan10 _
  )

  def numberShouldBeGreaterThan5(number: Integer) = number > 5

  def numberShouldBeLessThan10(number: Integer) = number < 10
}
