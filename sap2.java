import java.util.Scanner;

public class sap2 {
    public static void main(String[] args)
    {
        Scanner nam = new Scanner(System.in);
        String na = nam.nextLine();
        double d = nam.nextDouble();
        nam.nextLine();
        String s = nam.nextLine();
        System.out.println("Name is :"+na);
        System.out.println("Marke is :"+d/10);
        System.out.println("Department is :"+s);
    }
    
}
