import java.util.Scanner;

public class p4_2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        int t =a;
        a=b;
        b=c;
        c=t;
        System.out.println(a+" "+b+" "+c);

    }
    
}
