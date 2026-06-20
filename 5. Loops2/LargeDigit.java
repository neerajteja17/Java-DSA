import java.util.Scanner;

public class LargeDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int largest = 0;

        System.out.println("Enter the Number: ");
        int number = sc.nextInt();

        while( number != 0 ) {
            int digit = number % 10;

            if ( digit > largest ){
            largest = digit;
            }

            number /= 10;
        }
        System.out.println(largest);
        sc.close();
    }
}