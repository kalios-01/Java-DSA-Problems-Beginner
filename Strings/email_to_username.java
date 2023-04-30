import java.util.Scanner;

public class email_to_username {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Your Email : ");
        String email = scan.next();
        String username = "";

        for (int i = 0; i < email.length(); i++) {
            if (email.charAt(i)=='@') {
                break;
            }
            else{
                username+=email.charAt(i);
            }
        }
        System.out.println("username : "+username);
    }
    
}
