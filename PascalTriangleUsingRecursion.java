import java.util.Scanner;

public class PascalTriangleUsingRecursion {
	
	
    public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in);
    	System.out.print("Enter the number of rows you need for Pascal Triangle: ");
        int numOfRows = sc.nextInt();
        
        for (int i = 0; i < numOfRows; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(getPositionValue(i, j) + " ");
            }
            System.out.println();
        }
        
        if(sc!=null) {
        	sc.close();
        }
    }

    
    public static int getPositionValue(int i, int j) {
    	
    	if(j==i || j==0)
    		return 1;
    	
    	return getPositionValue(i-1, j-1) + getPositionValue(i-1, j);
    	
    }
}

