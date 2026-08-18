import java.util.Scanner;

public class rci {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        while (n<=10)
        {
            int nn = (int)(Math.random()*10);
            char c = (char)('a'+(Math.random()*26));
            System.out.println(nn+" "+c);
            n++;
            
        }
    }
    
}
