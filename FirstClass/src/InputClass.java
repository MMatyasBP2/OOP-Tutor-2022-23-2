import java.util.Scanner;
public class InputClass {

	private static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		final int min = 0;
		final int max = 100;
		
		/*System.out.print("Give me an integer: ");
		int a = readInteger();
		System.out.println("My number: " + a);*/
		
		System.out.println("Give me an other number!");
		int b = readMinMax(min, max);
		System.out.println("My limited number: " + b);
		
		input.close();
	}

	public static int readInteger()
	{
		int answer;
		
		while (!input.hasNextInt())
		{
			System.out.print("That's not a number! Please retry: ");
			input.next();
		}
		answer = input.nextInt();
		return answer;
	}
	
	public static int readMinMax(int min, int max)
	{
		int answer = 0;
		
		do
		{
			while (!input.hasNextInt())
			{
				System.out.println("Hülye vagy!");
				input.next();
			}
			
			answer = input.nextInt();
			
			if (answer < min || answer > max) {
				System.out.print("Wrong number! Please retry: ");
				continue;
			}
		} while (answer < min || answer > max);
		
		return answer;
	}
}
