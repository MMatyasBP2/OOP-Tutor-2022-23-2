// Nem lehet példányosítani, lehetnek abstract metódusai, adattagjai, amit a Childclass-ban le kell származtatni
public abstract class Superclass
{
	private static int Id;
	private static String Name;
	
	public static int getId()
	{
		return Id;
	}
	
	public static void setId(int id)
	{
		Id = id;
	}
	
	public static String getName()
	{
		return Name;
	}
	
	public static void setName(String name)
	{
		Name = name;
	}
	
	public abstract void IncrementId();
	
	public void IncrementIdByNumber(int num)
	{
		Id += num;
	}
}
