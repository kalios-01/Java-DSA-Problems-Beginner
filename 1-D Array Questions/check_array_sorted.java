import java.util.Scanner;

public class check_array_sorted {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int [] num = new int[5];
        // taking input in array.
        for (int i = 0; i < num.length; i++) {
            num[i]=scan.nextInt();
        }

        boolean isarranged = true;

        // check weather array is sorted or not. 
        for (int i = 0; i < num.length-1; i++) {
            if (num[i]>num[i+1]) {
                isarranged = false;
                break;
            }
        }
        if (isarranged){
            System.out.println("Array is  Sorted");
        }
        else{
            System.out.println("Array is not Sortted");
        }
    }
}
