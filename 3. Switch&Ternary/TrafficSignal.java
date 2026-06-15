import java.util.Scanner;

public class TrafficSignal {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Traffic Signal: ");
        String Signal = sc.next();

        switch(Signal){
            case "R":
                System.out.println("STOP");
                break;
            case "Y":
                System.out.println("READY");
                break;
            case "G":
                System.out.println("GO");
                break;
            default:
                System.out.println("Invalid SIGNAL");
        }
        sc.close();
    }
}