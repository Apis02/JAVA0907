package com.apus.sample;

public class TestClass implements inf2 {

	@Override
	public String WhoAmI() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void testIt() {
		
		System.out.println("Test It");
		// TODO Auto-generated method stub

	}
	
	public static void main (String args[])
	{
		System.out.println("Inside TestClass main");
		System.out.println("name");
		TestClass test = new TestClass();
		test.testIt();
		System.out.println(Inf2.name);
		
	}

}
