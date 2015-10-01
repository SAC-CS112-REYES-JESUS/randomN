import java.util.Scanner;



//lab1
public class ifrandomN {



	public static void main(String[] args)
	
	{
		Scanner input = new Scanner ( System.in);
		
		int computerNum;
		int userNum;
		
		computerNum = 1 + (int) ( Math.random() * 10 );
		

		
	System.out.println("Guess the number between 1-10?");
	userNum=input.nextInt();
	
			
	if(userNum==computerNum)
		
		System.out.println("You guess the correct number ;]");
		
		
		 if(userNum>computerNum)
		
		System.out.println("You number is greater than the number ;{");
		
		 if(userNum<computerNum)
		
		System.out.println("You number is to small ;P");
		
	
	System.out.printf("The random number is: %d",computerNum);
	
		
	}
	
	
	
	}



