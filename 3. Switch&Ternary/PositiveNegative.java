import java.util.Scanner;

public class PositiveNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number: ");
        int Number = sc.nextInt();

        String result = ( Number >= 0 ) ? "Positive" : "Negative";
        System.out.println("Number  is: " + result);
        sc.close();
    }
}