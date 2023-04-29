package Model;
import java.time.LocalDate;

public class Beer extends Product
{
	private double Alcohol;
	
	public Beer(int Id, String Name, LocalDate ProductionDate)
	{
		super(Id, Name, ProductionDate);
	}
	
	public Beer(int Id, String Name, LocalDate ProductionDate, double Alcohol)
	{
		this(Id, Name, ProductionDate);
		this.Alcohol = Alcohol;
	}

	public double getAlcohol()
	{
		return Alcohol;
	}

	public void setAlcohol(double alcohol)
	{
		Alcohol = alcohol;
	}

	@Override
	public String toString()
	{
		return "Beer [Alcohol=" + Alcohol + ", getAlcohol()=" + getAlcohol() + ", getId()=" + getId() + ", getName()="
				+ getName() + ", getProductionDate()=" + getProductionDate() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
}