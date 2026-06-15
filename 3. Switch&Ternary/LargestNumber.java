import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the A: ");
        int A = sc.nextInt();
        System.out.print("Enter the B: ");
        int B = sc.nextInt();

        String result = ( A > B ) ? "A is Largest Number" : "B is Largest Number";
        System.out.println(result);
        sc.close();
    }
}