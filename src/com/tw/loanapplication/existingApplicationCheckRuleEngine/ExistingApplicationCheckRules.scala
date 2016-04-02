package com.tw.loanapplication.existingApplicationCheckRuleEngine

import com.tw.loanapplication.data.ExistingApplication
import com.tw.ruleEngine.Rules
import com.tw.ruleEngine.Rule

class ExistingApplicationCheckRules extends Rules[ExistingApplication] {

  def existingApplicationShouldHaveInProgressStatus(existingApplication: ExistingApplication) = {
    existingApplication.status == "IN_PROGRESS"
  }

  override def all: Seq[Rule[ExistingApplication]] = List(
    existingApplicationShouldHaveInProgressStatus _
  )
}
