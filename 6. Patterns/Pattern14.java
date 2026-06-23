import java.util.Scanner;

class Solution14 {
    public void pattern14(int N) {
        for (int i = N; i > 0; i--) {
            for (char ch = 'A'; ch <= 'A' + i; ch++) {
                System.out.print(ch);
            }
            System.out.println();
        }
    }
}

public class Pattern14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        Solution14 sol = new Solution14();
        sol.pattern14(N);
        sc.close();
    }
}