import java.util.*;
public class qq {
    public static void main(String[] args)
    {
        Scanner sca = new Scanner(System.in);
        int m1 = sca.nextInt();
        int m2 = sca.nextInt();
        int m3 = sca.nextInt();
        int m4 = sca.nextInt();
        int m5 = sca.nextInt();
        int total;
        int avg;
        System.out.println("Mark 1 : ");
        System.out.println("Mark 2 : ");
        System.out.println("Mark 3 : ");
        System.out.println("Mark 4 : ");
        System.out.println("Mark 5 : ");
        System.out.println(total = m1+m2+m3+m4+m5);
        System.out.println(avg=total/5);
        if(avg<35)
        System.out.print("prak"); 
        else
        System.out.print("good");


     
    }
    
}
