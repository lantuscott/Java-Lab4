
public class UnicodeDump
{
	public final static int UPPER_BOUND = 65535;

	public static void main(String[] args) throws Exception // needed to sleep
	{
		// fun with Unicode in Java!
//		System.out.print('\u56db'); // printing Unicode: Chinese '4'
//		System.out.println('\u4e03'); // Chinese '7'
//
//		int \u56db\u4e03 = 47; // Look: a Chinese variable name of 47!
//		StdOut.print(\u56db\u4e03);

		// for-loop follows...loop over each code from 0..UPPER_BOUND
		for (int unicode = 32; unicode <= UPPER_BOUND; unicode++)
		{
			if (unicode % 32 == 0) // check for new line
				StdOut.printf("\n%4d: ",unicode); // start a new line and print char #

			// print out one Unicode character with code unicode
			StdOut.printf("%c", unicode);
			
			Thread.sleep(1); // delay a bit
		}

	}

}
