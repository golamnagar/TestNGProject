package Test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class TestNG1 {
  @Test
  public void Fist() {
	  System.out.println("This is the first test case2");
	  
  }
  @Test
  public void Second() {
	  System.out.println("This is the second test case3");
	  
  }
  @Test
  public void Third() {
	  System.out.println("This is the second test case3");
	  
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("This print first1");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("This prin After TEst4");
  }

}
