package microsoft;

import org.junit.jupiter.api.*;
import org.junit.Test;
import utilities.*;

public class MicrosoftTest extends Utilities {
	
	Microsoft_Elements ms_ele = new Microsoft_Elements(driver);
	Microsoft_Methods ms_meth = new Microsoft_Methods();
	MicrosoftTest msTest = new MicrosoftTest();
	
	

	@BeforeEach
	public void openPage () throws Throwable {
		System.out.println("Print");
		getDriver().get("https://www.microsoft.com/es-mx/");
	}
	
	@Test
	public void AddDeleteItemCartTest_01 () {
		
		System.out.println("Print test");
		
	    //When I go to windows section
		ms_meth.clickOn_WindowsLink();
		
		//msTest.waitForElement();
	    
		// And I go to search option
	    
		//And I search for "Xbox"
	    
		//And I click on "Comprar" button
	    
//	    And In the result page I click on the "Elementos de avatar"
//	    
//	    And Count the elements on the first three pages
//	    
//	    And Print the sum of the elements
//	    
//	    And Print the titles of the elements
//	    
//	    And Go to the page "1" from "Elementos de avatar" page
//	    
//	    And Store the price of the first non-free option
//	    
//	    And Click on the fisrt non-free option
//	    
//	    And Close the registration popup if displayed
//	    
//	    And Current price match with the first price
//	    
//	    And Click on the "3 dot" button
//	    
//	    And Add the item to the cart
//	    
//	    And Click on the Cart button
//	    
//	    Then You have "1" elements available
//	    
//	    When Item is deleted
//	    
//	    Then Message "Tu carro está vacío" is displayed
//	    
//	    And You have "0" elements available
	    
		
	}


}
