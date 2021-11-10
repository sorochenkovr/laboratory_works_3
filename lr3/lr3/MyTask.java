package lr3;

import java.util.Arrays;
import com.actions.*;

public class MyTask {

	  public static void main(String args[]) {
	        int[][] a = {
	            {-1, 5, 56, 1},
	            {2, 4, 90, -4},
	            {1, 31, 1, 8},
	            {-9, 100, -3, 23},	            
	        };
	        for (int i = 0; i < 4; i++) { 
                for (int j = 0; j < 4; j++) {
                    System.out.print(" " + a[i][j] + " ");
                }
                System.out.println();
            }
	        MyTask.Minimum(a);
	        MyTask.Maximum(a);
	        Transposing.transposeMatrix(a);
	        
	    }
	  
    
		    static void Minimum(int[][] mass) {
		        int min = mass[0][0];
		        int stroka = 0;
		        int stolbec = 0;
		        for (int a = 0; a < mass.length; a++) {
		            for (int b = 0; b < mass[0].length; b++) {
		                if (mass[a][b]<=min){
		                    min =mass[a][b];
		                    stroka=a;
		                    stolbec=b;
		                }
		            }
		        }
		         System.out.println("Минимальный элемент:"+min);
		        System.out.println("Строка:"+stroka);
		        System.out.println("Столбец:"+stolbec);
		    }

	    
	    static void Maximum(int[][] mass) {
	        int max = mass[0][0];
	        int stroka1 = 0;
	        int stolbec1 = 0;
	        for (int a = 0; a < mass.length; a++) {
	            for (int b = 0; b < mass[0].length; b++) {
	                if (mass[a][b]>=max){
	                    max =mass[a][b];
	                    stroka1=a;
	                    stolbec1=b;
	                }
	            }
	        }
	        System.out.println("Максмальный элемент:"+max);
	        System.out.println("Строка:"+stroka1);
	        System.out.println("Столбец:"+stolbec1);
	    }
}
