import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Marks: ");
        double Marks = sc.nextDouble();

        if( Marks >= 91 ) {
            System.out.println("Grade: O");
        } else if( Marks >= 81 ) {
            System.out.println("Grade: A+");
        } else if( Marks >= 71 ) {
            System.out.println("Grade: A");
        } else if( Marks >= 61 ) {
            System.out.println("Grade: B+");
        } else if( Marks >= 56 ) {
            System.out.println("Grade: B");
        } else if( Marks >= 51 ) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Grade: F");
        }
        sc.close();
    }
}