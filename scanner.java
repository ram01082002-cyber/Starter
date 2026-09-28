import java.util.Scanner;

public class scanner {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] m = new int[n];
        for(int i=1; i<=n;i++)
        System.out.println(i);   
    }   
}