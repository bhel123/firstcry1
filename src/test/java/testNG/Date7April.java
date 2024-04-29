package testNG;

import org.testng.annotations.Test;

public class Date7April {
//  @Test(groups= {"signup"} , priority=5)
//  public void signup() {
//	  System.out.println(" this is signup module ");
//  }
//  @Test(groups= {"Forgot"} , priority= 2 )
//  public void forgot() {
//	  System.out.println(" this is forgot module ");
//  }
//  @Test(groups= {"add to cart"} , priority=3)
//  public void addtocart() {
//	  System.out.println(" this is addtocart module ");
//  }
//  @Test(groups= {"order"} , priority=-1)
//  public void order() {
//	  System.out.println(" this is order module ");
//  
	@Test(groups= {"signup"} , enabled= false)
	  public void signup() {
		  System.out.println(" this is signup module ");
	  }
	  @Test(groups= {"Forgot"} , priority=2)
	  public void forgot() {
		  System.out.println(" this is forgot module ");
	  }
	  @Test(groups= {"add to cart"} , priority=-1)
	  public void addtocart() {
		  System.out.println(" this is addtocart module ");
	  }

}
