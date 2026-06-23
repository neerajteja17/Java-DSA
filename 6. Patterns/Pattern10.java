import java.util.Scanner;

class Solution10 {
    public void erectpattern(int N) {
        for(int i = 1; i <= N; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void invertpattern(int N) {
        for(int i = N; i >= 1; i--) {
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

public class Pattern10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();

        Solution10 sol = new Solution10();
        sol.erectpattern(N);
        sol.invertpattern(N);
        sc.close();
    }
}