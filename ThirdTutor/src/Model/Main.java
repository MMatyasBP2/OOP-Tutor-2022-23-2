package Model;

import java.util.Scanner;

public class Main {
	
	private static Scanner input = new Scanner(System.in);
	
    public static void main(String[] a) {
        System.out.println("Hi!");
        System.out.println("This is a Book registry program.");

        Book book = readBook();
        System.out.println("\nEverything about the book:");
        System.out.println(book.toString());

        System.out.println("Let's increment the price with a random number!");
        double inputNumber = readDouble();

        if (inputNumber != 0)
        {
            System.out.println("The incremented price is: " + book.incrementPrice(inputNumber));
        } else
        {
            System.out.println("The price has not been incremented.");
        }
    }
    
    private static double readDouble()
    {
        double answer;
        System.out.print("Enter the number: ");
        while(!input.hasNextDouble())
        {
            System.out.print("That's not a number! Please retry: ");
            input.next();
        }
        answer = input.nextDouble();
        return answer;
    }
    
    private static int readInt()
    {
        int answer;
        System.out.print("Enter the number: ");
        while(!input.hasNextInt())
        {
            System.out.print("That's not a number! Please retry: ");
            input.next();
        }
        answer = input.nextInt();
        return answer;
    }
    
    private static String readString()
    {
        String answer;
        while(input.hasNextInt())
        {
            System.out.print("Wrong input! Please retry: ");
            input.nextLine();
        }
        answer = input.nextLine();
        return answer;
    }

    private static Book readBook()
    {
        System.out.println("\nEnter the title!");
        String title = readString();
        System.out.println("\nEnter the author!");
        String author = readString();
        System.out.println("\nEnter the year!");
        int year = readInt();
        System.out.println("\nEnter the price!");
        double price = readDouble();
        Book book = new Book(title, author, year, price);
        return book;
    }
}