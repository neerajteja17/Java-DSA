import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int Number = sc.nextInt();

        String result = ( Number % 2 == 0 ) ? "Even" : "Odd";
        System.out.println("Number is: " + result);
        sc.close();
    }
}