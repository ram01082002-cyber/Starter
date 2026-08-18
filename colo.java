import java.util.*;
public class colo {
    public static void main(String[] args)
    {
        Scanner sca = new Scanner(System.in);
        String s = sca.nextLine();
        if(s.equals("red") || s.equals("blue"))
            System.out.print("STOP");
        else if(s.equals("yellow"))
            System.out.print("redy");
        else
            System.out.print("gooo");


    }
    
}
