import java.util.*;
public class zpract {
    void od(int n)
    {
        System.out.print((n%2==0)?"even":"odd");
    }
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        zpract ob = new zpract();
        ob.od(num);

    }
    
}
