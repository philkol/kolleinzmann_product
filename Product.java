public class Product
{
	private String name;

	private boolean onStock;

	private float price;


	public Product()
	{
		setName("Coca Cola");
		setOnStock(true);
		setPrice(10);
	}

	public void setName(String name)
	{
		this.name=name;
	}

	public void setOnstock(boolean onStock)
	{
		this.onStock=onStock;
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

	public boolean getOnstock()
	{
		return onStock;
	}
}

