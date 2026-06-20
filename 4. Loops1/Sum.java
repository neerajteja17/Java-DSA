import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println("Sum is: " + sum);
        sc.close();
    }
}