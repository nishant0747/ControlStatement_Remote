package practice;

public class ifstatement extends ss

{
	public static void main(String[] args)
	{
		
		int a = 45;
		int b = 45;
		boolean e = a==b;
		System.out.println(e);
		int marks = 48;
		
		ss t = new ss();
		
		if(marks>=35) //control statement should mention in main method
		{
			//ss t = new ss(); // we can create objects inside control statements
			t.tr();
			System.out.println("Pass");
		}
		
	}
	
	
	

}
