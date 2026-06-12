import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Alphabet: ");
        char ch = sc.next().charAt(0);

        if( ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' ) {
            System.out.println(ch + " is a Vowel");
        } else {
            System.out.println( ch + " is a Consonant");
        }
        sc.close();
    }
}