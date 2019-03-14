public class Product
{
	private String name;

	public Product()
	{
		setName("Coca Cola");
	}

	public void setName(String name)
	{
		this.name=name;
	}

	public String getName()
	{
		return name;
	}


}
public class Company
{
	private ArrayList<Product> products;

	public Company()
	{
		ArrayList<Product> products = new ArrayList<products>();
	}
}
