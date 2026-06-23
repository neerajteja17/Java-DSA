import java.util.Scanner;

class Solution15 {
    public void pattern15(int N) {
        for(int i = 0; i < N; i++) {
            char ch = (char)('A' + i);

            for(int j = 0; j <= i; j++) {
                System.out.print(ch);
            }
            System.out.println();
        }
    }
}

public class Pattern15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        Solution15 sol = new Solution15();
        sol.pattern15(N);
        sc.close();
    }
}