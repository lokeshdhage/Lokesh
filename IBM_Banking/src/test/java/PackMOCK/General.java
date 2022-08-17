package PackMOCK;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class General {
    @BeforeClass
    public void beforeClass() {
	
	 System.out.println("before class");
}

    @BeforeMethod
    public void beforeMethod() {
	
	  System.out.println("before Method");
}

   @Test //(invocationCount = 3 , priority = 4)
    public void testA() {
	System.out.println("test A");
	
 }  

   @Test  //(priority = 3, dependsOnMethods = {"testD"} , alwaysRun = true)
   public void testB()  { 
	System.out.println("test B"); 
}
   
   @Test   //(priority = 3)
   public void testC()  { 
	System.out.println("test C"); 
}
   
   @Test   //(priority = 6 , timeOut = 3000)
   public void testD() throws InterruptedException  { 
	System.out.println("test D"); 
	//Thread.sleep(5000);
	//Assert.fail();
}
   

  @AfterMethod
  public void afterMethod() {
	
	System.out.println("after method");
}

  @AfterClass
  public void afterClass() {
	  
	 System.out.println("after class");

}
    
    

}
