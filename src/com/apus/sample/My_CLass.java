/**
 * 
 */
package com.apus.sample;

/**
 * @author User
 *
 */
public class My_CLass {
	
	public void displaymessage(Message m){
		
		System.out.print(m.greet);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Outer outer2 = new Outer();
		
		outer2.display_Inner();
		outer2.MyMethod();
		
		Outer.Inner_Class2 inner = outer2.new Inner_Class2();
		inner.print();
		
		My_class obj = new My_class();
		obj.displayMessage(new Message()

	}

}
