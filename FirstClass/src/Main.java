import java.util.Scanner;
public class Main {
	
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Hello World!");
		
		int num = 10;
		String chararray = "asdsadasdasafasf";
		
		System.out.printf("My integer: %d\n", num);
		System.out.println("My string: " + chararray);
		
		num += 5;
		
		System.out.print("Enter the number: ");
		int readnum = readInteger();
		System.out.println("My readed number: " + readnum);
	}

	public static int readInteger()
	{
		int read = input.nextInt();
		return read;
	}
}