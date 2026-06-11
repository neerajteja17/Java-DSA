import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Length: ");
        int length = sc.nextInt();

        System.out.print("Enter the Breadth: ");
        int breadth = sc.nextInt();

        System.out.println("Area of Rectangle is: " + (length * breadth));
        sc.close();
    }
}