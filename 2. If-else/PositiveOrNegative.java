import java.util.Scanner;

public class PositiveOrNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number N: ");
        int N = sc.nextInt();

        if(N >= 0) {
            System.out.println("The number is Positive");
        } else {
            System.out.println("The number is Negative");
        }
        sc.close();
    }
}