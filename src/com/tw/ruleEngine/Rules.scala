package com.tw.ruleEngine

trait Rules[T]  {
  def all: Seq[Rule[T]]
}