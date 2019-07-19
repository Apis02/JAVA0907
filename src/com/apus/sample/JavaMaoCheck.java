package com.apus.sample;\

import java.util.*;

public class JavaMaoCheck {

	public static void main(String[] args) {
		
		HashMap< String, String> map  = new HashMap<String, String>();
		
		
		int i=1;
		
		for (String s : args)
			
		{
			map.put(Integer.toString(i), s);
			
			i++;
		}
		
		System.out.println(map);
		System.out.println("First elemeny :" + map.get("1"));

	}

}
