import java.util.Scanner;

public class MenuDriven {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number: ");
        int Number = sc.nextInt();

        switch(Number){
            case 1:
                System.out.println("Add Student");
                break;
            case 2:
                System.out.println("Delete Student");
                break;
            case 3:
                System.out.println("Update Student");
                break;
            case 4:
                System.out.println("Exit");
                break;
            default:
                System.out.println("Invalid NUMBER to Add");
        }
        sc.close();
    }
}