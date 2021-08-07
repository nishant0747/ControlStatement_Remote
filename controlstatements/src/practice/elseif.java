package practice;

public class elseif 
{
	public static void main(String[] args) 
	{
		int marks = 65;
		
		if(marks>64)
		{
			System.out.println("Distinction");
		}
		
		else if(marks>59)
		{
			System.out.println("first class");
			
		}
		else if(marks>49)
		{
			System.out.println("second class");
		}
		else if(marks>34)
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
	}

}
