import java.util.Scanner;

public class samp {
    public static void main(String[] args)
    {
        Scanner w = new Scanner(System.in);
        int a = w.nextInt(); 
        int b = w.nextInt();
        int c = w.nextInt();
        int d = a+b+c;
        int e = a*b*c;  
        System.out.println(e/d);
    }
    
}
