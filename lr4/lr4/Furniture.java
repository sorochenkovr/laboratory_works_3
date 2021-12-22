package lr4;


public class Furniture {
	protected String cod;
	protected String material; 
	protected String naming;
	protected float price;
	
	public Furniture() {}
	public Furniture (String c, String m, String n, float p)
	{
		cod = c;
		material = m;
		naming = n;
		price = p;
	}
	
	@Override 
	public String toString()
	{
		return "Индивидуальный код мебели: " + cod + "\n Из материала: " + material 
				+ "\n Под названием: " + naming + "\n Цена: " + String.valueOf(price);
	}


}
