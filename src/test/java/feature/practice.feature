Feature: Practise Automation

	Scenario: Login to Rahul Shetty Academy
		Given User have the rsa url
		When User navigate to RSA url User can see login section
		Then User enters valid email and password details 
	      | name  								|  password		    |
	      | john.smith123@gmail.com 			|  Johnsmith@123    |		
		Then User is able to navigate to the homepage
	      