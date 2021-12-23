package lr6;
import java.util.Hashtable;
import java.util.Vector;

public class Library < U extends IDraw> {

	
	Hashtable<Mashiny, U> spisok = new Hashtable<Mashiny, U>();
	Vector<Mashiny> spisok_w = new Vector<Mashiny>();

	public Library (Mashiny m, U pu)
	{
		spisok.put(m, pu);
		spisok_w.add(m);
	}
	
	public void AddCar(Mashiny m, U pu)
	{
		spisok.put(m, pu);
		spisok_w.add(m);
	}
	
	public void RemoveCar(String s)
	{
		int k=0;
		for(int i=0; i<spisok_w.size(); i++)
		{
			if(spisok_w.get(i).type.equals(s))
			{
				spisok.remove(spisok_w.get(i));
				spisok_w.remove(spisok_w.get(i));
				System.out.println("Машина списана");
				k=1;
			}
		}
		if(k==0)
		System.out.println("Такой машины нет");
		
	}

	
	public void Spisok_Mashiny()
	{
		for(int i=0; i<spisok_w.size(); i++)
			System.out.println(spisok_w.get(i).type);
	}
	
	public void Tabl_Mashiny()
	{
		for(int i=0; i<spisok.size(); i++)
			System.out.println(spisok_w.get(i).type + " " + spisok.get(spisok_w.get(i)).MASHINE()) ;
	}

}
