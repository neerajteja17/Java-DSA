import java.util.Scanner;

class Solution4 {
    public void pattern4(int N) {
        for(int i = 1; i <= N; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}

public class Pattern4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        Solution4 sol = new Solution4();
        sol.pattern4(N);
        sc.close();
    }
}