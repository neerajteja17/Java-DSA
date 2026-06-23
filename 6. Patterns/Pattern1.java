import java.util.Scanner;

class Solution1 {
    public void pattern1(int N) {
        for(int i = 1; i <= N; i++) {
            for(int j = 1; j <= N; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

public class Pattern1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        Solution1 sol = new Solution1();
        sol.pattern1(N);
        sc.close();
    }
}