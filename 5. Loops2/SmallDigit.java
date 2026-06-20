import java.util.Scanner;

public class SmallDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int smallest = 9;

        System.out.println("Enter the Number: ");
        int number = sc.nextInt();

        while( number != 0 ) {
            int digit = number % 10;

            if ( digit < smallest ){
            smallest = digit;
            }

            number /= 10;
        }
        System.out.println(smallest);
        sc.close();
    }
}