package com.apus.sample;

import java.util.Scanner;



public class UserInput


{
	
	public static void main (String [] args)
		
	{
		
		int g=6;
		
		for (int i = 0; i < g; i++)
		{

		Scanner Name = new Scanner(System.in);
		System.out.println("Enter username");

		String Uname = Name.nextLine();
		System.out.println("Username is " + Uname);
		
		}
	}
}