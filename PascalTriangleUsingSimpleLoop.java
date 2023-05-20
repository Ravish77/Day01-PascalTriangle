package com.day01.macbook;

import java.util.Scanner;

public class PascalTriangleUsingSimpleLoop {
	
    public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in);
    	System.out.print("Enter the number of rows you need for Pascal Triangle: ");
        int numOfRows = sc.nextInt();
        
        pascTriangle(numOfRows);
        
        if(sc!=null) {
        	sc.close();
        }
    }
    
    
    public static void pascTriangle(int rows) {
    	
    	for (int i = 0; i < rows; i++) {
    		
            int positionValue = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(positionValue + " ");
                positionValue = positionValue * (i - j) / (j + 1);
            }
            
            System.out.println();
        }
    }
    
}

