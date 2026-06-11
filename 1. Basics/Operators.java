import java.util.Scanner;

public class Operators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a:");
        int a = sc.nextInt();

        System.out.print("Enter b:");
        int b = sc.nextInt();

        System.out.println(" Sum is " + (a+b));
        System.out.println(" Substraction is " + (a-b));
        System.out.println(" Multiplication is " + (a*b));
        System.out.println(" Division is " + (a/b));
        System.out.println(" Modulus is " + (a%b));

        sc.close();
    }
}