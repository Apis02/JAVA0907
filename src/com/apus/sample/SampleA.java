package com.apus.sample;

public class SampleA {
	
	
	String Myname ="";
	
	public SampleA(String Myname){
		
		this.Myname = Myname;
	
	}
	
	public SampleA() {
		// TODO Auto-generated constructor stub
	}

	public String toString()
	
	{
		return Myname;
	}
	
	public boolean equals(Object obj)
	{
		if( obj instanceof SampleA)
			
		{
			String objName = ((SampleA)obj).toString();
			if(objName.equals(Myname))
			{
				return true;
			}
		}
	}
	
	
	
	
	
	
	
	
	{
		return "SampleA";
		
	}

}
