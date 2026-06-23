import java.util.Scanner;

class Solution3 {
    public void pattern3(int N) {
        for(int i = 1; i <= N; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}

public class Pattern3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        Solution3 sol = new Solution3();
        sol.pattern3(N);
        sc.close();
    }
}