package net.franckbenault.testng.s04.handlingexception;

import org.testng.annotations.Test;

import static org.testng.Assert.fail;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNull;

public class CalculatorTestCase {
	
	@Test
	public void test02DivideByZeroWithTryCatch() {
			
		Calculator calculator = new Calculator("calculator1");
		try {
			calculator.divide(1,0);
			fail("ArithmeticException expected");
		} catch (ArithmeticException e) {
			assertEquals(e.getMessage(), "/ by zero");
			assertNull(e.getCause());
		}

	}
	
	@Test(expectedExceptions =ArithmeticException.class,
			expectedExceptionsMessageRegExp="/ by zero")
	public void test02DivideByZeroWithAnnotation() {
			
		Calculator calculator = new Calculator("calculator1");
		calculator.divide(1,0);

	}
	
	@Test(expectedExceptions =ArithmeticException.class,
			expectedExceptionsMessageRegExp="^/ by z.*")
	public void test02DivideByZeroWithAnnotationMessageStartWith() {
			
		Calculator calculator = new Calculator("calculator1");
		calculator.divide(1,0);

	}
	
	@Test(expectedExceptions =ArithmeticException.class,
			expectedExceptionsMessageRegExp=".*y zero$")
	public void test02DivideByZeroWithAnnotationMessageEndBy() {
			
		Calculator calculator = new Calculator("calculator1");
		calculator.divide(1,0);

	}

	@Test(expectedExceptions ={IllegalArgumentException.class,ArithmeticException.class})
	public void test02DivideByZeroWithTwoExceptionsV1() {
			
		Calculator calculator = new Calculator("");
		calculator.divide(1,0);

	}
	
	@Test(expectedExceptions ={IllegalArgumentException.class,ArithmeticException.class})
	public void test02DivideByZeroWithTwoExceptionsV2() {
			
		Calculator calculator = new Calculator("calculator1");
		calculator.divide(1,0);

	}

}
