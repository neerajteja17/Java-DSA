import java.util.Scanner;

class Solution8 {
    public void pattern8(int N) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * (N - i) - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

public class Pattern8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        Solution8 sol = new Solution8();
        sol.pattern8(N);
        sc.close();
    }
}