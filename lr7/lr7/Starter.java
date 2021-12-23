package lr7;

import java.util.Scanner;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
public class Starter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Tovar_info infa = new Tovar_info(); 
		int z=0; 
		do
		{
			System.out.println("1 - Список товара \n"
					+ "2 - Товар в разных категориях \n"
					+ "3 - Описание товара \n"
					+ "4 - Добавить новый товар\n"
					+ "5 - Выход.");
			z = sc.nextInt();
			switch(z)
			{
			case 1: infa.spisokTovara(); break;
			case 2 : System.out.println("Желаемая цена: \n"
												+"1 - меньше 100р\n"
												+ "2- от 100р до 1000\n"
												+ "3-	более 1000р \n");
					int z1 = sc.nextInt();			
					infa.spisokTovara(z1); break;
			case 3 : System.out.println("Введите характеристики - \n");
					 String str = sc.next();
					 if (infa.findTovar(str)!=null)
						 System.out.println(infa.findTovar(str).toString());
					 else System.out.println("Произошла ошибка");
					 break;
			case 4: System.out.println("Название товара \n");
					String n_naming = sc.next();
					System.out.println("Категория товара \n");
					String n_kateg = sc.next();
					System.out.println("Цена товара \n");
					float n_tsen =sc.nextFloat();
					System.out.println("Скидка на товар \n");
					float n_skidka = sc.nextFloat();
					System.out.println("Цена товара в Чёрную пятницу \n");
					float n_sama_skidka = sc.nextFloat();
					infa.addTovar(new Tovar(n_naming, n_kateg, n_tsen, n_skidka, n_sama_skidka)); break;
			}
			
		}
		while (z!=5);

	}


}
