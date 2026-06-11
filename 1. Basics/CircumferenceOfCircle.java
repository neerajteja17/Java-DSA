import java.util.Scanner;

public class CircumferenceOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Radius of circle: ");
        double radius = sc.nextDouble();
        
        System.out.println("Circumference of circle is: " + (2 * 3.14 * radius));
        sc.close();
    }
}