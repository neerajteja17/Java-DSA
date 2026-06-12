import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Year: ");
        int Year = sc.nextInt();

        if(( Year % 400 == 0 ) || ( Year % 4 == 0 && Year % 100 != 0 )) {
            System.out.println(" The " + Year + " is Leap Year");
        } else {
            System.out.println(" The " + Year + " is not a Leap Year");
        }
        sc.close();
    }
}