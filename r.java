import java.util.*;
public class r {
    public static void main(String[] args)
    {
        int odd = 0;
        int even = 0;
        for (int i=1; i<=25; i++)
        {
        if(i%2 == 0)
        {
            even = even+1;
            System.out.println(i);
        }
        else
        {
            odd = odd+1;
        }   
        } 
        System.out.println(odd);
        System.out.print(even);  
    }
}
