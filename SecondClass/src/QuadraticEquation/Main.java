package QuadraticEquation;
import java.util.Scanner;

public class Main {

	private static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args)
    {
        System.out.println("Hello!");
        System.out.println("This is a Quadratic Equation Solver program.");
        System.out.println("The ground formula:");
        System.out.println("\n(ax^2+bx+cx = 0)\n");
        boolean again;
        Calculations calc = new Calculations();
        do
        {
            again = true;
            System.out.println("Please give me the constans of the equation separated by comma!");
            System.out.println("(Constants are: a, b, c)\n");
            String[] constants = readConstants();
            System.out.println();
            if (calc.discriminant(constants) == 0)
            {
                System.out.println("Discriminant is zero, so we have one real root.");
                System.out.println("x = " + calc.zeroDiscriminant(constants));
            } else if (calc.discriminant(constants) > 0)
            {
                System.out.println("Discriminant is bigger than zero, so we have two real root.");
                calc.twoRealSolution(constants);
            } else if (calc.discriminant(constants) < 0)
            {
                System.out.println("Discriminant is smaller than zero, so we have two complex root.");
                calc.twoComplexSolution(constants);
            }
            System.out.println("\nDo you want to continue?");
            System.out.print("Answer: ");
            String answer = readAnswer();
            if (answer.equals("No") || answer.equals("no"))
            {
                System.out.println("Goodbye! :)");
                again = false;
            }
        } while(again);
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
}
