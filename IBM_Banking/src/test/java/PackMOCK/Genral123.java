package PackMOCK;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Genral123 {

    @BeforeClass
    public void beforeClass() {
	
	System.out.println("before class123");
}

@BeforeMethod
public void beforeMethod() {
	
	System.out.println("before Method123");
}

@Test 
public void testA() {
	System.out.println("test A123");
	
	
}

@Test   
public void testB()  { 
	System.out.println("test B123"); 
	
}
   

@AfterMethod
public void afterMethod() {
	
	System.out.println("after method123");

}

@AfterClass
public void afterClass() {
	System.out.println("after class123");

}


}
