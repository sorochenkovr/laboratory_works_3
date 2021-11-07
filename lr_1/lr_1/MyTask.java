package lr_1;

import java.util.ArrayList;
import java.util.Scanner;

public class MyTask {

	public static void DoTask() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Введите количество чисел > ");
		int N = sc.nextInt();
		
		double a;
		ArrayList<Double> aa = new ArrayList();
		
		for(int i=0; i<N; i++) 
		{
			System.out.print("Введите число "+String.valueOf(i+1)+" > ");
			a = sc.nextDouble();
			aa.add(a);
		}
		
		double max = aa.get(0);
		for (Double i: aa) {
		    if(i > max) 
		        max = i;
		}
		System.out.println(max);
		
		double max2 = aa.get(0);
		for (Double i: aa) {
			if(i != (max-1)) 
				if (i > max2)
		    	max2 = i;
		}
		System.out.println(max2);
		
		double b = 0;
		System.out.println("Сумма квадратов = ");
		b = max*max + max2*max2;
		System.out.println(b);
		sc.close();
	}

}
