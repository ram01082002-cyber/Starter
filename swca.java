import java.util.Scanner;

public class swca {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        switch (n) {
            case 1:
            System.out.println("Sunday");
            break;
            case 2:
            System.out.println("Monday");
            break;
            case 3:
            System.out.println("Tusday");
            break;
            case 4:
            System.out.println("wenesday");
            break;
            case 5:
            System.out.println("Thusday");
            break;
            case 6:
            System.out.println("Friday");
            break;
            case 7:
            System.out.println("Saterday");
            break;
            default:
                System.out.print("Null");
                break;
        }
    }
    
}
