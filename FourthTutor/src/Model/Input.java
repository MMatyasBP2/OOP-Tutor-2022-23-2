package Model;
import java.util.Scanner;

public class Input {

    private static final Scanner input = new Scanner(System.in);

    public static String readString()
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

    public static int readInt(int min, int max)
    {
        int number = 0;
        do
        {
            while(!input.hasNextInt())
            {
                System.out.print("Wrong input! Please retry: ");
                input.next();
            }
            number = input.nextInt();
            input.nextLine();
        } while(number < min || number > max);
        return number;
    }

    public static int readInt()
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

    public static double readDouble()
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

    public static int readByte()
    {
        byte answer;
        System.out.print("Enter the number: ");
        while(!input.hasNextByte())
        {
            System.out.print("That's not a number! Please retry: ");
            input.next();
        }
        answer = input.nextByte();
        return answer;
    }

    public static int readShort()
    {
        short answer;
        System.out.print("Enter the number: ");
        while(!input.hasNextShort())
        {
            System.out.print("That's not a number! Please retry: ");
            input.next();
        }
        answer = input.nextShort();
        return answer;
    }

    public static String readStringWithBufferCleaner()
    {
        String answer;
        input.nextLine();
        System.out.print("Enter the string: ");
        while (input.hasNextInt())
        {
            System.out.print("Wrong input! Please retry: ");
            input.nextLine();
        }
        answer = input.nextLine();
        return answer;
    }

    public static void readNames(String[] names)
    {
        for (int i = 0; i < names.length; i++) {
            System.out.print("Name #" + (i + 1) + ": ");
            names[i] = input.nextLine();
        }
    }

    public static void printNames(String[] names)
    {
        System.out.println("\nDetails:");
        for (int i = 0; i < names.length; i++) {
            System.out.println("Name #" + (i + 1) + ": " + names[i]);
        }
    }

    public static String[] readConstants()
    {
        int a = 0, b = 0, c = 0;
        System.out.println("That's just an " + (a + b + c) + " to feel, you're not alone. :)");
        System.out.println();
        boolean ok;
        String[] strArray;
        do
        {
            System.out.print("Constants of the equlation separated by comma: ");
            String inString = input.nextLine();
            strArray = inString.split(",");
            ok = true;
            try
            {
                a = Integer.parseInt(strArray[0]);
                b = Integer.parseInt(strArray[1]);
                c = Integer.parseInt(strArray[2]);
            }
            catch (Exception ex)
            {
                ok = false;
            }
        } while(!ok);
        return strArray;
    }

    public static String readAnswer()
    {
        String answer = input.nextLine();
        while (!answer.equals("Yes") && !answer.equals("yes") && !answer.equals("No") && !answer.equals("no"))
        {
            System.out.print("Wrong input! Please retry: ");
            answer = input.nextLine();
        }
        return answer;
    }

    public static void bufferCleaner()
    {
        input.nextLine();
    }
}