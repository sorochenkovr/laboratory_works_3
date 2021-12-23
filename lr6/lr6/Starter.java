package lr6;

import java.util.Vector;
import java.util.Hashtable;
import java.util.Scanner;
import java.util.InputMismatchException;

import lr6.lexus_enum;
import lr6.Hyndai_enum;
import lr6.audi_enum;

public class Starter {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		Library car = new Library()
				
		car.AddCar(new Mashiny("Хёндай солярис", 5), 
				new Hyundai(Hyndai_enum.без_обдува);
		car.AddCar(new Mashiny("Лексус", 3), 
				new Lexus(lexus_enum.без_обдува);
		int z;
		do {
		System.out.println("Выберите действие: \n"
								+ "1 - Список машин; \n"
								+ "2 - Добавить машину; \n"
								+ "3 - Убрать машину; \n"
								+ "4 - Таблица машин; \n"
								+ "5 - Выход");
		 z = sc.nextInt();
		switch(z)
		{
		case 1: car.Spisok_Mashiny(); break;

		case 2: System.out.println("Введите искомую марку > ");
				String type_m = sc.next();
				System.out.println("Введите пробег машины (в годах) > ");
				int probeg_m = sc.nextInt();
				System.out.println("Выберите марку: Ауди - 1, Хёндай - 2, Лексус - 3");
				 int z2 = sc.nextInt();
				switch(z2)
				{
				case 1: car.AddCar(new Mashiny(type_m, probeg_m), new Audi()); break;
				case 2: car.AddCar(new Mashiny(type_m, probeg_m), new Hyundai()); break;
				case 3: car.AddCar(new Mashiny(type_m, probeg_m), new Lexus()); break;
				}
				System.out.println("Машина добавлена в базу данных"); break;
		case 3: System.out.println("Введите марку и пробег > ");
				String type_mac = sc.next();
				car.RemoveCar(type_mac);break;
		case 4: car.Tabl_Mashiny(); break; 
				
		}} while(z!=5);
	
	}

}
