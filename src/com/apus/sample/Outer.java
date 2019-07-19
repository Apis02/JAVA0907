package com.apus.sample;

public class Outer {

	int Num;
	
	private class Inner_Class{
		
		public void print(){
			
			System.out.println("This is an inner class");
			
		}
		
		public class Inner_Class2{
			
			public void print(){
				
				System.out.println("This is the 2nd inner class");
			}
		}

		void MyMethod()
		{
			class Inner_Class3
			{
				public void print(){
					
					System.out.println("This is an inner class3 inside MyMethod");
				}
				
				Inner_Class3 inner = new Inner_Class3();
				inner.print();
				
			}
		}
		
		
	
	}
	
	void display_Inner(){
		
		Inner_Class inner = new Inner_Class();
		inner.print();
		
		}
	
		
	
	
}
