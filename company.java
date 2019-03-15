public class Company
{
	private ArrayList<Product> products;
	private String name;

	public Company()
	{
		products = new ArrayList<Product>();
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

