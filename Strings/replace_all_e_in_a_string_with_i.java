// replace all 'e' in a given string with 'i' 

import java.util.Scanner;

public class replace_all_e_in_a_string_with_i {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a String : ");
        String word = scan.next();
        String result="";
        

        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i)=='e') {
                result+="i";
            }
            else{
                result+= word.charAt(i);
            }
        }
        System.out.println("orignal : "+word);
        System.out.println("result : "+result);
    }
    
}
