import java.util.Random;

public class randomnum {
    public static void main(String[] args)
    {
        Random r = new Random();
        int n = r.nextInt(2);
        for(int i=1; i<=100; i++)
        {
        System.out.println(i);
        }

    }
    
}
