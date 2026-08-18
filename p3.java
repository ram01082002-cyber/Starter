public class p3 {
    public static void main(String[] args)
    {
        int num =11011  ;
        int o = num; 
        int r=0;
        while(num!=0)
        {
            int d =num%10;
            r =r*10+d;
            num =num/10;}
            if(o==r)
            System.out.print(r);
            else
                System.out.print("no");
    }
    
}
  