/* Egy osztálynak egyetlen egy darab ősosztálya lehet, de akár több interfészt is implementálhat egyszerre
   Ezért találták ki az interfészeket, ezzel ki lehet küszöbölni a többszörös öröklődés problémáját. */
public class Childclass extends Superclass implements ISuperclass, IChildclass
{
	@Override // Annotáció, Override: Metódus felüldefiniálás - Polimorfizmus
	public void ChangeName()
	{
		// From ISuperclass
		
	}

	@Override
	public void IncrementId()
	{
		// TODO Auto-generated method stub
		
	}
	
	public void IncrementIdByNumber(double num) // Method overloading - Polimorfizmus
	{
		num += Childclass.getId();
	}

	@Override
	public void DummyMethod() {
		// From IChildclass
		
	}
}