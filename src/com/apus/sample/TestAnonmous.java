package com.apus.sample;

public class TestAnonmous {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AnonymousInner obj = new AnonymousInner()
		
		{
			public void myMethod(){
				
				System.out.println("Inside myMethod");
				
				
			}
		};
		
		obj.myMethod();
		

	}

}
