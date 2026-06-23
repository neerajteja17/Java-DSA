import java.util.Scanner;

class Solution11 {
    public void pattern11(int N) {
        int start;
        for(int i = 1; i <= N; i++){
            if(i % 2 == 0) start = 1;
            else start = 0;

        for(int j = 1; j <= i; j++) {
            System.out.print(start);
            start = 1 - start;
        }
            System.out.println();
        }
    }
}

public class Pattern11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        Solution11 sol = new Solution11();
        sol.pattern11(N);
        sc.close();
    }
}