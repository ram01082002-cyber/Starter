import java.util.Scanner;

public class ods {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
         int c=0;
        for(int i=1;i<=n;i++)
        {
            int num = s.nextInt();
            if(num%2==0)
                c++;
        }
        System.out.print(c);
    }
    
}
