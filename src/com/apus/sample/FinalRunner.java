/**
 * 
 */
package com.apus.sample;

/**
 * @author User
 *
 */
public class FinalRunner {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Final.sayHi("Java");
		
		
		Final obj = new Final();
		Final obj2 = new Final();
		obj.sayHi("Java");
		obj2.SayBye("Java");
		System.out.println(obj.className);
		System.out.println(obj.classname2);
		
		obj.className = "MyClass1";
		obj2.classname2="Myclass1";
		
		System.out.println(obj.className);



	}

}
