import java.util.Scanner;

public class Week6 
{

	public static void main( String[] args)
	
	{
		Scanner input = new Scanner ( System.in);
		
		int num1;
		int num2;
		int resultT =0;
		String sign;
		
		System.out.println("Enter #1");
		num1 = input.nextInt();
		System.out.println("Enter #2");
		num2 = input.nextInt();
		
		System.out.println("What do you want to do?");
		System.out.println("Add(a),Multiply(m), Divide(d), Subtract(s)");
		sign = input.next();
		
			if(sign.equals("a"))
			resultT=num1+num2;
			else if(sign.equals("m"))
				resultT=num1*num2;
			else if(sign.equals("d"))
				resultT=num1/num2;
			else if(sign.equals("s"))
				resultT=num1-num2;
			else
				System.out.println("Sorry invalid function");
			
			System.out.printf("Answer: %d ", resultT);
			
				
	}
}