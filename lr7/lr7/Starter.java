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
			System.out.println("1 - ������ ������ \n"
					+ "2 - ����� � ������ ���������� \n"
					+ "3 - �������� ������ \n"
					+ "4 - �������� ����� �����\n"
					+ "5 - �����.");
			z = sc.nextInt();
			switch(z)
			{
			case 1: infa.spisokTovara(); break;
			case 2 : System.out.println("�������� ����: \n"
												+"1 - ������ 100�\n"
												+ "2- �� 100� �� 1000\n"
												+ "3-	����� 1000� \n");
					int z1 = sc.nextInt();			
					infa.spisokTovara(z1); break;
			case 3 : System.out.println("������� �������������� - \n");
					 String str = sc.next();
					 if (infa.findTovar(str)!=null)
						 System.out.println(infa.findTovar(str).toString());
					 else System.out.println("��������� ������");
					 break;
			case 4: System.out.println("�������� ������ \n");
					String n_naming = sc.next();
					System.out.println("��������� ������ \n");
					String n_kateg = sc.next();
					System.out.println("���� ������ \n");
					float n_tsen =sc.nextFloat();
					System.out.println("������ �� ����� \n");
					float n_skidka = sc.nextFloat();
					System.out.println("���� ������ � ׸���� ������� \n");
					float n_sama_skidka = sc.nextFloat();
					infa.addTovar(new Tovar(n_naming, n_kateg, n_tsen, n_skidka, n_sama_skidka)); break;
			}
			
		}
		while (z!=5);

	}


}
