import java.util.Scanner;

public class GradeSystem {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Grade: ");
        String Grade = sc.next();

        switch(Grade){
            case "O":
                System.out.println("Outstanding");
                break;
            case "A":
                System.out.println("Excellent");
                break;
            case "B":
                System.out.println("Good");
                break;
            case "C":
                System.out.println("Average");
                break;
            case "F":
                System.out.println("Fail");
                break;
            default:
                System.out.println("Invalid GRADE");
        }
        sc.close();
    }
}