import java.util.Scanner;

public class Linear_Search {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int [] num = new int[5];

        for (int i =0; i<num.length;i++){
            num[i]=scan.nextInt();
        }
        System.out.println("Enter Searching Element : ");
        int X =scan.nextInt();

        for (int i=0; i<num.length;i++){
            if (num[i]==X) {
                System.out.println("Element Found at Postion : "+(i+1));
                break;
            }
        }
    }
}
