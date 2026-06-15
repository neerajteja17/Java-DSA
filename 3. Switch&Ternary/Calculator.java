import java.util.Scanner;

public class Calculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number A: ");
        int A = sc.nextInt();

        System.out.print("Enter the Number B: ");
        int B = sc.nextInt();

        System.out.print("Enter Operation: ");
        char n = sc.next().charAt(0);

        switch(n){
            case '+':
                System.out.println( A + B );
                break;
            case '-':
                System.out.println( A - B );
                break;
            case '*':
                System.out.println( A * B );
                break;
            case '/':
                System.out.println( A / B );
                break;
            case '%':
                System.out.println( A % B );
                break;
            default:
                System.out.println("Invalid OPERATION");
        }
        sc.close();
    }
}