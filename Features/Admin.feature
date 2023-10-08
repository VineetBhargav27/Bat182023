Feature:Admin
@smoke
Scenario: Login with Valid Crendential
Given User Launch the chrome browser
When User open url "https://admin-demo.nopcommerce.com/login"
When user enter email	 as " admin@yourstore.com" and password as "admin"
When user click on login button
Then user verify page title should be "Dashboard / nopCommerce administration"
Then close the browser

@sanity
Scenario Outline: Login with Data Driven 
Given User Launch the chrome browser
When User open url "https://admin-demo.nopcommerce.com/login"
When user enter email	 as "<email>" and password as "<password>"
When user click on login button
Then user verify page title should be "Dashboard / nopCommerce administration"
Then close the browser

Examples:
|email                 |  password|
|admin@yourstore.com   |admin     |
|admin123@yourstore.com|admin123  |