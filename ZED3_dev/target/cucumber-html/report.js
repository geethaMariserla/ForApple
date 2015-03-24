$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("com/demo/features/ecommerce/task1.feature");
formatter.feature({
  "id": "registering-for-a-website",
  "description": "",
  "name": "Registering for a website",
  "keyword": "Feature",
  "line": 2
});
formatter.scenario({
  "id": "registering-for-a-website;registering-developed;;2",
  "tags": [
    {
      "name": "@run",
      "line": 3
    }
  ],
  "description": "",
  "name": "Registering developed",
  "keyword": "Scenario Outline",
  "line": 13,
  "type": "scenario"
});
formatter.step({
  "name": "I launch the home page for \"TC_01_SigningUp\"",
  "keyword": "Given ",
  "line": 5,
  "matchedColumns": [
    0
  ]
});
formatter.step({
  "name": "I click on signup button",
  "keyword": "When ",
  "line": 6
});
formatter.step({
  "name": "I enter firstnam lastname email",
  "keyword": "And ",
  "line": 7
});
formatter.step({
  "name": "success message should be displayed after signupbutton is clicked",
  "keyword": "Then ",
  "line": 8
});
formatter.step({
  "name": "close the browser",
  "keyword": "Then ",
  "line": 9
});
formatter.match({
  "arguments": [
    {
      "val": "TC_01_SigningUp",
      "offset": 28
    }
  ],
  "location": "task1steps.i_launch_the_home_page_for(String)"
});
formatter.result({
  "duration": 12010416258,
  "status": "passed"
});
formatter.match({
  "location": "task1steps.i_click_on_signup_button()"
});
formatter.result({
  "duration": 2301691289,
  "status": "passed"
});
formatter.match({
  "location": "task1steps.i_enter_firstnam_lastname_email()"
});
formatter.result({
  "duration": 1704038399,
  "status": "failed",
  "error_message": "java.lang.RuntimeException: java.lang.NullPointerException\r\n\tat jxl.write.biff.File.write(File.java:148)\r\n\tat jxl.write.biff.WritableWorkbookImpl.write(WritableWorkbookImpl.java:624)\r\n\tat com.demo.framework.ZED3ExcelOperations.putData(ZED3ExcelOperations.java:63)\r\n\tat com.demo.pages.Task1pages.enterDetails(Task1pages.java:55)\r\n\tat com.demo.steps.task1steps.i_enter_firstnam_lastname_email(task1steps.java:56)\r\n\tat ✽.And I enter firstnam lastname email(com/demo/features/ecommerce/task1.feature:7)\r\nCaused by: java.lang.NullPointerException\r\n\tat jxl.write.biff.File.write(File.java:134)\r\n\tat jxl.write.biff.WritableWorkbookImpl.write(WritableWorkbookImpl.java:624)\r\n\tat com.demo.framework.ZED3ExcelOperations.putData(ZED3ExcelOperations.java:63)\r\n\tat com.demo.pages.Task1pages.enterDetails(Task1pages.java:55)\r\n\tat com.demo.steps.task1steps.i_enter_firstnam_lastname_email(task1steps.java:56)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(Unknown Source)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(Unknown Source)\r\n\tat java.lang.reflect.Method.invoke(Unknown Source)\r\n\tat cucumber.runtime.Utils$1.call(Utils.java:34)\r\n\tat cucumber.runtime.Timeout.timeout(Timeout.java:13)\r\n\tat cucumber.runtime.Utils.invoke(Utils.java:30)\r\n\tat cucumber.runtime.java.JavaStepDefinition.execute(JavaStepDefinition.java:35)\r\n\tat cucumber.runtime.StepDefinitionMatch.runStep(StepDefinitionMatch.java:37)\r\n\tat cucumber.runtime.Runtime.runStep(Runtime.java:297)\r\n\tat cucumber.runtime.model.StepContainer.runStep(StepContainer.java:44)\r\n\tat cucumber.runtime.model.StepContainer.runSteps(StepContainer.java:39)\r\n\tat cucumber.runtime.model.CucumberScenario.run(CucumberScenario.java:48)\r\n\tat cucumber.runtime.junit.ExecutionUnitRunner.run(ExecutionUnitRunner.java:83)\r\n\tat org.junit.runners.Suite.runChild(Suite.java:127)\r\n\tat org.junit.runners.Suite.runChild(Suite.java:26)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:238)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:63)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:236)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:53)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:229)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:309)\r\n\tat org.junit.runners.Suite.runChild(Suite.java:127)\r\n\tat org.junit.runners.Suite.runChild(Suite.java:26)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:238)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:63)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:236)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:53)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:229)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:309)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:63)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:18)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:238)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:63)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:236)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:53)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:229)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:309)\r\n\tat cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:70)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:89)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:40)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:238)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:63)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:236)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:53)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:229)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:309)\r\n\tat cucumber.api.junit.Cucumber.run(Cucumber.java:94)\r\n\tat org.eclipse.jdt.internal.junit4.runner.JUnit4TestReference.run(JUnit4TestReference.java:50)\r\n\tat org.eclipse.jdt.internal.junit.runner.TestExecution.run(TestExecution.java:38)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:467)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:683)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.run(RemoteTestRunner.java:390)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.main(RemoteTestRunner.java:197)\r\n"
});
formatter.match({
  "location": "task1steps.success_message_should_be_displayed()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "task1steps.close_the_browser()"
});
formatter.result({
  "status": "skipped"
});
});