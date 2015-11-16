package net.franckbenault.testng.s00.baseannotations;


import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Foo1TestCase {
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("foo1 beforeClass");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("foo1 afterClass");
	}
	
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("foo1 beforeMethod");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("foo1 afterMethod");
	}

	
	@Test
	public void testFoo1T01() {
		System.out.println("testFoo1T01()");
	}
	
	@Test
	public void testFoo1T02() {
		System.out.println("testFoo1T02()");
	}
}
