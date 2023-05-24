// Toggling bit simply mean changing value of bit of given number of given position.

import java.util.Scanner;

public class BitToggle {
    public static void main(String[] args) {
        Scanner sn =new Scanner(System.in);
        System.out.println("Enter A Numer :");
        int number =sn.nextInt();
        System.out.println("Enter Postion to be Toggles : ");
        int Pos =sn.nextInt();

        int bitmask = 1 << Pos;

        int result = number ^bitmask;
        System.out.println(result);

        
    }
    
}
