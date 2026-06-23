import java.util.Scanner;

class Solution13 {
    public void pattern13(int N) {
        for (int i = 0; i < N; i++) {
            for (char ch = 'A'; ch <= 'A' + i; ch++) {
                System.out.print(ch);
            }
            System.out.println();
        }
    }
}

public class Pattern13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        Solution13 sol = new Solution13();
        sol.pattern13(N);
        sc.close();
    }
}