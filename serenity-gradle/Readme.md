Serenity.properties:
webdriver.autodownload : Set to false if you don’t want Serenity to automatically download driver binaries for local runs.
webdriver.base.url : The default starting URL for the application, and base URL for relative paths.
webdriver.timeouts.implicitlywait : How long webdriver waits for elements to appear by default, in milliseconds.
webdriver.wait.for.timeout : How long webdriver waits by default when you use a fluent waiting method, in milliseconds.
webdriver.chrome.driver : Path to the Chrome driver, if it is not on the system path.
serenity.outputDirectory : Where should reports be generated.
serenity.take.screenshots : 
    serenity.take.screenshots=BEFORE_AND_AFTER_EACH_STEP This property can take the following values:
    FOR_EACH_ACTION: Saves a screenshot at every web element action (like click(), typeAndEnter(), type(), typeAndTab() etc.).
    BEFORE_AND_AFTER_EACH_STEP: Saves a screenshot before and after every step.
    AFTER_EACH_STEP: Saves a screenshot after every step
    FOR_FAILURES: Saves screenshots only for failing steps.
    DISABLED: Doesn’t save screenshots for any steps.

serenity.full.page.screenshot.strategy
    Set this property to have full page screenshot support. This property can take the following values:
    true: Enables WHOLE_PAGE screenshot mode.
    false: Enables VIEWPORT_ONLY screenshot mode. (default)

serenity.step.delay : Pause (in ms) between each test step.
serenity.timeout : How long should the driver wait for elements not immediately visible, in milliseconds.
serenity.browser.width
serenity.browser.height : Resize the browser to the specified dimensions, in order to take larger screenshots. This should work with Internet Explorer and Firefox, but not with Chrome.

serenity.use.unique.browser : Set this to true for running all web tests in a single browser, for one test. Can be used for configuring Junit and Cucumber, default value is 'false'.
restart.browser.each.scenario : Set this to false for running all web tests in same story file with one browser, can be used when Jbehave is used. default value is 'false'
serenity.restart.browser.for.each : Indicate when a browser should be restarted during a test run. Can be one of: scenario, story, feature, never

jira.url : If the base JIRA URL is defined, Serenity will build the issue tracker url using the standard JIRA form.
jira.project : If defined, the JIRA project id will be prepended to issue numbers.
jira.username : If defined, the JIRA username required to connect to JIRA.
jira.password : If defined, the JIRA password required to connect to JIRA.