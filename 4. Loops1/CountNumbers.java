import java.util.Scanner;

public class CountNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number: ");
        int number = sc.nextInt();

        int count = 0;
        for(; number != 0; number = number / 10) {
            count ++;
        }
        System.out.println(count);
        sc.close();
    }
}