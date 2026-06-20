import java.util.Scanner;

public class ProductOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number: ");
        int number = sc.nextInt();

        int product = 1;
        while( number != 0 ) {
            int digit = number % 10;
            product = product * digit;
            number /= 10;
        }
        System.out.println(product);
        sc.close();
    }
}