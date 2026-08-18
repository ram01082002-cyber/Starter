import java.util.Scanner;

public class forarray {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int[] mak = new int[5];
        for(int i=0; i<=4; i++)
        {
            mak[i] = s.nextInt();
        }
         for(int i=0; i<=4; i++)
        {
        System.out.println(mak[i]);
        }
    }

    
}
