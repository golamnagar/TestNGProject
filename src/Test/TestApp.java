package Test;

import org.testng.annotations.Test;

public class TestApp {
	
	@Test(priority=0)
	
	public void print(){
		
	String	sam = "My name is Golam M Hassan";
		System.out.println(sam);
		
	}
 @Test(priority=1)
 
 public void sum(){
	 System.out.println("Print Sum");
	 
 }
 @Test(priority=2)
 public void multi(){
	 System.out.println("Print multi");
	 
 }
}
