import java.util.Scanner;

public class ANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Armstrong Number: ");
        int anumber = sc.nextInt();

        int sum = 0;
        int original = anumber;

        while( anumber != 0 ) {
            int digit = anumber % 10;
            sum = sum + (digit * digit * digit);
            anumber /= 10;
        }

        if( original == sum ){
            System.out.println(sum + " is a Armstrong Number");
        } else {
            System.out.println(sum + " is a not Armstrong Number");
        }
        sc.close();
    }
}