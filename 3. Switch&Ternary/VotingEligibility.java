import java.util.Scanner;

public class VotingEligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Age: ");
        int Age = sc.nextInt();

        String result = ( Age >= 18 ) ? "Eligible for Voting" : "Not Eligible for Voting";
        System.out.println(result);
        sc.close();
    }
}