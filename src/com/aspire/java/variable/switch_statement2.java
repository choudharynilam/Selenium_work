package com.aspire.java.variable;

public class switch_statement2 
{
	
	public static void main(String[] args)
	{
		String option ="PC";
		switch (option)
		{
		case "BC":
		System.out.println("Balance Check");
		break;
		case "CW":
			System.out.println("cash withdraw");
		break;
		case "PC":
		System.out.println("pin change");
		break;
		case "FT":
			System.out.println("Fund Transfer");
		break;
		case "MS":
			System.out.println("Mini Statement");
		break;
		default:
			System.out.println("invalid entry");
		}
	}

}	
			
		
		
		
		