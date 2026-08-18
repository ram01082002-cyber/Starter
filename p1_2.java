import java.util.Scanner;

public class p1_2 {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int a = 0; 
        for(int i=2; i<=n; i++)
        {
            int c = 0;
            for(int j=1; j<=n; j++)
            {
                if(i%j==0)
                c++;
            }
              if(c==2){
                a++;
            System.out.println(i); }  
        } System.out.println(a); 
    }
    
}
