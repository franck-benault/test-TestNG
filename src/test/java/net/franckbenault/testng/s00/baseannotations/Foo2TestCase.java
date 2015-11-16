package net.franckbenault.testng.s00.baseannotations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Foo2TestCase {
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("foo beforeTest");
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("foo afterTest");
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("foo2 beforeClass");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("foo2 afterClass");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("foo2 beforeMethod");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("foo2 afterMethod");
	}	
	
	@Test
	public void testFoo2T01() {
		System.out.println("testFoo2T01()");
	}
	
	@Test
	public void testFoo2T02() {
		System.out.println("testFoo2T02()");
	}
}
