package com.tw.ruleEngine

trait RuleChecker[T] {

  def isSatisfyingAllRules(rules: Rules[T], data: T): Boolean = {
    rules.all.forall(rule => rule.test(data))
  }

}
