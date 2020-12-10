@WishlistAfterLogin 
Feature: Wishlist Only Works After Login Functionality 

Background: 
	Given the user is on the website page 
	
Scenario: 

	Then Move your cursor over women's link 
	Then Click on sub menu T-shirts 
	Then Mouse hover on the first product displayed 
	Then User clicks on Add to Wishlist
	Then Verify that error message is displayed - You must be logged in to manage your wishlist