import java.util.Scanner;

public class SwappingWithThird {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         
         int temp;
         System.out.print("Enter digit a: ");
         int a = sc.nextInt();

         System.out.println("Enter digit b: ");
         int b = sc.nextInt();

         System.out.println("Before Swapping: ");
         System.out.println("a = " + a);
         System.out.println("b = " + b);

         temp = a;
         a = b;
         b = temp;

        System.out.println("After swapping: ");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        sc.close();
    }
}