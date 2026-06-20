import java.util.Scanner;

public class PNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Palindrome Number: ");
        int pnumber = sc.nextInt();

        int reverse = 0;
        int original = pnumber;

        while( pnumber != 0 ) {
            int digit = pnumber % 10;
            reverse = reverse * 10 + digit;
            pnumber /= 10;
        }

        if( original == reverse ){
            System.out.println(reverse + " is a Palindrome Number");
        } else {
            System.out.println(reverse + " is a not Palindrome Number");
        }
        sc.close();
    }
}