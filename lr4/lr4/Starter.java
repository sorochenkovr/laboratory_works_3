package lr4;


import java.util.Vector;
import java.util.Scanner;

public class Starter {

	public static void main(String[] args) {
		
		Vector<Furniture> mebel= new Vector<Furniture>();
		mebel.add(new Shkaf("SH-01", "Берёза", "Шкаф открытый", 15000, 100, "Синий"));
		mebel.add(new SoftFurniture("SF-43", "Дуб", "Диван раскладной", 47000, "Наполнитель"));
		mebel.add(new Stol("ST-67", "Фанера", "Столик для ноутбука", 3000, 40, "Под дерево"));
		Scanner sc = new Scanner(System.in);
		int k;
		Furniture f;
		System.out.println("Выберите товар: \n"
								+ "1 - Столы \n"
								+ "2 - Мягкая мебель \n"
								+ "3 - Шкафы \n ");
		 k = sc.nextInt();


		switch(k)
		{
		case 1: f= mebel.elementAt(0); f= (Stol)f;  break;
		case 2: f= mebel.elementAt(1); f= (SoftFurniture)f; break;
		case 3: f= mebel.elementAt(2); f= (Shkaf)f; break;
		}
		System.out.println(f.toString());

	}
	}
