import java.util.Scanner;
import java.util.function.BinaryOperator;

public class CountSetBits {
    public static void main(String[] args) {
        int count =0;
        Scanner sn = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int number = sn.nextInt();
        String binary = Integer.toBinaryString(number);
        for (int i = 0; i < binary.length(); i++) {
            if (binary.charAt(i) == '1') {
                count++;
            }    
        }
        System.out.println("number of 1s :"+count);
    }
}
