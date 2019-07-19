package com.apus.sample;

public class TestSample {

	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
		SampleA obj1 = new SampleA();
		SampleB obj2 = new SampleB();
		
		System.out.println("About to print objects...");
		System.out.println(obj1);
		System.out.println(obj2);
		
		String strObjName = new String (obj1.toString());
		System.out.println("strObjNamr :" +strObjName);
		
		if(strObjName == "SampleA")
			
		{
			System.out.println("This is not SampleA");
			
		} else{
			System.out.println("This is not SampleA");
		}
	}

}
