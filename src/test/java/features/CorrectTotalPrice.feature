@TotalPrice
Feature: Buy Order Functionality 

Background: 
	Given the user is on the website page 
	
Scenario Outline: 
	When User clicks sign in button 
	Then User enters username "<username>" and password "<password>" and click login 
	Then Move your cursor over women's link 
	Then Click on sub menu T-shirts 
	Then Mouse hover on the first product displayed 
	Then More button will be displayed click on More button 
	Then Make sure quantity is set to one Select size M Select color 
	Then Click add to cart 
	Then Click procees to checkout 
	Then Change the quantity to two Verify that Total price is changing and reflecting correct price

	
	Examples: 
		|username|password|
		|samsal81@usa.com|abc123|
		