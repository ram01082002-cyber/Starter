import java.util.Scanner;

public class funtn {
    void sum()
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println(n);  
        add();  
    }
    void add()
    {
        int a =1,b=22;
        System.out.println(a+b);
    }
    public static void main(String[] args) {
        funtn dem1 = new funtn();
        dem1.sum();
    }
    
}
