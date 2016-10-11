import java.util.Scanner;

public class EnglishToNumber {
	
	public static int digitToNumber(String d)
	{
		if(d.equals("zero"))
			return 0;
		else if (d.equals("one"))
			return 1;
		else if (d.equals("two"))
			return 2;
		else if (d.equals("three"))
			return 3;
		else if (d.equals("four"))
			return 4;
		else if (d.equals("five"))
			return 5;
		else if (d.equals("six"))
			return 6;
		else if (d.equals("seven"))
			return 7;
		else if (d.equals("eight"))
			return 8;
		else if (d.equals("nine"))
			return 9;
		else
			return -1;

	}

	public static void main(String[] args)
	{

		Scanner input = new Scanner(System.in);
				
		System.out.print("Enter a number  in letters: ");
		String number = input.next();
		
		int digitNumber = digitToNumber(number);
		
		if(number == "zero")
		{
			System.out.println(0);
		}else
		{
			System.out.println(digitNumber);
		}

		
		
		input.close();
	}
	
}
