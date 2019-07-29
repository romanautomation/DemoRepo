package test2;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoTest {

	int j;
	
	@Test(priority=0)
	public void sum(){
		System.out.println("SUM");
		
		int a=10;
		int b=20;
		Assert.assertEquals(30, a+b);
	}
	
	
	@Test(priority=3)
	public void sub(){
		System.out.println("SUBSTRACT");
		int a=10;
		int b=20;
		Assert.assertEquals(10, b-a);
	}
	
	
	@Test(priority=1)
	public void mul(){
		System.out.println("MULTIPLY");
		int a=10;
		int b=20;
		Assert.assertEquals(200, a*b);
		
		
	}
	
	@Test(priority=2)
	public void div(){
		System.out.println("DIVIDE");
		int a=10;
		int b=20;
		Assert.assertEquals(2, b/a);
		
		
	}
	
	public void login(){
		
	}
}
