package lr7;

import java.util.Comparator;
import java.util.Optional;
import java.util.Set;
import java.util.TreeSet;

import lr7.Tseny;



public class Tovar_info {
	
	private TreeSet<Tovar> tov;
	public Tovar_info()
	{
		tov = new TreeSet<>(Comparator.comparingDouble(u ->u.tsen));
		tov.add(new Tovar("Молоко", "молочные продукты", 59, 6, 26000f));
		tov.add(new Tovar("Хлеб", "хлебобулочные изделия",  3, 12, 26000f));
		tov.add(new Tovar("Сок", "напитки", 120, 2, 26000f));

	}
	
	public Tovar findTovar(String str)
	{
		Tovar  ntovar = null;
		for (Tovar cl : tov)
		{
			if ((str.equals(cl.naming)) || (str.equals(cl.kateg)))		
				ntovar = cl;
		}
		return ntovar;
	}
	
	public void addTovar(Tovar cl)
	{
		tov.add(cl);
		if(tov.contains(cl))
			System.out.println("Товар занесён в базу");
		else System.out.println("Произошла ошибка");
	}
	
	public void spisokTovara()
	{
		tov.forEach(u -> System.out.println(u.naming + "    " + String.valueOf(u.tsen)));
	}
	
	public void spisokTovara(int categ)
	{
		Set<Tovar> cl1 = new TreeSet<Tovar>();
		Set<Tovar> cl2 = new TreeSet<Tovar>();
		Set<Tovar> cl3 = new TreeSet<Tovar>();
		Optional<Tovar> op1 = tov.stream().filter(c -> c.tsen>=10000).findFirst();
		Optional<Tovar> op2 =tov.stream().filter(c -> (c.tsen>=100000)).findFirst();
		cl1=tov.headSet(op1.get());
		cl2=tov.subSet(op1.get(), op2.get());
		cl3=tov.tailSet(op2.get());
		
		switch(categ)
		{
		case 1 : cl1.forEach(u -> System.out.println(u.naming + "    " + String.valueOf(u.tsen))); break;
		case 2 : cl2.forEach(u -> System.out.println(u.naming + "    " + String.valueOf(u.tsen))); break;
		case 3 : cl3.forEach(u -> System.out.println(u.naming + "    " + String.valueOf(u.tsen))); break;
		}
	
	}

	
}
