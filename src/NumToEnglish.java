import java.util.Scanner;

public class NumToEnglish
{
	public static String digitToEnglish(int d)
	{
	// assumes 1 <= d <= 9
		
		if(d == 0)
			return "";
		else if (d == 1)
			return "one";
		else if (d == 2)
			return "two";
		else if (d == 3)
			return "three";
		else if (d == 4)
			return "four";
		else if (d == 5)
			return "five";
		else if (d == 6)
			return "six";
		else if (d == 7)
			return "seven";
		else if (d == 8)
			return "eight";
		else if (d == 9)
			return "nine";
		else
			return "?";
	}
	
	public static void main(String[] args)
	{
//		String tens = digitToEnglish(4);
//		StdOut.print(tens + " ");
//		StdOut.println(digitToEnglish(7));
		
		//Create Scanner
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a number that is 0 or higher: ");
		int number = input.nextInt();
		
		if(number == 0)
		{
			System.out.println("zero");
		}else if(number < 10)
		{
			String result = digitToEnglish(number);
			System.out.println(result);
		}else if(number == 10)
		{
			System.out.println("ten");
		}else if(number == 11)
		{
			System.out.println("eleven");
		}else if(number == 12)
		{
			System.out.println("twelve");
		}else if(number == 13)
		{
			System.out.println("thirteen");
		}else if(number == 14)
		{
			System.out.println("fourteen");
		}else if(number == 15)
		{
			System.out.println("fifteen");
		}else if(number == 16)
		{
			System.out.println("sixteen");
		}else if(number == 17)
		{
			System.out.println("seventeen");
		}else if(number == 18)
		{
			System.out.println("eighteen");
		}else if(number == 19)
		{
			System.out.println("nineteen");
		}else if(number == 20)
		{
			System.out.println("twenty");
		}else
		{
			int tensDigit = number/10;
			int onesDigit = number%10;
			if(tensDigit == 2)
			{
				System.out.print("twenty");
			}else if(tensDigit == 3)
			{
				System.out.print("thirty");
			}else if(tensDigit == 4)
			{
				System.out.print("fourty");
			}else if(tensDigit == 5)
			{
				System.out.print("fifty");
			}else if(tensDigit == 6)
			{
				System.out.print("sixty");
			}else if(tensDigit == 7)
			{
				System.out.print("seventy");
			}else if(tensDigit == 8)
			{
				System.out.print("eighty");
			}else if(tensDigit == 9)
			{
				System.out.print("ninety");
			}
			System.out.print(digitToEnglish(onesDigit));
		}

		
		
		input.close();
	}

}
