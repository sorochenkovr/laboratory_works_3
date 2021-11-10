package com.actions;

public class Transposing {
	
	 public static void transposeMatrix (int [][] m){
		 int[][] temp = new int[m[0].length][m.length];
	        for (int i = 0; i < m.length; i++)
	            for (int j = 0; j < m[0].length; j++)
	                temp[j][i] = m[i][j];
	        
	        System.out.println("Транспонированная матрица:");
	        for (int i = 0; i < 4; i++) {
	            for (int j = 0; j < 4; j++) {
	                System.out.print(temp [i][j] + " ");
	            }
	            System.out.println();
	        }
	        
	    }
}