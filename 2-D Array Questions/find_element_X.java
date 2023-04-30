// find element X in given matrix and Print its Position.[linear search in 2-D Array.]
import java.util.Scanner;

public class find_element_X {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.println("Enter number of Rows : ");
        int r =sn.nextInt();
        System.out.println("Enter Number of Column : ");
        int c = sn.nextInt();

        // Array Declaration.
        int matrix [][]= new int[r][c];

        // Array input
        for(int i=0;i<r;i++){
            for(int j =0;j<c;j++){
                matrix[i][j]=sn.nextInt();
            }
        }
        System.out.println("Enter Searching Element : ");
        int X =sn.nextInt();
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (matrix[i][j]==X) {
                    System.out.println("Element Found At Position : "+"["+(i+1)+","+(j+1)+"]");
                    break;
                }
            }
        }
    }
}
