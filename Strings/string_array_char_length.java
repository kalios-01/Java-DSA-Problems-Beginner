import java.util.Scanner;
// take user input in string array and save in single string and find its lenght
public class string_array_char_length {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String sentence = "";
        String word []= new String[n];

        for (int i = 0; i < word.length; i++) {
            word[i]=scan.next();
        }

        // storing array values in single string.
        for (int i = 0; i < word.length; i++) {
            sentence += word[i];
        }
        System.out.println(""+sentence.length());
    }
}
