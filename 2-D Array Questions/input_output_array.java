import java.util.Scanner;

public class input_output_array {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of Rows : ");
        int row=scan.nextInt();
        System.out.println("Enter Number of Columns");
        int col = scan.nextInt();
        // Array Creation 
        int array [][] = new int [row] [col];
        // input array
        System.out.println("Enter Elements : ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                array[i][j]=scan.nextInt();
            }
        }
        //Output 
        System.out.println("Input Matrix is :");
        for(int i=0;i<row;i++){
            for(int j =0;j<col;j++){
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
    }
}