import java.util.Scanner;

class Solution12 {
    public void pattern12(int N) {
        int num = 1;

        for(int i = 1; i <= N; i++){
            for(int j = 1; j <= i; j++) {
                System.out.print(num);
                num = num + 1;
            }
            System.out.println();
        }
    }
}

public class Pattern12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        Solution12 sol = new Solution12();
        sol.pattern12(N);
        sc.close();
    }
}