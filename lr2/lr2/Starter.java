package lr2;

import java.util.Scanner;

public class Starter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Система запускСистемы = Система.Инициализация();
		System.out.println("Система готова к работе");
		System.out.println("Введите личные данные");
		System.out.print("ФИО > ");
		String фиоК = sc.nextLine();
		System.out.print("Логин > ");
		String логинК = sc.next();
		Заказчик заказчик = new Заказчик(фиоК, логинК);
		int операция = 0;
		do {
			System.out.print("Уважаемый " + заказчик.ФИО +
					", выберите действие: \n1 - Вывод каталога материалов\n" +
					"2 - Запрос материала\n3 - Отменить заказ\n"+
					"0 - Выход \n Ваш выбор > ");
			операция = sc.nextInt();
			switch(операция) {
			case 1: запускСистемы.Каталог(); break;
			case 2:
				System.out.print("Код товара >");
				String код = sc.next();
				запускСистемы.Заказ(код, заказчик);
				break;
			case 3:
				запускСистемы.Отказ(заказчик);
				break;
			default: break;
			}
		}while (операция !=0);
			
			sc.close();
			System.out.println("Работа завершена");
		}

}
