import java.util.Scanner;

public class Voting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Voter's Age: ");
        int age = sc.nextInt();

        if( age >= 18 ) {
            System.out.println("The Person is Eligible for Voting");
        } else {
            System.out.println("The Person is not Eligible for Voting");
        }
        sc.close();
    }
}