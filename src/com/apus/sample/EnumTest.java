package com.apus.sample;
import static com.apus.sample.Day.*;



public class EnumTest {
	
	Day day;
	
	public EnumTest( Day day) { this.day = day;}
	
	public void tellItLikeItIs()
	{
		
		switch (day)
		
		{
		
		case MONDAY:
			
			System.out.println("Monday are bad.");
			break;
			
		case FRIDAY:
			
			System.out.println("Fridays are better");
			break;
			
		case SATURDAY:
		
		
		case SUNDAY:
		System.out.println("Weekdays are best.");
		break;
		
		default:
			System.out.println("Midweek days are so - so.");
			
		}
	}
	
	public static void main(String [] args){
		
		EnumTest firstday = new EnumTest(Day.MONDAY);
		firstday.tellItLikeItIs();
		EnumTest seconday = new EnumTest(Day.FRIDAY);
		seconday.tellItLikeItIs();
		EnumTest thirday = new EnumTest(Day.SATURDAY);
		thirday.tellItLikeItIs();
		EnumTest forthday = new EnumTest(Day.SUNDAY);
		forthday.tellItLikeItIs();

	}
	
	

}
