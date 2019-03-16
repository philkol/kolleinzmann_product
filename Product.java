public class Product
{
	private String name;
	private boolean onStock;

	public Product()
	{
		setName("Coca Cola");
		setOnStock(true);
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

	public boolean getOnstock()
	{
		return onStock;
	}
}

