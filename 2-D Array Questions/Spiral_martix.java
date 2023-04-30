import java.util.Scanner;

public class Spiral_martix {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of Rows : ");
        int row=scan.nextInt();
        System.out.println("Enter Number of Columns");
        int col = scan.nextInt();
        // Array Creation 
        int matrix [][] = new int [row] [col];
        // input array
        System.out.println("Enter Elements : ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix[i][j]=scan.nextInt();
            }
        }
        
        int row_start =0;
        int row_end=row-1;
        int column_start =0;
        int column_end =col-1;

        while (row_start<=row_end && column_start<=column_end) {
            
            // for printing top line of matrix
            for(int column = column_start;column<column_end;column++){
                System.out.print(matrix[row_start][column]+" ");
            }
            row_start++;
        }
        // for printing right line of matrix
        for (int row_start = 0; ro; i++) {
            
        }
    }
}