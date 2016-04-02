import com.tw.loanapplication.data.ExistingApplication
import com.tw.loanapplication.existingApplicationCheckRuleEngine.{ExistingApplicationCheckRules, ExistingApplicationRuleChecker}
import com.tw.numberrange.numberRangeCheckRuleEngine.{NumberRangeCheckRules, NumberRangeRuleChecker}
import com.tw.ruleEngine.Rules

object MainClient extends App {

  val inProgressExistingApplication = ExistingApplication("IN_PROGRESS")
  val onHoldExistingApplication = ExistingApplication("ON_HOLD")

  val existingApplicationChecker = new ExistingApplicationRuleChecker
  val existingApplicationCheckRules = new ExistingApplicationCheckRules

  assert(existingApplicationChecker.isSatisfyingAllRules(
    existingApplicationCheckRules, inProgressExistingApplication
  ).equals(true))

  assert(existingApplicationChecker.isSatisfyingAllRules(
    existingApplicationCheckRules, onHoldExistingApplication
  ).equals(false))

  
  val lessThan5Number = 4
  val greaterThan5AndLessThan10Number = 7
  val greaterThan10Number = 12
  
  val numberRangeRuleChecker = new NumberRangeRuleChecker
  val numberRangeRules = new NumberRangeCheckRules
  
  assert(numberRangeRuleChecker.isSatisfyingAllRules(
    numberRangeRules, lessThan5Number
  ).equals(false))

  assert(numberRangeRuleChecker.isSatisfyingAllRules(
    numberRangeRules, greaterThan10Number
  ).equals(false))

  assert(numberRangeRuleChecker.isSatisfyingAllRules(
    numberRangeRules, greaterThan5AndLessThan10Number
  ).equals(true))
}
