import java.util.Scanner;

class Solution5 {
    public void pattern5(int N) {
        for(int i = N; i >= 1; i--) {
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

public class Pattern5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();

        Solution5 sol = new Solution5();
        sol.pattern5(N);
        sc.close();
    }
}