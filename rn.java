import java.util.Random;

public class rn {
    public static void main(String[] args)
    {
        Random r = new Random();
        int i = r.nextInt(5);
        if(i == 1)
        System.out.print(" "+i);
        else
            System.out.print( i + " Not match");
    }
    
}
