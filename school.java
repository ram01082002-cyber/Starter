import java.util.*;
public class school {
    String pf(int mrk)
    {
        if(mrk>35)
        return "pass"; 
    else
        return "fail";
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        school ob = new school();
        String r =ob.pf(n);
        System.out.print(r);


    }
    
}
