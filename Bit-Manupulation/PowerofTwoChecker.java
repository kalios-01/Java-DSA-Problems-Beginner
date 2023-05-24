import java.util.Scanner;

/**
 * PowerofTwoChecker
 */
public class PowerofTwoChecker {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        int number = sn.nextInt();
        if(isPowerTwo(number)){
            System.out.println(number+" is power of 2");
        }
        else{
            System.out.println(number+" is Not power of 2");
        }
        
        
    }
    public static boolean isPowerTwo(int number){
        if(number <= 0){
            return false;
        }
        else{

            return (number &(number-1))==0;
        }

    }    
}