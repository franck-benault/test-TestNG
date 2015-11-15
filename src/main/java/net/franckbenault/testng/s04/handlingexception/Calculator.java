package net.franckbenault.testng.s04.handlingexception;

public class Calculator {
	
	private String name;
	
	public Calculator(String name) {
		if(name == null || name.length()==0 ) throw new IllegalArgumentException("no name");
		this.name = name;
	}
	
	public int sum(int a, int b) {
		return a + b;
	}

	public int divide(int a, int b) {
		return a / b;
	}

	public String getName() {
		return name;
	}
}
