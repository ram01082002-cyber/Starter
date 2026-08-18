public class p5 {
    public static void main(String[] args){
        int n =147;
        int o =n;
        int s =0;
        while(n!=0)
        {
            int d = n%10;
            s = s+(d*d*d);
            n = n/10;
        }
        if(s==o)
        System.out.println(s);
        else
        System.out.print("noo");    
    }  
}