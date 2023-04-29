package Model;

public class Main {
    public static void main(String[] a) {
        System.out.println("Hi Sir!");
        System.out.println("This is a TTI shape registry program.");
        System.out.println("Let's calc some TTI boi!");

        Person person = readPerson();
        System.out.println("\nDetails:");
        System.out.println(person.toString());
    }

    private static Person readPerson()
    {
        System.out.println("\nPlease name the person!");
        String name = Input.readString();
        System.out.println("Please give me the weight!");
        int weight = Input.readInt();
        System.out.println("Please give me the height!");
        double height = Input.readDouble();
        Person person = new Person(name, weight, height);
        return person;
    }
}