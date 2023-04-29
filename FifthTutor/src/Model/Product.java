package Model;
import java.time.LocalDate;

public class Product
{
	private int Id;
	private String Name;
	private LocalDate ProductionDate;
	
	public Product(int Id, String Name, LocalDate ProductionDate)
	{
		this.Id = Id;
		this.Name = Name;
		this.ProductionDate = ProductionDate;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public LocalDate getProductionDate() {
		return ProductionDate;
	}

	public void setProductionDate(LocalDate productionDate) {
		ProductionDate = productionDate;
	}
}
