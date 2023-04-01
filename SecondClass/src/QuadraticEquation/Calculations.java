package QuadraticEquation;

public class Calculations {
    public double discriminant(String array[])
    {
        int a = Integer.parseInt(array[0]);
        int b = Integer.parseInt(array[1]);
        int c = Integer.parseInt(array[2]);
        double discriminant = Math.pow(b, 2) - 4 * a * c;
        return discriminant;
    }

    public double zeroDiscriminant(String array[])
    {
        int a = Integer.parseInt(array[0]);
        int b = Integer.parseInt(array[1]);
        double oneRealRoot = (b * (-1) + 0) / (2 * a);
        return oneRealRoot;
    }

    public void twoRealSolution(String array[])
    {
        int a = Integer.parseInt(array[0]);
        int b = Integer.parseInt(array[1]);
        int c = Integer.parseInt(array[2]);
        double discriminant = Math.pow(b, 2) - 4 * a * c;
        double solutionRealPlus = (b * (-1) + Math.sqrt(discriminant)) / (2 * a);
        double solutionRealMinus = (b * (-1) - Math.sqrt(discriminant)) / (2 * a);
        System.out.println("x1 = " + solutionRealPlus);
        System.out.println("x2 = " + solutionRealMinus);
    }

    public void twoComplexSolution(String array[])
    {
        int a = Integer.parseInt(array[0]);
        int b = Integer.parseInt(array[1]);
        int c = Integer.parseInt(array[2]);
        double discriminant = Math.pow(b, 2) - 4 * a * c;
        double solutionComplexPlus = (b * (-1) + Math.sqrt(discriminant * (-1))) / (2 * a);
        double solutionComplexMinus = (b * (-1) - Math.sqrt(discriminant * (-1))) / (2 * a);
        System.out.println("x1 = " + solutionComplexPlus);
        System.out.println("x2 = " + solutionComplexMinus);
    }
}