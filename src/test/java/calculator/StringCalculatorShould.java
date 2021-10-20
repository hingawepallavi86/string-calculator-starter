package testdriven;
import  org.junit.Assert;

import static org.junit.Assert.assertEquals;
import org.junit.Test;



public class TestCal {
	@Test
	//it should return zero
	public void emptyStringTest() throws Exception {
		 Calculator calculator=new Calculator();
		 assertEquals(calculator.calculate(""),0);
	}
	@Test
	public void singleValueTest() throws Exception {
		Calculator calculator=new Calculator();
		assertEquals(calculator.calculate("1"),1);
	}
	@Test
	public void twoNumbersSeparatedByComma() throws Exception {
		Calculator calculator=new Calculator();
		assertEquals(calculator.calculate("1,2"),3);
	}
	@Test
	public void NumbersSeparatedByComma() throws Exception {
		Calculator calculator=new Calculator();
		assertEquals(calculator.calculate("1,2,3"),6);
	}
	@Test
	public void NumbersSeparatedBynewLine() throws Exception {
		Calculator calculator=new Calculator();
		assertEquals(calculator.calculate("1\n2,3"),6);
	}
	@Test(expected=Exception.class)
	public void negativeNumber() throws Exception {
		Calculator calculator=new Calculator();
		calculator.calculate("-1");
	}
	@Test
	public void Numbersgreaterthan1000() throws Exception {
		Calculator calculator=new Calculator();
		assertEquals(calculator.calculate("10,10,1001"),20);
	}
	@Test
	public void NumberswithDelimeter() throws Exception {
		Calculator calculator=new Calculator();
		assertEquals(calculator.calculate("//;\n1;2"),3);
	}
	
	
	

	
	
	

}
