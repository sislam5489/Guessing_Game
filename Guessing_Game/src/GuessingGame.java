/*
 Syeda Islam
 9/25/2017
 */
import java.util.Scanner;
import java.lang.Math;
import java.util.InputMismatchException;
public class GuessingGame {
	public static void main(String[]args)
	{
		Scanner input = new Scanner(System.in);
		/*System.out.print("What is your name?");
		String s = input.next();
		System.out.println("Nice to meet you " + s);
		System.out.print("How old are you?");
		int x = input.nextInt();
		System.out.print("You are " + x + " years old");*/
		int guess = 0; 
		boolean isNumber = false;
		int answer = (int)((Math.random()*10)+1);
		while(guess != answer)
		{
			
			while(!isNumber)
			{
				try
				{
					System.out.print("enter your guess");
				    guess = input.nextInt() ;
					isNumber = true;
					if(guess == answer)
					{
						System.out.print("You have guessed right!");
					}
					else
					{
						System.out.print("Sorry,you are wrong");
					}
				}
				catch(InputMismatchException e)
				
				{
					System.out.println("That was error type " + e);
					System.out.println("That was not a number. Please try again.");
					input.nextLine();
				}
			}
		}
		
		input.close();
		
	}
	
	
	
}

