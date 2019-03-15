public class Company
{
	private LinkedList<Product> products;
	private String name;

	public Company()
	{
		products = new LinkedList<Product>();
		setName("IBM");
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

