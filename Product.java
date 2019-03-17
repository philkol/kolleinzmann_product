public class Product
{
	private String name;
	private float price;
	private int id;

	public Product(int id)
	{
		setName("Coca Cola");
		setPrice(10);
		setId(id);
	}

	public void setName(String name)
	{
		this.name=name;
	}

	public String getName()
	{
		return name;
	}
	
	public void setPrice(float price)
	{
		this.price=price;
	}

	public float getPrice()
	{
		return price;
	}

	public void setId(int id)
	{
		this.id=id;
	}

	public int getId()
	{
		return id;
	}

}

